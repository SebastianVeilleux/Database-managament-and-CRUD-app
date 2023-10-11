package crud;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exportar {

    // manipulación del archivo exportado
    public void abrirArchivo(String archivo) {
        try {
            File ruta = new File(archivo);
            Desktop.getDesktop().open(ruta);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    //exportación
    public void exportarArchivo(JTable tabla) {

        try {

            JFileChooser seleccionador = new JFileChooser();
            seleccionador.showSaveDialog(tabla);
            File archivo = seleccionador.getSelectedFile();

            if (archivo != null) {

                archivo = new File(archivo.toString() + ".xlsx");
                Workbook libro = new XSSFWorkbook();
                Sheet hoja = libro.createSheet("Hoja1");
                
                Row etiqueta = hoja.createRow(0);
                
                for(int campo=0; campo < tabla.getColumnCount(); campo++){
                    Cell celda = etiqueta.createCell(campo);
                    celda.setCellValue(tabla.getColumnName(campo));
                }
                
                for(int f=0; f < tabla.getRowCount(); f++){
                
                    Row fila = hoja.createRow(f + 1);
                    
                    for(int c=0; c < tabla.getColumnCount(); c++){
                    
                        Cell celda = fila.createCell(c);
                        
                        if(tabla.getValueAt(f, c) != null){
                            celda.setCellValue(tabla.getValueAt(f, c).toString());
                        }
                        
                    }
                    
                }
                
                FileOutputStream salida;
                salida = new FileOutputStream(new File(archivo.toString()));
                libro.write(salida);
               
                
                salida.close();
                
               
                // Mandar llamar el metodo abrirArchivo
                abrirArchivo(archivo.toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al generar el archivo");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de exportación: " + e);
        }
    }

}
