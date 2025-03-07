/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejemcomponente1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class EjemComponente1 extends JPanel {
//componentes  del panel

    private JLabel lblError;
    private JLabel lblInfo;

    public EjemComponente1() {

        initComponents();
    }
//métodos setter del panel

    public void setMensajeError(String mensaje) {
        lblError.setText(mensaje);
    }

    public void setMensajeInfo(String mensaje) {
        lblInfo.setText(mensaje);
    }

    private void initComponents() {
        lblError = new JLabel();
        lblInfo = new JLabel();

        lblError.setForeground(Color.red);
        lblInfo.setForeground(Color.green);

        JLabel mensajeError = new JLabel("Mensaje de error");
        JLabel mensajeInfo = new JLabel("Mensaje de información");

        //   setBackground(new Color(235, 161, 52));
        setLayout(new GridLayout(1, 4));

        //añado los componentes del panel
        add(mensajeError);
        add(lblError);
        add(mensajeInfo);
        add(lblInfo);

    }

}
