
package com.mycompany.farmaicagui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BP extends javax.swing.JFrame {

    
    public BP() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUSQUEDADEPASTILLASPANEL = new javax.swing.JPanel();
        TITULODEBUSQUEDABP = new javax.swing.JLabel();
        BOXDEPASTILLAS = new javax.swing.JComboBox<>();
        ELEGIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        ATRAS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUSQUEDADEPASTILLASPANEL.setBackground(new java.awt.Color(255, 153, 153));

        TITULODEBUSQUEDABP.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        TITULODEBUSQUEDABP.setForeground(new java.awt.Color(0, 0, 0));
        TITULODEBUSQUEDABP.setText("BUSQUEDA DE PASTILLAS");

        BOXDEPASTILLAS.setBackground(new java.awt.Color(255, 153, 153));
        BOXDEPASTILLAS.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BOXDEPASTILLAS.setForeground(new java.awt.Color(0, 0, 0));
        BOXDEPASTILLAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CODIGO DE BARRAS" }));
        BOXDEPASTILLAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOXDEPASTILLASActionPerformed(evt);
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

        TABLA.setBackground(new java.awt.Color(255, 204, 204));
        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "LABORATORIO", "CODIGO DE BARRAS", "PRECIO", "NUMERO DE TABLETAS", "MILIGRAMOS"
            }
        ));
        jScrollPane1.setViewportView(TABLA);

        ATRAS.setBackground(new java.awt.Color(255, 153, 204));
        ATRAS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ATRAS.setForeground(new java.awt.Color(0, 0, 0));
        ATRAS.setText("<---");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BUSQUEDADEPASTILLASPANELLayout = new javax.swing.GroupLayout(BUSQUEDADEPASTILLASPANEL);
        BUSQUEDADEPASTILLASPANEL.setLayout(BUSQUEDADEPASTILLASPANELLayout);
        BUSQUEDADEPASTILLASPANELLayout.setHorizontalGroup(
            BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGroup(BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(BOXDEPASTILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(ELEGIR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addComponent(TITULODEBUSQUEDABP)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(ATRAS)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BUSQUEDADEPASTILLASPANELLayout.setVerticalGroup(
            BUSQUEDADEPASTILLASPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BUSQUEDADEPASTILLASPANELLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TITULODEBUSQUEDABP)
                .addGap(18, 18, 18)
                .addComponent(BOXDEPASTILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(BUSQUEDADEPASTILLASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BUSQUEDADEPASTILLASPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOXDEPASTILLASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOXDEPASTILLASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOXDEPASTILLASActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        this.dispose();
    }//GEN-LAST:event_ATRASActionPerformed

    private void ELEGIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELEGIRActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) TABLA.getModel();
    modelo.setRowCount(0); // Limpia la tabla

    int si = 0;
    int opc = BOXDEPASTILLAS.getSelectedIndex();

    if (opc == 0) {
    String nom = JOptionPane.showInputDialog(null, "Coloca el nombre del paciente que quieres buscar");
    for (int i = 0; i < FarmaicaGUI.paciente.size(); i++) {
        if (FarmaicaGUI.paciente.get(i).getNombre().equals(nom)) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.paciente.get(i).getNombre(),
                FarmaicaGUI.paciente.get(i).getFabrica(),
                FarmaicaGUI.paciente.get(i).getCodigo(),
                "$" + FarmaicaGUI.paciente.get(i).getPrecio(),
                FarmaicaGUI.paciente.get(i).getTabletas(),
                FarmaicaGUI.paciente.get(i).getMlg()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Paciente encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
} else {
    int copc = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloca el código del paciente que quieres encontrar"));
    for (int i = 0; i < FarmaicaGUI.paciente.size(); i++) {
        if (FarmaicaGUI.paciente.get(i).getCodigo() == copc) {
            si++;
            Object[] rowData = {
                FarmaicaGUI.paciente.get(i).getNombre(),
                FarmaicaGUI.paciente.get(i).getFabrica(),
                FarmaicaGUI.paciente.get(i).getCodigo(),
                "$" + FarmaicaGUI.paciente.get(i).getPrecio(),
                FarmaicaGUI.paciente.get(i).getTabletas(),
                FarmaicaGUI.paciente.get(i).getMlg()
            };
            modelo.addRow(rowData);
        }
    }

    if (si == 0) {
        JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Información", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Paciente encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_ELEGIRActionPerformed
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JComboBox<String> BOXDEPASTILLAS;
    private javax.swing.JPanel BUSQUEDADEPASTILLASPANEL;
    private javax.swing.JButton ELEGIR;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel TITULODEBUSQUEDABP;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
