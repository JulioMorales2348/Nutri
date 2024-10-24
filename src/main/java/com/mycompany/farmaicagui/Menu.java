
package com.mycompany.farmaicagui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANELDEMENU = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PASTILLAS = new javax.swing.JButton();
        JARABE = new javax.swing.JButton();
        POMADAS = new javax.swing.JButton();
        AUTOR = new javax.swing.JButton();
        Salir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANELDEMENU.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(202, 143, 241));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENÚ PRINCIPAL");

        PASTILLAS.setBackground(new java.awt.Color(102, 204, 255));
        PASTILLAS.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        PASTILLAS.setForeground(new java.awt.Color(0, 0, 0));
        PASTILLAS.setText("PACIENTES");
        PASTILLAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASTILLASActionPerformed(evt);
            }
        });

        JARABE.setBackground(new java.awt.Color(102, 204, 255));
        JARABE.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        JARABE.setForeground(new java.awt.Color(0, 0, 0));
        JARABE.setText("DIETAS");
        JARABE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JARABEActionPerformed(evt);
            }
        });

        POMADAS.setBackground(new java.awt.Color(102, 204, 255));
        POMADAS.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        POMADAS.setForeground(new java.awt.Color(0, 0, 0));
        POMADAS.setText("ALIMENTOS");
        POMADAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POMADASActionPerformed(evt);
            }
        });

        AUTOR.setBackground(new java.awt.Color(102, 153, 255));
        AUTOR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        AUTOR.setForeground(new java.awt.Color(0, 0, 0));
        AUTOR.setText("Información");
        AUTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUTORActionPerformed(evt);
            }
        });

        Salir2.setBackground(new java.awt.Color(255, 51, 51));
        Salir2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Salir2.setForeground(new java.awt.Color(0, 0, 0));
        Salir2.setText("SALIR");
        Salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELDEMENULayout = new javax.swing.GroupLayout(PANELDEMENU);
        PANELDEMENU.setLayout(PANELDEMENULayout);
        PANELDEMENULayout.setHorizontalGroup(
            PANELDEMENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEMENULayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(AUTOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir2)
                .addGap(46, 46, 46))
            .addGroup(PANELDEMENULayout.createSequentialGroup()
                .addGap(769, 769, 769)
                .addComponent(jLabel1)
                .addContainerGap(773, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELDEMENULayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PANELDEMENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JARABE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PANELDEMENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PASTILLAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(POMADAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(863, 863, 863))
        );
        PANELDEMENULayout.setVerticalGroup(
            PANELDEMENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEMENULayout.createSequentialGroup()
                .addGap(197, 957, Short.MAX_VALUE)
                .addGroup(PANELDEMENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir2)
                    .addComponent(AUTOR))
                .addGap(65, 65, 65))
            .addGroup(PANELDEMENULayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(PASTILLAS)
                .addGap(95, 95, 95)
                .addComponent(JARABE)
                .addGap(101, 101, 101)
                .addComponent(POMADAS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANELDEMENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANELDEMENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void POMADASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POMADASActionPerformed
       Menupomada mpo = new Menupomada();
       mpo.setVisible(true);
    }//GEN-LAST:event_POMADASActionPerformed

    private void JARABEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JARABEActionPerformed
       Menujarabe mj = new Menujarabe();
       mj.setVisible(true);
    }//GEN-LAST:event_JARABEActionPerformed

    private void AUTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUTORActionPerformed
    JOptionPane.showMessageDialog(null, "Valeria de Gante Ramírez","Nutrióloga",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AUTORActionPerformed

    private void Salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir2ActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "AVISO", JOptionPane.YES_NO_OPTION);
       if(opc == 0){
           System.exit(0);
       }
       if(opc == 1){   
       } 
    }//GEN-LAST:event_Salir2ActionPerformed

    private void PASTILLASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASTILLASActionPerformed
       Menupaciente mp = new Menupaciente();
       mp.setVisible(true);
    }//GEN-LAST:event_PASTILLASActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUTOR;
    private javax.swing.JButton JARABE;
    private javax.swing.JPanel PANELDEMENU;
    private javax.swing.JButton PASTILLAS;
    private javax.swing.JButton POMADAS;
    private javax.swing.JButton Salir2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
