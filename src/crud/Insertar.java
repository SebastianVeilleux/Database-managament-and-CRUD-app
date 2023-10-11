package crud;

import static crud.Conexion.bd;
import static crud.Conexion.contraseña;
import static crud.Conexion.host;
import static crud.Conexion.usuario;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Insertar extends javax.swing.JFrame {

    // Instancia de la Clase Conexion
    Conexion conexion = new Conexion();
    
    public Insertar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConsultas = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Insertar registros MySQL Java");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Paterno:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Materno:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("ID:");

        txtPaterno.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        txtMaterno.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Correo:");

        lbID.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        lbID.setForeground(new java.awt.Color(0, 255, 0));
        lbID.setText("...");

        btnInsertar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
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
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(txtCorreo)
                                    .addComponent(lbID)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActualizarActionPerformed

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

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // Crear variables para guardar los datos de las cajas de texto
        String paterno;
        String materno;
        String nombre;
        String telefono;
        String correo;
        String nombreCompleto;
        long numeroTel;
        
        // Envías los valores a las variables
        paterno = txtPaterno.getText().toUpperCase();
        materno = txtMaterno.getText().toUpperCase();
        nombre = txtNombre.getText().toUpperCase();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText().toLowerCase();
        
        
        
        // Validar que las cajas tengan texto
        // operador "or" || "and" &&
        if(paterno.length() == 0 || materno.length() == 0 ||
           nombre.length() == 0 || telefono.length() == 0 ||
           correo.length() == 0){
           
           JOptionPane.showMessageDialog(this, 
           "Hay campos vacios favor de corroborar");
           return;
           
        }else{
            // Validar que el nombre no contenga numeros
            nombreCompleto = paterno + materno + nombre;
            if(nombreCompleto.contains("0") || nombreCompleto.contains("1") ||
               nombreCompleto.contains("2") || nombreCompleto.contains("3") ||
               nombreCompleto.contains("4") || nombreCompleto.contains("5") ||
               nombreCompleto.contains("6") || nombreCompleto.contains("7") ||
               nombreCompleto.contains("8") || nombreCompleto.contains("9")){
            
               JOptionPane.showMessageDialog(this, "El nombre no puede contener numeros");
               return;
                
            }
        }

        // Validar que el telefono sea de 10 digitos
        if (telefono.length() != 10) {
            JOptionPane.showMessageDialog(this,
                    "El teléfono debe ser de 10 dígitos");
            return;
        } else {
            // Validar que el telefono solo contenga numeros
            try {
                numeroTel = Long.parseLong(telefono);
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(this,
                "El teléfono no puede contener letras" + n);
                return;
            }
        }
        
        // Validar que el correo tenga una @ y punto
        if(!correo.contains("@") && !correo.contains(".")){
            JOptionPane.showMessageDialog(this, 
            "El correo no contiene un dominio valido");
            return;
        }
        
        // Código para aplicar el INSERT
        try {
            // Crear la conexion
            Connection con = conexion.getConnection(host, usuario, contraseña, bd);
            // Preparar la consulta
            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes (paterno,materno,nombre,telefono,correo) VALUES (?,?,?,?,?)");
            ps.setString(1, paterno);
            ps.setString(2, materno);
            ps.setString(3, nombre);
            ps.setString(4, telefono);
            ps.setString(5, correo);
            
            ps.executeUpdate();
            
            // Mandar llamar el ID registrado
            PreparedStatement psid = con.prepareStatement("SELECT idcliente FROM clientes ORDER BY idcliente DESC LIMIT 1");
            ResultSet rsid = psid.executeQuery();
            
            Object[] id = new Object[1];
            while(rsid.next()){
                id[0] = rsid.getObject(1);
                lbID.setText(String.valueOf(id[0]));
            }
            
            ps.close();
            psid.close();
            con.close();
            
            JOptionPane.showMessageDialog(this, "Registro aplicado correctamente");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        lbID.setText("");        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbID;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuReportes;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
