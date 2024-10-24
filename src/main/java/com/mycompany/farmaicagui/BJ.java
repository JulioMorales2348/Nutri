
package com.mycompany.farmaicagui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BJ extends javax.swing.JFrame {

    
    public BJ() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUSQUEDADEPASTILLASPANEL = new javax.swing.JPanel();
        TITULODEBUSQUEDABJ = new javax.swing.JLabel();
        BOXDEJARABES = new javax.swing.JComboBox<>();
        ELEGIR = new javax.swing.JButton();
        ATRAS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUSQUEDADEPASTILLASPANEL.setBackground(new java.awt.Color(255, 153, 153));

        TITULODEBUSQUEDABJ.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        TITULODEBUSQUEDABJ.setForeground(new java.awt.Color(0, 0, 0));
        TITULODEBUSQUEDABJ.setText("BUSQUEDA DE JARABES");

        BOXDEJARABES.setBackground(new java.awt.Color(255, 153, 153));
        BOXDEJARABES.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BOXDEJARABES.setForeground(new java.awt.Color(0, 0, 0));
        BOXDEJARABES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CODIGO DE BARRAS" }));
        BOXDEJARABES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXDEJARABESActionPerformed(evt);
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "LABORATORIO", "CODIGO DE BARRAS", "PRECIO", "MILILITROS", "VASO DOSIFICADOR"
            }
        ));
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout BUSQUEDADEPASTILLASPANELLayout = new javax.swing.GroupLayout(BUSQUEDADEPASTILLASPANEL);
        BUSQUEDADEPASTILLASPANEL.setLayout(BUSQUEDADEPASTILLASPANELLayout);
        BUSQUEDADEPASTILLASPANELLayout.setHorizontalGroup(
            BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGroup(BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(BOXDEJARABES, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(ELEGIR))
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGroup(BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(ATRAS))
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(TITULODEBUSQUEDABJ)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BUSQUEDADEPASTILLASPANELLayout.setVerticalGroup(
            BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TITULODEBUSQUEDABJ)
                .addGap(18, 18, 18)
                .addComponent(BOXDEJARABES, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ELEGIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ATRAS)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BUSQUEDADEPASTILLASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BUSQUEDADEPASTILLASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOXDEJARABESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXDEJARABESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOXDEJARABESActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        this.dispose();
    }//GEN-LAST:event_ATRASActionPerformed

    private void ELEGIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEGIRActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) TABLA.getModel();
    modelo.setRowCount(0); // Limpia la tabla

    int si = 0;
    int opc = BOXDEJARABES.getSelectedIndex();

    if (opc == 0) {
    String nom = JOptionPane.showInputDialog(null, "Coloca el nombre de las pastillas que quieres buscar");
    for (int i = 0; i < FarmaicaGUI.jarabes.size(); i++) {
        if (FarmaicaGUI.jarabes.get(i).getNombre().equals(nom)) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.jarabes.get(i).getNombre(),
                FarmaicaGUI.jarabes.get(i).getFabrica(),
                FarmaicaGUI.jarabes.get(i).getCodigo(),
                "$" + FarmaicaGUI.jarabes.get(i).getPrecio(),
                 FarmaicaGUI.jarabes.get(i).getMll(),
                FarmaicaGUI.jarabes.get(i).isVaso()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Jarabes no encontrados", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Jarabes encontrados", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
} else {
    int copc = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloca el código de los Jarabes que quieres encontrar"));
    for (int i = 0; i < FarmaicaGUI.jarabes.size(); i++) {
        if (FarmaicaGUI.jarabes.get(i).getCodigo() == copc) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.jarabes.get(i).getNombre(),
                FarmaicaGUI.jarabes.get(i).getFabrica(),
                FarmaicaGUI.jarabes.get(i).getCodigo(),
                "$" + FarmaicaGUI.jarabes.get(i).getPrecio(),
                FarmaicaGUI.jarabes.get(i).getMll(),
                FarmaicaGUI.jarabes.get(i).isVaso()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Jarabes no encontrados", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Jarabes encontrados", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_ELEGIRActionPerformed
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JComboBox<String> BOXDEJARABES;
    private javax.swing.JPanel BUSQUEDADEPASTILLASPANEL;
    private javax.swing.JButton ELEGIR;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel TITULODEBUSQUEDABJ;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
