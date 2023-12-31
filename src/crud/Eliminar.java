/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soporte
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConsultas = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnBuscar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar registro");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Eliminar registros MySQL Java");

        jMenuBar1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(0, 255, 0));
        jMenu1.setText("Menú");

        menuConsultas.setBackground(new java.awt.Color(0, 0, 0));
        menuConsultas.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuConsultas.setForeground(new java.awt.Color(0, 255, 0));
        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsultas);

        menuInsertar.setBackground(new java.awt.Color(0, 0, 0));
        menuInsertar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuInsertar.setForeground(new java.awt.Color(0, 255, 0));
        menuInsertar.setText("Insertar");
        menuInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarActionPerformed(evt);
            }
        });
        jMenu1.add(menuInsertar);

        menuActualizar.setBackground(new java.awt.Color(0, 0, 0));
        menuActualizar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuActualizar.setForeground(new java.awt.Color(0, 255, 0));
        menuActualizar.setText("Actualizar");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(menuActualizar);

        menuReportes.setBackground(new java.awt.Color(0, 0, 0));
        menuReportes.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuReportes.setForeground(new java.awt.Color(0, 255, 0));
        menuReportes.setText("Reportes");
        menuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportesActionPerformed(evt);
            }
        });
        jMenu1.add(menuReportes);

        menuSalir.setBackground(new java.awt.Color(0, 0, 0));
        menuSalir.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(0, 255, 0));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarActionPerformed
        Insertar insertar = new Insertar();
        insertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuInsertarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuReportesActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        Consultas consultas = new Consultas();
        consultas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(this,
        "¿Realmente desea salir de la aplicación?");
        // Si = 0, No = 1, Cancelar = 2
        System.out.println(respuesta);
        if(respuesta == 0){
            JOptionPane.showMessageDialog(this, 
            "Se cerrará la aplicación");
            System.exit(0);
        }else if(respuesta == 1){
            JOptionPane.showMessageDialog(this, 
            "No se cerrará la aplicación");
        }else{
             JOptionPane.showMessageDialog(this, 
            "Se canceló la operación");
        }
    }//GEN-LAST:event_menuSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        // Crear las variables
        int id;
        boolean datos = false;
        
        // Validaciones
        if(txtID.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Escriba un ID a buscar");
            return;
        }else{
            // Asignar valor a la variable
            try {
                id = Integer.parseInt(txtID.getText());
                
                if(id <= 0){
                    JOptionPane.showMessageDialog(this, "El ID ingresado no es valido");
                    limpiarID();
                    return;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this, "El ID ingresado no es valido");
                limpiarID();
                return;
            }
        }
        
        // Evaluar el texto del botón
        if(btnBuscar.getText() == "Eliminar"){
            // Ejecutar el código para eliminar
            try {
                Conexion conexion = new Conexion();
                Connection con = null;
                con = conexion.getConnection(host, usuario, contraseña, bd);
                
                PreparedStatement ps;
                ps = con.prepareStatement("DELETE FROM clientes WHERE idcliente = ?");
                ps.setInt(1, id);
                
                ps.execute();
                ps.close();
                con.close();
                
                JOptionPane.showMessageDialog(this,"Registro eliminado correctamente");
                txtID.setText("");
                btnBuscar.setText("Buscar registro");
                DefaultTableModel modelo = new DefaultTableModel();
                this.tabla.setModel(modelo);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }else{
            // Ejectutar el código para buscar
             try {

                // Instancia de la clase para acceder al metodo getConnection
                Conexion conexion = new Conexion();
                Connection con = null;
                con = conexion.getConnection(host, usuario, contraseña, bd);
                // Establecer un modelo para la JTable
                DefaultTableModel modelo = new DefaultTableModel();
                this.tabla.setModel(modelo);
                // Preparar la consulta
                PreparedStatement ps;
                ps = con.prepareStatement("SELECT * FROM clientes WHERE idcliente = ?");
                ps.setInt(1, id);
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
                    datos = true;
                    btnBuscar.setText("Eliminar");
                }
                rs.close();
                con.close();
                  
                // Apagar el autoajuste
                // this.tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                
                // Hacer visibles las lineas de la cuadricula
                this.tabla.setShowHorizontalLines(true);
                this.tabla.setShowVerticalLines(true);
                
                if(datos == false){
                    JOptionPane.showMessageDialog(this, "El ID ingresado no existe");
                }
                
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Error al generar la consulta: " + error);
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
        txtID.setText("");
        btnBuscar.setText("Buscar registro");
        DefaultTableModel modelo = new DefaultTableModel();
        this.tabla.setModel(modelo);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiarID() {
        txtID.setText("");
        txtID.requestFocus();
        DefaultTableModel modeloLimpio = new DefaultTableModel();
        this.tabla.setModel(modeloLimpio);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
