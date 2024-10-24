
package com.mycompany.farmaicagui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDelogin = new javax.swing.JPanel();
        TITULO = new javax.swing.JLabel();
        UsuerLetrero1 = new javax.swing.JLabel();
        ContraseñaLetrero = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        CONTRASEÑA = new javax.swing.JPasswordField();
        INGRESAR = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDelogin.setBackground(new java.awt.Color(153, 255, 255));

        TITULO.setFont(new java.awt.Font("Comic Sans MS", 0, 80)); // NOI18N
        TITULO.setForeground(new java.awt.Color(0, 0, 0));
        TITULO.setText("VALUTRI");

        UsuerLetrero1.setBackground(new java.awt.Color(0, 204, 204));
        UsuerLetrero1.setFont(new java.awt.Font("Comic Sans MS", 0, 50)); // NOI18N
        UsuerLetrero1.setForeground(new java.awt.Color(0, 0, 0));
        UsuerLetrero1.setText("USUARIO: ");
        UsuerLetrero1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ContraseñaLetrero.setBackground(new java.awt.Color(0, 204, 204));
        ContraseñaLetrero.setFont(new java.awt.Font("Comic Sans MS", 0, 50)); // NOI18N
        ContraseñaLetrero.setForeground(new java.awt.Color(0, 0, 0));
        ContraseñaLetrero.setText("CONTRASEÑA:");
        ContraseñaLetrero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        User.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        CONTRASEÑA.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        CONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTRASEÑAActionPerformed(evt);
            }
        });

        INGRESAR.setBackground(new java.awt.Color(0, 153, 153));
        INGRESAR.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        INGRESAR.setForeground(new java.awt.Color(0, 0, 0));
        INGRESAR.setText("INGRESAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeloginLayout = new javax.swing.GroupLayout(PanelDelogin);
        PanelDelogin.setLayout(PanelDeloginLayout);
        PanelDeloginLayout.setHorizontalGroup(
            PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeloginLayout.createSequentialGroup()
                .addGap(694, 694, 694)
                .addComponent(TITULO)
                .addGap(0, 794, Short.MAX_VALUE))
            .addGroup(PanelDeloginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContraseñaLetrero)
                    .addComponent(UsuerLetrero1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CONTRASEÑA, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addComponent(User))
                .addGap(309, 309, 309))
            .addGroup(PanelDeloginLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        PanelDeloginLayout.setVerticalGroup(
            PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeloginLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(TITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuerLetrero1))
                .addGap(115, 115, 115)
                .addGroup(PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContraseñaLetrero)
                    .addComponent(CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(PanelDeloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDelogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDelogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        Menu menu = new Menu();
        String minombre = "Valeria";
        String mipassword = "1234";
        String usuario = User.getText();
        String pass = CONTRASEÑA.getText();
        if(minombre.equals(usuario)&&mipassword.equals(pass))
        {
            JOptionPane.showMessageDialog(null, "Acceso permitido","Seguridad", JOptionPane.INFORMATION_MESSAGE);
            menu.setVisible(true);
            this.dispose();
        }else
        JOptionPane.showMessageDialog(null, "Acceso no permitido","Seguridad",JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_INGRESARActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "AVISO", JOptionPane.YES_NO_OPTION);
       if(opc == 0){
           System.exit(0);
       }
       if(opc == 1){
           
       } 
    }//GEN-LAST:event_SalirActionPerformed

    private void CONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTRASEÑAActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRASEÑA;
    private javax.swing.JLabel ContraseñaLetrero;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JPanel PanelDelogin;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TITULO;
    private javax.swing.JTextField User;
    private javax.swing.JLabel UsuerLetrero1;
    // End of variables declaration//GEN-END:variables
}
