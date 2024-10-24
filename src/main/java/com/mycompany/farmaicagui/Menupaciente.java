
package com.mycompany.farmaicagui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Menupaciente extends javax.swing.JFrame {

    
    public Menupaciente() {
        initComponents();
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PANELDEPASTILLAS = new javax.swing.JPanel();
        PASTILLASTITULO = new javax.swing.JLabel();
        NOMBRELETRERO = new javax.swing.JLabel();
        LABORATORIOLETRERO = new javax.swing.JLabel();
        CODBARRASLETRERO = new javax.swing.JLabel();
        PRECIOLETRERO = new javax.swing.JLabel();
        NUMTABLETRERO = new javax.swing.JLabel();
        MILIGRAMOSLETRERO = new javax.swing.JLabel();
        LABORATORIO = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        CODIGODEBARRAS = new javax.swing.JTextField();
        PRECIO = new javax.swing.JTextField();
        NUMERODETABLETAS = new javax.swing.JTextField();
        MILIGRAMOS = new javax.swing.JTextField();
        REGISTRAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        IMPRIMIR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        ATRAS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANELDEPASTILLAS.setBackground(new java.awt.Color(153, 153, 255));
        PANELDEPASTILLAS.setPreferredSize(new java.awt.Dimension(1920, 1080));

        PASTILLASTITULO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        PASTILLASTITULO.setForeground(new java.awt.Color(0, 0, 0));
        PASTILLASTITULO.setText("MENU PACIENTES");

        NOMBRELETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        NOMBRELETRERO.setForeground(new java.awt.Color(0, 0, 0));
        NOMBRELETRERO.setText("NOMBRE:");

        LABORATORIOLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        LABORATORIOLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        LABORATORIOLETRERO.setText("EDAD:");

        CODBARRASLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        CODBARRASLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        CODBARRASLETRERO.setText("CÓDIGO DE BARRAS:");

        PRECIOLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        PRECIOLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        PRECIOLETRERO.setText("PRECIO:");

        NUMTABLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        NUMTABLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        NUMTABLETRERO.setText("NÚMERO DE TABLETAS:");

        MILIGRAMOSLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        MILIGRAMOSLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        MILIGRAMOSLETRERO.setText("FECHA:");

        LABORATORIO.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N

        NOMBRE.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });

        CODIGODEBARRAS.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N

        PRECIO.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N

        NUMERODETABLETAS.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N

        MILIGRAMOS.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N

        REGISTRAR.setBackground(new java.awt.Color(102, 102, 255));
        REGISTRAR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(0, 0, 0));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(102, 102, 255));
        MODIFICAR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        MODIFICAR.setForeground(new java.awt.Color(0, 0, 0));
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        BORRAR.setBackground(new java.awt.Color(102, 102, 255));
        BORRAR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        BORRAR.setForeground(new java.awt.Color(0, 0, 0));
        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        IMPRIMIR.setBackground(new java.awt.Color(102, 102, 255));
        IMPRIMIR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        IMPRIMIR.setForeground(new java.awt.Color(0, 0, 0));
        IMPRIMIR.setText("IMPRIMIR");
        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });

        LIMPIAR.setBackground(new java.awt.Color(102, 102, 255));
        LIMPIAR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        LIMPIAR.setForeground(new java.awt.Color(0, 0, 0));
        LIMPIAR.setText("LIMPIAR ");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(102, 102, 255));
        BUSCAR.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        BUSCAR.setForeground(new java.awt.Color(0, 0, 0));
        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        TABLA.setBackground(new java.awt.Color(102, 102, 255));
        TABLA.setForeground(new java.awt.Color(0, 0, 0));
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

        ATRAS.setBackground(new java.awt.Color(102, 51, 255));
        ATRAS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ATRAS.setForeground(new java.awt.Color(0, 0, 0));
        ATRAS.setText("<---");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELDEPASTILLASLayout = new javax.swing.GroupLayout(PANELDEPASTILLAS);
        PANELDEPASTILLAS.setLayout(PANELDEPASTILLASLayout);
        PANELDEPASTILLASLayout.setHorizontalGroup(
            PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addGap(483, 483, 483)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LABORATORIO)
                                    .addComponent(MILIGRAMOS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NOMBRE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NUMTABLETRERO)
                                    .addComponent(CODBARRASLETRERO)
                                    .addComponent(PRECIOLETRERO))
                                .addGap(52, 52, 52)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CODIGODEBARRAS, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(PRECIO)
                                    .addComponent(NUMERODETABLETAS)))
                            .addComponent(NOMBRELETRERO)
                            .addComponent(MILIGRAMOSLETRERO)
                            .addComponent(LABORATORIOLETRERO)
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IMPRIMIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(REGISTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BORRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(45, 45, 45)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PASTILLASTITULO)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGap(744, 744, 744)
                        .addComponent(ATRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        PANELDEPASTILLASLayout.setVerticalGroup(
            PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NOMBRELETRERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NOMBRE))
                .addGap(28, 28, 28)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MILIGRAMOS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MILIGRAMOSLETRERO))
                .addGap(18, 18, 18)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LABORATORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABORATORIOLETRERO))
                .addGap(31, 31, 31)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CODBARRASLETRERO)
                    .addComponent(CODIGODEBARRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PRECIOLETRERO)
                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NUMERODETABLETAS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMTABLETRERO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMPRIMIR)
                    .addComponent(LIMPIAR))
                .addGap(18, 18, 18)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MODIFICAR)
                    .addComponent(REGISTRAR))
                .addGap(28, 28, 28)
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUSCAR)
                    .addComponent(BORRAR))
                .addGap(228, 228, 228))
            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(PASTILLASTITULO)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(ATRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PANELDEPASTILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PANELDEPASTILLAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void mostrartabla(){
        DefaultTableModel tablaDefault = new DefaultTableModel(new String[]{"Nombre","Fabrica","Codigo","Precio","Num Tabletas","Miligramos"},FarmaicaGUI.paciente.size());
        TABLA.setModel(tablaDefault);
        
        TableModel modeloDatos = TABLA.getModel();
        for(int i = 0;i < FarmaicaGUI.paciente.size();i++){
            Paciente paciente = FarmaicaGUI.paciente.get(i);
            modeloDatos.setValueAt(paciente.getNombre(), i, 0);
            modeloDatos.setValueAt(paciente.getFabrica(), i, 1);
            modeloDatos.setValueAt(paciente.getCodigo(), i, 2);
            modeloDatos.setValueAt("$"+paciente.getPrecio(), i, 3);
            modeloDatos.setValueAt(paciente.getTabletas(), i, 4);
            modeloDatos.setValueAt(paciente.getMlg(), i, 5);
        }
    }
    
    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        
        
         
        
         int opc = JOptionPane.showConfirmDialog(null, "¿Esta seguro de borrar el registro?", "AVISO", JOptionPane.YES_NO_OPTION);
       if(opc == 0){
           int Borrarrfila = TABLA.getSelectedRow();
        if(Borrarrfila >= 0){
            FarmaicaGUI.paciente.remove(Borrarrfila);
            mostrartabla();
        }
       }
       if(opc == 1){   
       } 
     
    }//GEN-LAST:event_BORRARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        NOMBRE.setText("");
        LABORATORIO.setText("");
        CODIGODEBARRAS.setText("");
        PRECIO.setText("");
        NUMERODETABLETAS.setText("");
        MILIGRAMOS.setText("");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        BP p = new BP();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BUSCARActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        Paciente paciente = new Paciente();
        paciente.setNombre(NOMBRE.getText());
        paciente.setFabrica(LABORATORIO.getText());
        paciente.setCodigo(Integer.parseInt(CODIGODEBARRAS.getText()));
        paciente.setPrecio(Float.parseFloat(PRECIO.getText()));
        paciente.setTabletas(Integer.parseInt(NUMERODETABLETAS.getText()));
        paciente.setMlg(Integer.parseInt(MILIGRAMOS.getText()));

        FarmaicaGUI.paciente.add(paciente);

        JOptionPane.showMessageDialog(this,"Paciente registrado correctamente","Comprobacion",JOptionPane.INFORMATION_MESSAGE);      
    
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
    int si = 0;
    int ind = 0;
    int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo del paciente al que se le modificará el precio?"));
    for(int i=0;i<FarmaicaGUI.paciente.size();i++){
        if(FarmaicaGUI.paciente.get(i).getCodigo()==cod){
            si = 1;
        }
    }
    if(si == 1){
        float nuevoprecio = Float.parseFloat(JOptionPane.showInputDialog(null,"Escribe el nuevo precio?"));
        for(int i=0;i<FarmaicaGUI.paciente.size();i++){
            if(FarmaicaGUI.paciente.get(i).getCodigo()==cod){
                ind = i;
            FarmaicaGUI.paciente.get(ind).setPrecio(nuevoprecio);
        }
        }
         JOptionPane.showMessageDialog(null, "Precio? modificado correctamente","Resultado",JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null, "No se encontro a este paciente","Resultado",JOptionPane.ERROR);
    }
    mostrartabla();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
    mostrartabla();  
    }//GEN-LAST:event_IMPRIMIRActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        this.dispose();        
    }//GEN-LAST:event_ATRASActionPerformed

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JLabel CODBARRASLETRERO;
    private javax.swing.JTextField CODIGODEBARRAS;
    private javax.swing.JButton IMPRIMIR;
    private javax.swing.JTextField LABORATORIO;
    private javax.swing.JLabel LABORATORIOLETRERO;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JTextField MILIGRAMOS;
    private javax.swing.JLabel MILIGRAMOSLETRERO;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JLabel NOMBRELETRERO;
    private javax.swing.JTextField NUMERODETABLETAS;
    private javax.swing.JLabel NUMTABLETRERO;
    private javax.swing.JPanel PANELDEPASTILLAS;
    private javax.swing.JLabel PASTILLASTITULO;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JLabel PRECIOLETRERO;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JTable TABLA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
