package Ejercicio1;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {
     crearVentana();
    }

    public static void crearVentana(){

        // Parametros de la ventana
        JFrame jframe1 = new JFrame();
        jframe1.setTitle("Ejercicio 1");
        jframe1.setSize(400,400);
        jframe1.setLocation(500,500);
        jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe1.setVisible(true);

        // Parametros de JButton

        JButton jButton = new JButton("Validar");
        jButton.setSize(80,20);
        jframe1.add(jButton);
        jButton.setLocation(185,200);

        // Parametros de los JTextField y sus JLabel

        JTextField jTextFieldCorreo = new JTextField();
        JTextField jTextFieldNombre = new JTextField();
        JLabel jLabelNombre = new JLabel("Nombre");
        JLabel jLabelCorreo = new JLabel("Correo");

        jTextFieldNombre.setSize(100,25);
        jLabelNombre.setSize(100,25);
        jframe1.add(jTextFieldNombre);
        jframe1.add(jLabelNombre);
        jTextFieldNombre.setLocation(175,100);
        jLabelNombre.setLocation(25,100);

        jTextFieldCorreo.setSize(100,25);
        jLabelCorreo.setSize(100,25);
        jframe1.add(jTextFieldCorreo);
        jframe1.add(jLabelCorreo);
        jTextFieldCorreo.setLocation(175,150);
        jLabelCorreo.setLocation(25,150);

        // Parametros del JRadioButton

        JRadioButton jRadioButton1 = new JRadioButton("Hombre");
        jframe1.add(jRadioButton1);
        jRadioButton1.setSize(100,20);
        jRadioButton1.setLocation(150,300);

        JRadioButton jRadioButton2 = new JRadioButton("Mujer");
        jframe1.add(jRadioButton2);
        jRadioButton2.setSize(100,20);
        jRadioButton2.setLocation(150,330);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.setSelected(jRadioButton1.getModel(), true);

        //Parametro del jcheckbox

        JCheckBox jCheckBox = new JCheckBox("Acepto las condiciones");
        jframe1.add(jCheckBox);
        jCheckBox.setSize(300,20);
        jCheckBox.setLocation(150,270);


    }

}