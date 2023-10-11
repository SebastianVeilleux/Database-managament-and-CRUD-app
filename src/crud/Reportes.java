package crud;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Reportes extends javax.swing.JFrame {

    public Reportes() {
        initComponents();
        
        // Enviar los iconos a los botones
        btnReporte1.setIcon(IconoNormal("/imagenes/1.png", btnReporte1));
        btnReporte2.setIcon(IconoNormal("/imagenes/2.png", btnReporte2));
        btnReporte3.setIcon(IconoNormal("/imagenes/3.png", btnReporte3));
        btnReporte4.setIcon(IconoNormal("/imagenes/4.png", btnReporte4));
        btnReporte5.setIcon(IconoNormal("/imagenes/5.png", btnReporte5));
        btnReporte6.setIcon(IconoNormal("/imagenes/6.png", btnReporte6));
        
        // Efecto de presionado de los botenes
        btnReporte1.setPressedIcon(IconoPresionado("/imagenes/1.png", btnReporte1));
        btnReporte2.setPressedIcon(IconoPresionado("/imagenes/2.png", btnReporte2));
        btnReporte3.setPressedIcon(IconoPresionado("/imagenes/3.png", btnReporte3));
        btnReporte4.setPressedIcon(IconoPresionado("/imagenes/4.png", btnReporte4));
        btnReporte5.setPressedIcon(IconoPresionado("/imagenes/5.png", btnReporte5));
        btnReporte6.setPressedIcon(IconoPresionado("/imagenes/6.png", btnReporte6));
        
        // Efecto del cursor Rollover
        btnReporte1.setRolloverIcon(IconoNormal("/imagenes/1bn.png", btnReporte1));
        btnReporte2.setRolloverIcon(IconoNormal("/imagenes/2bn.png", btnReporte2));
        btnReporte3.setRolloverIcon(IconoNormal("/imagenes/3bn.png", btnReporte3));
        btnReporte4.setRolloverIcon(IconoNormal("/imagenes/4bn.png", btnReporte4));
        btnReporte5.setRolloverIcon(IconoNormal("/imagenes/5bn.png", btnReporte5));
        btnReporte6.setRolloverIcon(IconoNormal("/imagenes/6bn.png", btnReporte6));
        
    }
    
    public Icon IconoNormal(String url, JButton boton){
    
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = boton.getWidth() - 10;
        int alto = boton.getHeight() - 10;
        
        ImageIcon icono = new ImageIcon(
        icon.getImage().getScaledInstance(
        ancho,alto,Image.SCALE_AREA_AVERAGING));
        
        return icono;
    }
   
   public Icon IconoPresionado(String url, JButton boton){
    
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = boton.getWidth() - 15;
        int alto = boton.getHeight() - 15;
        
        ImageIcon icono = new ImageIcon(
        icon.getImage().getScaledInstance(
        ancho,alto,Image.SCALE_AREA_AVERAGING));
        
        return icono;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReporte1 = new javax.swing.JButton();
        btnReporte2 = new javax.swing.JButton();
        btnReporte3 = new javax.swing.JButton();
        btnReporte4 = new javax.swing.JButton();
        btnReporte5 = new javax.swing.JButton();
        btnReporte6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConsultas = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnReporte1.setContentAreaFilled(false);
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });

        btnReporte2.setContentAreaFilled(false);
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
            }
        });

        btnReporte3.setContentAreaFilled(false);
        btnReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte3ActionPerformed(evt);
            }
        });

        btnReporte4.setContentAreaFilled(false);
        btnReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte4ActionPerformed(evt);
            }
        });

        btnReporte5.setContentAreaFilled(false);
        btnReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte5ActionPerformed(evt);
            }
        });

        btnReporte6.setContentAreaFilled(false);
        btnReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte6ActionPerformed(evt);
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

        menuInsertar.setBackground(new java.awt.Color(0, 0, 0));
        menuInsertar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        menuInsertar.setForeground(new java.awt.Color(0, 255, 0));
        menuInsertar.setText("Insertar");
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
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM clientes");
    }//GEN-LAST:event_btnReporte1ActionPerformed

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM tarjetas_credito");
    }//GEN-LAST:event_btnReporte2ActionPerformed

    private void btnReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte3ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM terminales");
    }//GEN-LAST:event_btnReporte3ActionPerformed

    private void btnReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte4ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM cajeros");
    }//GEN-LAST:event_btnReporte4ActionPerformed

    private void btnReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte5ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM tarjetas_credito");
    }//GEN-LAST:event_btnReporte5ActionPerformed

    private void btnReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte6ActionPerformed
       Reporteador r = new Reporteador();
       r.generarReporte("SELECT * FROM tarjetas_debito");
    }//GEN-LAST:event_btnReporte6ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte1;
    private javax.swing.JButton btnReporte2;
    private javax.swing.JButton btnReporte3;
    private javax.swing.JButton btnReporte4;
    private javax.swing.JButton btnReporte5;
    private javax.swing.JButton btnReporte6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuInsertar;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
