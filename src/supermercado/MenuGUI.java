package supermercado;

import java.util.TreeSet;

public class MenuGUI extends javax.swing.JFrame {
    
    public static TreeSet<Producto> listaProductos = new TreeSet();
    
    public MenuGUI() {
        initComponents();
        cargarProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAdmin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeTodo S.A. - Admininstrador de Productos v1.0");
        setPreferredSize(new java.awt.Dimension(960, 540));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        menuAdmin.setText("Administración");

        jMenuItem1.setText("Gestor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAdmin.add(jMenuItem1);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuAdmin.add(jMenuItem5);

        jMenuBar1.add(menuAdmin);

        menuConsultas.setText("Consultas");

        jMenuItem2.setText("Por Rubro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem2);

        jMenuItem3.setText("Por Nombre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem3);

        jMenuItem4.setText("Por Precio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuConsultas.add(jMenuItem4);

        jMenuBar1.add(menuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        
        PorNombreGUI porNombreWindow = new PorNombreGUI();
        int x = (getWidth() - porNombreWindow.getWidth()) / 2;
        int y = (getHeight() - porNombreWindow.getHeight()) / 2;
        porNombreWindow.setLocation(x, y);
        porNombreWindow.setVisible(true);
        jDesktopPane1.add(porNombreWindow);
        jDesktopPane1.moveToFront(porNombreWindow);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        
        PorRubroGUI porRubroWindow = new PorRubroGUI();
        int x = (getWidth() - porRubroWindow.getWidth()) / 2;
        int y = (getHeight() - porRubroWindow.getHeight()) / 2;
        porRubroWindow.setLocation(x, y);
        porRubroWindow.setVisible(true);
        jDesktopPane1.add(porRubroWindow);
        jDesktopPane1.moveToFront(porRubroWindow);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        
        PorPrecioGUI porPrecioWindow = new PorPrecioGUI();
        int x = (getWidth() - porPrecioWindow.getWidth()) / 2;
        int y = (getHeight() - porPrecioWindow.getHeight()) / 2;
        porPrecioWindow.setLocation(x, y);
        porPrecioWindow.setVisible(true);
        jDesktopPane1.add(porPrecioWindow);
        jDesktopPane1.moveToFront(porPrecioWindow);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        
        GestorGUI gestorWindow = new GestorGUI();
        int x = (getWidth() - gestorWindow.getWidth()) / 2;
        int y = (getHeight() - gestorWindow.getHeight()) / 2;
        gestorWindow.setLocation(x, y);
        gestorWindow.setVisible(true);
        jDesktopPane1.add(gestorWindow);
        jDesktopPane1.moveToFront(gestorWindow);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuConsultas;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {
        
        listaProductos.add(new Producto(12, "Azúcar", 250, 520, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(15, "Yerba Mate", 850, 10, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(5, "Aceite Girasol", 1420, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(22, "Detergente", 12, 780, Categoria.LIMPIEZA));
        
    }
    
}
