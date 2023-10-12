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

public class Actualizar extends javax.swing.JFrame {

    public Actualizar() {
        initComponents();
        bloquear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConsultas = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Nombre:");

        btnBuscar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Teléfono:");

        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("ID:");

        txtPaterno.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtPaterno.setEnabled(false);

        txtMaterno.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtMaterno.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtNombre.setEnabled(false);

        txtCorreo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Actualizar registros MySQL Java");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Correo:");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Paterno:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Materno:");

        txtID.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

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

        menuEliminar.setBackground(new java.awt.Color(0, 0, 0));
        menuEliminar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuEliminar.setForeground(new java.awt.Color(0, 255, 0));
        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(menuEliminar);

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
                        .addGap(96, 96, 96)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTelefono)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarActionPerformed
        Insertar insertar = new Insertar();
        insertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuInsertarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEliminarActionPerformed

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
        // Creamos las variables
        int idcliente = 0;
        String paterno;
        String materno;
        String nombre;
        String telefono;
        String correo;
        boolean datos = false;
        
        // Validación de que el id ingresado sea un número
        try{
            idcliente = Integer.parseInt(txtID.getText());
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null,"El valor ingresado tiene formato incorrecto: "
            + error);
            return;
        }
        
        // Evaluar que texto esta escrito en el btnBuscar
        if (btnBuscar.getText() == "Actualizar") {
            // Código para actualizar
            // Guardamos el telefono y el correo
            
            try {

                telefono = txtTelefono.getText();
                correo = txtCorreo.getText();

                Conexion conexion = new Conexion();
                Connection con = null;
                con = conexion.getConnection(host, usuario, contraseña, bd);

                PreparedStatement ps;
                ps = con.prepareStatement("UPDATE clientes SET telefono = ?, correo = ? WHERE idcliente = ?");
                ps.setString(1,telefono);
                ps.setString(2,correo);
                ps.setInt(3,idcliente);
                
                ps.executeUpdate();
                ps.close();
                con.close();
                JOptionPane.showMessageDialog(null,"Se actualizaron los datos del cliente con ID " + idcliente);

                limpiar();

                bloquear();
                
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,"Error al actualizar los datos del cliente: " + error);
            }

        }else{
            // Código para buscar
            if(idcliente <= 0){
                JOptionPane.showMessageDialog(null,"Numéro ID incorrecto");
                return;
            }else{
                // Ejecutar algoritmo de busqueda
                try{
                    Conexion conexion = new Conexion();
                    Connection con = null;
                    con = conexion.getConnection(host,usuario,contraseña,bd);
                    
                    DefaultTableModel modelo = new DefaultTableModel();
                    JTable tabla = new JTable();
                    tabla.setModel(modelo);
                    
                    PreparedStatement ps;
                    ps = con.prepareStatement("SELECT * FROM clientes WHERE idcliente = ?");
                    ps.setInt(1,idcliente);
                    
                    ResultSet rs;
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsmd;
                    rsmd = (ResultSetMetaData) rs.getMetaData(); 
                    int cantidadColumnas;
                    cantidadColumnas = rsmd.getColumnCount();
                    
                    while(rs.next()){
                        
                        Object[] fila = new Object[cantidadColumnas];
                        for(int i = 0; i < cantidadColumnas; i++){
                            fila[i] = rs.getObject(i+1);
                        }
                        modelo.addRow(fila);
                        
                        paterno = (String) fila[1];
                        materno = (String) fila[2];
                        nombre = (String) fila[3];
                        telefono = (String) fila[4];
                        correo = (String) fila[5];
                        
                        txtPaterno.setText(paterno);
                        txtMaterno.setText(materno);
                        txtNombre.setText(nombre);
                        txtTelefono.setText(telefono);
                        txtCorreo.setText(correo);
                    
                        JOptionPane.showMessageDialog(null, "Consulta exitosa");
                        btnBuscar.setText("Actualizar");
                        datos = true;

                        desbloquear();
                        
                    }
                    
                    rs.close();
                    con.close();
                    
                    if(datos==false){
                        JOptionPane.showMessageDialog(null, "El ID ingresado no existe");
                    }
                        
                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Error al buscar los datos: " + error);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiar() {
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtID.setText("");

        btnBuscar.setText("Buscar");
    }
    
    public void desbloquear() {
        txtTelefono.setEnabled(true);
        txtCorreo.setEnabled(true);
    }
    
    public void bloquear() {
        txtTelefono.setEnabled(false);
        txtCorreo.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
