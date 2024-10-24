
package com.mycompany.farmaicagui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BPO extends javax.swing.JFrame {

    
    public BPO() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUSQUEDADEPOMADASPANEL = new javax.swing.JPanel();
        TITULODEBUSQUEDABPOI = new javax.swing.JLabel();
        BOXDEPOMADAS = new javax.swing.JComboBox<>();
        ELEGIR = new javax.swing.JButton();
        ATRAS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUSQUEDADEPOMADASPANEL.setBackground(new java.awt.Color(255, 153, 153));

        TITULODEBUSQUEDABPOI.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        TITULODEBUSQUEDABPOI.setForeground(new java.awt.Color(0, 0, 0));
        TITULODEBUSQUEDABPOI.setText("BUSQUEDA DE POMADAS");

        BOXDEPOMADAS.setBackground(new java.awt.Color(255, 153, 153));
        BOXDEPOMADAS.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BOXDEPOMADAS.setForeground(new java.awt.Color(0, 0, 0));
        BOXDEPOMADAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CODIGO DE BARRAS" }));
        BOXDEPOMADAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXDEPOMADASActionPerformed(evt);
            }
        });

        ELEGIR.setBackground(new java.awt.Color(255, 153, 153));
        ELEGIR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ELEGIR.setForeground(new java.awt.Color(0, 0, 0));
        ELEGIR.setText("ELEGIR");
        ELEGIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELEGIRActionPerformed(evt);
            }
        });

        ATRAS.setBackground(new java.awt.Color(255, 153, 204));
        ATRAS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ATRAS.setForeground(new java.awt.Color(0, 0, 0));
        ATRAS.setText("<---");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });

        TABLA.setBackground(new java.awt.Color(255, 153, 153));
        TABLA.setForeground(new java.awt.Color(0, 0, 0));
        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "LABORATORIO", "CODIGO DE BARRAS", "PRECIO", "GRAMOS"
            }
        ));
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout BUSQUEDADEPOMADASPANELLayout = new javax.swing.GroupLayout(BUSQUEDADEPOMADASPANEL);
        BUSQUEDADEPOMADASPANEL.setLayout(BUSQUEDADEPOMADASPANELLayout);
        BUSQUEDADEPOMADASPANELLayout.setHorizontalGroup(
            BUSQUEDADEPOMADASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(TITULODEBUSQUEDABPOI)
                .addGap(187, 187, 187))
            .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(ATRAS)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                .addGroup(BUSQUEDADEPOMADASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(BOXDEPOMADAS, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(ELEGIR))
                    .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BUSQUEDADEPOMADASPANELLayout.setVerticalGroup(
            BUSQUEDADEPOMADASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUSQUEDADEPOMADASPANELLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TITULODEBUSQUEDABPOI)
                .addGap(18, 18, 18)
                .addComponent(BOXDEPOMADAS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ELEGIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ATRAS)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BUSQUEDADEPOMADASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BUSQUEDADEPOMADASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOXDEPOMADASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXDEPOMADASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOXDEPOMADASActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        this.dispose();
    }//GEN-LAST:event_ATRASActionPerformed

    private void ELEGIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEGIRActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) TABLA.getModel();
    modelo.setRowCount(0); // Limpia la tabla

    int si = 0;
    int opc = BOXDEPOMADAS.getSelectedIndex();

    if (opc == 0) {
    String nom = JOptionPane.showInputDialog(null, "Coloca el nombre de las pomadas que quieres buscar");
    for (int i = 0; i < FarmaicaGUI.pomadas.size(); i++) {
        if (FarmaicaGUI.pomadas.get(i).getNombre().equals(nom)) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.pomadas.get(i).getNombre(),
                FarmaicaGUI.pomadas.get(i).getFabrica(),
                FarmaicaGUI.pomadas.get(i).getCodigo(),
                "$" + FarmaicaGUI.pomadas.get(i).getPrecio(),
                FarmaicaGUI.pomadas.get(i).getGramos()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Pomadas no encontradas", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Pomadas encontradas", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
} else {
    int copc = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloca el código de las pomadas que quieres encontrar"));
    for (int i = 0; i < FarmaicaGUI.pomadas.size(); i++) {
        if (FarmaicaGUI.pomadas.get(i).getCodigo() == copc) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.pomadas.get(i).getNombre(),
                FarmaicaGUI.pomadas.get(i).getFabrica(),
                FarmaicaGUI.pomadas.get(i).getCodigo(),
                "$" + FarmaicaGUI.pomadas.get(i).getPrecio(),
                FarmaicaGUI.pomadas.get(i).getGramos()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Pomadas no encontradas", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Pomadas encontradas", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_ELEGIRActionPerformed
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JComboBox<String> BOXDEPOMADAS;
    private javax.swing.JPanel BUSQUEDADEPOMADASPANEL;
    private javax.swing.JButton ELEGIR;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel TITULODEBUSQUEDABPOI;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
