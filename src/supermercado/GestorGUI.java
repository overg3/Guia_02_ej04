/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author liquiD
 */
public class GestorGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestorGUI
     */
    public GestorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_cat = new javax.swing.JComboBox<>();
        field_desc = new javax.swing.JTextField();
        field_code = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        field_price = new javax.swing.JTextField();
        field_stock = new javax.swing.JTextField();
        button_new = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_del = new javax.swing.JButton();
        label_verification = new javax.swing.JLabel();
        label_verification2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Gestor de Productos");

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Stock");

        jLabel5.setText("Rubro:");

        combo_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un rubro --", "COMESTIBLE", "LIMPIEZA", "PERFUMERIA" }));

        field_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field_codeKeyReleased(evt);
            }
        });

        jLabel6.setText("#");

        jLabel7.setText("$");

        button_new.setText("Nuevo Producto");
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });

        button_add.setText("Agregar");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_del.setText("Quitar");

        label_verification.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_verification.setForeground(new java.awt.Color(255, 0, 0));
        label_verification.setText("El producto ya existe");
        label_verification.setVisible(false);

        label_verification2.setForeground(new java.awt.Color(0, 153, 0));
        label_verification2.setText("✔");
        label_verification2.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(field_code, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_verification2)
                                .addGap(17, 17, 17)
                                .addComponent(label_verification))
                            .addComponent(field_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_price, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(field_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(button_new)
                            .addGap(18, 18, 18)
                            .addComponent(button_add)
                            .addGap(18, 18, 18)
                            .addComponent(button_del))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(field_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(field_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(label_verification)
                    .addComponent(label_verification2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(field_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(field_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_new)
                    .addComponent(button_add)
                    .addComponent(button_del))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed

        clearFields();

    }//GEN-LAST:event_button_newActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed

        int codigo = Integer.parseInt(field_code.getText());
        String desc = field_desc.getText();
        float precio = Float.parseFloat(field_price.getText());
        int stock = Integer.parseInt(field_stock.getText());
        String rubro = (String) combo_cat.getSelectedItem();
        Categoria rubroEnum = Categoria.valueOf(rubro);

        agregarProducto(codigo, desc, precio, stock, rubroEnum);

    }//GEN-LAST:event_button_addActionPerformed

    private void field_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_codeKeyReleased

        String inputCodeText = field_code.getText().trim();
        boolean codeFound = false;
        boolean codeDiff = true;
        
        if (!inputCodeText.isEmpty()) {
            int inputCode = Integer.parseInt(field_code.getText());
            
            for (Producto producto : MenuGUI.listaProductos) {
                if (producto.getCodigo() == inputCode) {
                    codeFound = true;
                    codeDiff = false;
                    break;
                }
            }   
        }
        
        
        
        label_verification.setVisible(codeFound);
        label_verification2.setVisible(!inputCodeText.isEmpty() && codeDiff);

    }//GEN-LAST:event_field_codeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_del;
    private javax.swing.JButton button_new;
    private javax.swing.JComboBox<String> combo_cat;
    private javax.swing.JTextField field_code;
    private javax.swing.JTextField field_desc;
    private javax.swing.JTextField field_price;
    private javax.swing.JTextField field_stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_verification;
    private javax.swing.JLabel label_verification2;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        field_code.setText("");
        field_desc.setText("");
        field_price.setText("");
        field_stock.setText("");
        combo_cat.setSelectedIndex(0);
    }

    private void agregarProducto(int codigo, String desc, float precio,
            int stock, Categoria rubro) {

        MenuGUI.listaProductos.add(new Producto(codigo, desc, precio, stock, rubro));

    }

}
