
package com.mycompany.farmaicagui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Menujarabe extends javax.swing.JFrame {

    
    public Menujarabe() {
        initComponents();
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
        MILILITROS = new javax.swing.JTextField();
        REGISTRAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        IMPRIMIR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        ATRAS = new javax.swing.JButton();
        OPCION = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANELDEPASTILLAS.setBackground(new java.awt.Color(153, 153, 255));

        PASTILLASTITULO.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        PASTILLASTITULO.setForeground(new java.awt.Color(0, 0, 0));
        PASTILLASTITULO.setText("MENU JARABE");

        NOMBRELETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        NOMBRELETRERO.setForeground(new java.awt.Color(0, 0, 0));
        NOMBRELETRERO.setText("NOMBRE:");

        LABORATORIOLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LABORATORIOLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        LABORATORIOLETRERO.setText("LABORATORIO:");

        CODBARRASLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CODBARRASLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        CODBARRASLETRERO.setText("CÓDIGO DE BARRAS:");

        PRECIOLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        PRECIOLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        PRECIOLETRERO.setText("PRECIO:");

        NUMTABLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        NUMTABLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        NUMTABLETRERO.setText("MILILITROS:");

        MILIGRAMOSLETRERO.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        MILIGRAMOSLETRERO.setForeground(new java.awt.Color(0, 0, 0));
        MILIGRAMOSLETRERO.setText("VASO DOSIFICADOR");

        REGISTRAR.setBackground(new java.awt.Color(102, 102, 255));
        REGISTRAR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        REGISTRAR.setForeground(new java.awt.Color(0, 0, 0));
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(102, 102, 255));
        MODIFICAR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        MODIFICAR.setForeground(new java.awt.Color(0, 0, 0));
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        BORRAR.setBackground(new java.awt.Color(102, 102, 255));
        BORRAR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BORRAR.setForeground(new java.awt.Color(0, 0, 0));
        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        IMPRIMIR.setBackground(new java.awt.Color(102, 102, 255));
        IMPRIMIR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        IMPRIMIR.setForeground(new java.awt.Color(0, 0, 0));
        IMPRIMIR.setText("IMPRIMIR");
        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });

        LIMPIAR.setBackground(new java.awt.Color(102, 102, 255));
        LIMPIAR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        LIMPIAR.setForeground(new java.awt.Color(0, 0, 0));
        LIMPIAR.setText("LIMPIAR ");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(102, 102, 255));
        BUSCAR.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
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
                "NOMBRE", "LABORATORIO", "CODIGO DE BARRAS", "PRECIO", "MILILITROS", "VASO DOSIFICADOR"
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

        OPCION.setBackground(new java.awt.Color(153, 153, 255));
        OPCION.setForeground(new java.awt.Color(0, 0, 0));
        OPCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JARABES.jpg"))); // NOI18N

        javax.swing.GroupLayout PANELDEPASTILLASLayout = new javax.swing.GroupLayout(PANELDEPASTILLAS);
        PANELDEPASTILLAS.setLayout(PANELDEPASTILLASLayout);
        PANELDEPASTILLASLayout.setHorizontalGroup(
            PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(ATRAS))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(NUMTABLETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MILILITROS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(PRECIOLETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(CODBARRASLETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CODIGODEBARRAS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(NOMBRELETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(LABORATORIOLETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LABORATORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(REGISTRAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MILIGRAMOSLETRERO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IMPRIMIR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LIMPIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BORRAR)
                                            .addComponent(BUSCAR))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(OPCION, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(62, 62, 62)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(PASTILLASTITULO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELDEPASTILLASLayout.setVerticalGroup(
            PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                                .addComponent(NOMBRELETRERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LABORATORIOLETRERO)
                                    .addComponent(LABORATORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CODBARRASLETRERO)
                                    .addComponent(CODIGODEBARRAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PRECIOLETRERO)
                                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NUMTABLETRERO)
                                    .addComponent(MILILITROS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MILIGRAMOSLETRERO)
                            .addComponent(OPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REGISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PANELDEPASTILLASLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PANELDEPASTILLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PASTILLASTITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(ATRAS)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANELDEPASTILLAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANELDEPASTILLAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        DefaultTableModel tablaDefault = new DefaultTableModel(new String[]{"Nombre","Fabrica","Codigo","Precio","Mililtros","¿Vaso?"},FarmaicaGUI.jarabes.size());
        TABLA.setModel(tablaDefault);
        
        TableModel modeloDatos = TABLA.getModel();
        for(int i = 0;i < FarmaicaGUI.jarabes.size();i++){
            Jarabe jarabe = FarmaicaGUI.jarabes.get(i);
            modeloDatos.setValueAt(jarabe.getNombre(), i, 0);
            modeloDatos.setValueAt(jarabe.getFabrica(), i, 1);
            modeloDatos.setValueAt(jarabe.getCodigo(), i, 2);
            modeloDatos.setValueAt("$"+jarabe.getPrecio(), i, 3);
            modeloDatos.setValueAt(jarabe.getMll(), i, 4);
            if(jarabe.isVaso()== true){
            modeloDatos.setValueAt("Si", i, 5);
            }else
            {
            modeloDatos.setValueAt("No", i, 5);
            }
        }
    }
    
    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        int Borrarrfila = TABLA.getSelectedRow();
        if(Borrarrfila >= 0){
            FarmaicaGUI.jarabes.remove(Borrarrfila);
            mostrartabla();
        } 
    }//GEN-LAST:event_BORRARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        NOMBRE.setText("");
        LABORATORIO.setText("");
        CODIGODEBARRAS.setText("");
        PRECIO.setText("");
        MILILITROS.setText("");
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        BJ L = new BJ();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BUSCARActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
        Jarabe jarabe = new Jarabe();
        jarabe.setNombre(NOMBRE.getText());
        jarabe.setFabrica(LABORATORIO.getText());
        jarabe.setCodigo(Integer.parseInt(CODIGODEBARRAS.getText()));
        jarabe.setPrecio(Float.parseFloat(PRECIO.getText()));
        jarabe.setMll(Integer.parseInt(MILILITROS.getText()));
        int opc = OPCION.getSelectedIndex();
           if(opc == 0){
               jarabe.setVaso(true);
           }else{
               jarabe.setVaso(false);
           }
            FarmaicaGUI.jarabes.add(jarabe);

            JOptionPane.showMessageDialog(this,"Jarabe registrado correctamente");
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
    int si = 0;
    int ind = 0;
    int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo de los jarabes a las que se les modificará el precio"));
    for(int i=0;i<FarmaicaGUI.jarabes.size();i++){
        if(FarmaicaGUI.jarabes.get(i).getCodigo()==cod){
            si = 1;
        }
    }
    if(si == 1){
        float nuevoprecio = Float.parseFloat(JOptionPane.showInputDialog(null,"Escribe el nuevo precio"));
        for(int i=0;i<FarmaicaGUI.jarabes.size();i++){
            if(FarmaicaGUI.jarabes.get(i).getCodigo()==cod){
                ind = i;
            FarmaicaGUI.jarabes.get(ind).setPrecio(nuevoprecio);
        }
        }
         JOptionPane.showMessageDialog(null, "Precio modificado correctamente","Resultado",JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null, "No se encontro a estos jarabes","Resultado",JOptionPane.ERROR);
    }
    mostrartabla();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
    mostrartabla();  
    }//GEN-LAST:event_IMPRIMIRActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        this.dispose();        
    }//GEN-LAST:event_ATRASActionPerformed

   

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
    private javax.swing.JLabel MILIGRAMOSLETRERO;
    private javax.swing.JTextField MILILITROS;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JLabel NOMBRELETRERO;
    private javax.swing.JLabel NUMTABLETRERO;
    private javax.swing.JComboBox<String> OPCION;
    private javax.swing.JPanel PANELDEPASTILLAS;
    private javax.swing.JLabel PASTILLASTITULO;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JLabel PRECIOLETRERO;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
