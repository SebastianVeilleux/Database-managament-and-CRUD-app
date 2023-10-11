package crud;

import static crud.Conexion.bd;
import static crud.Conexion.contraseña;
import static crud.Conexion.host;
import static crud.Conexion.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Reporteador {

    public void generarReporte(String consulta) {
        try {

            // Instancia de la clase para acceder al metodo getConnection
            Conexion conexion = new Conexion();
            Connection con = null;
            con = conexion.getConnection(host, usuario, contraseña, bd);
            // Establecer un modelo para la JTable
            DefaultTableModel modelo = new DefaultTableModel();
            // Crear un objeto de tipo JTable, que servirá de tabla imaginaria
            JTable tabla = new JTable();            
            tabla.setModel(modelo);
            // Preparar la consulta
            PreparedStatement ps;
            ps = con.prepareStatement(consulta);
            // Ejecutar la consulta
            ResultSet rs;
            rs = ps.executeQuery();
            // Obtener la información de las columnas que se estan consultado
            ResultSetMetaData rsmd;
            rsmd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas;
            cantidadColumnas = rsmd.getColumnCount();
            // Establecer el nombre de los campos en la JTable del nombre de las columnas de la tabla MySQL
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            // Crear las filas para la JTable
            while (rs.next()) {

                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            rs.close();
            con.close();
            
            // Exportar
            Exportar exportar = new Exportar();
            exportar.exportarArchivo(tabla);
                    
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Error al generar la consulta: " + error);
        }
    }

}
