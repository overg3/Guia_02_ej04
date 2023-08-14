
package supermercado;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuitarGUI extends JDialog {
    
    private JTextField codigoField;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private String codigoIngresado;

    public QuitarGUI(Frame frame) {
        super(frame, "Quitar Producto", true);
        
        codigoField = new JTextField(10);
        aceptarButton = new JButton("Aceptar");
        cancelarButton = new JButton("Cancelar");
        
        //Diseño
        JPanel panel = new JPanel(new GridLayout(2,2,10,10));
        panel.add(new JLabel("Código del Producto:"));
        panel.add(codigoField);
        panel.add(aceptarButton);
        panel.add(cancelarButton);
        
        getContentPane().add(panel, BorderLayout.CENTER);
        
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                codigoIngresado = codigoField.getText();
                dispose();
            }
        });
        
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                codigoIngresado = null;
                dispose();
            }
        });
        
        pack();
        setLocationRelativeTo(panel);
        
        
    }

    public String getCodigoIngresado() {
        return codigoIngresado;
    }

    public void setCodigoIngresado(String codigoIngresado) {
        this.codigoIngresado = codigoIngresado;
    }
    
    
    
    
    
    
}
