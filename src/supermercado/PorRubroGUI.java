package supermercado;

import javax.swing.table.DefaultTableModel;

public class PorRubroGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form PorRubro
     */
    public PorRubroGUI() {
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
        rubroCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        rubroTable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Búsqueda por rubro");
        setToolTipText("");

        jLabel1.setText("Rubro:");

        rubroCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione un rubro --", "COMESTIBLE", "LIMPIEZA", "PERFUMERIA" }));
        rubroCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rubroComboItemStateChanged(evt);
            }
        });

        rubroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rubroTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(rubroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rubroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rubroComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rubroComboItemStateChanged

        DefaultTableModel rubroTableModel = (DefaultTableModel) rubroTable.getModel();
        
        clearTable();
        
        String selectedRubro = rubroCombo.getSelectedItem().toString();
        String productRubro;
        
        for (Producto producto : MenuGUI.listaProductos) {
            productRubro = producto.getRubro().toString();
            if (selectedRubro.equals(productRubro)) {
                rubroTableModel.addRow(new Object[]{producto.getCodigo(),
                    producto.getDescripcion(), "$ " + producto.getPrecio(),
                    producto.getStock()});
            }
        }


    }//GEN-LAST:event_rubroComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> rubroCombo;
    private javax.swing.JTable rubroTable;
    // End of variables declaration//GEN-END:variables

    private void clearTable() {

        DefaultTableModel rubroTableModel = (DefaultTableModel) rubroTable.getModel();

        int filas = rubroTable.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {
            rubroTableModel.removeRow(i);
        }

    }

}