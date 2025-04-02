package Ejemplo_MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculadoraVista extends JFrame {
    private JTextField campoNumero1 = new JTextField(5);
    private JTextField campoNumero2 = new JTextField(5);
    private JButton botonSumar = new JButton("Sumar");
    private JTextField campoResultado = new JTextField(10);

    public CalculadoraVista() {
        setTitle("Calculadora MVC");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Número 1:"));
        add(campoNumero1);
        add(new JLabel("Número 2:"));
        add(campoNumero2);
        add(botonSumar);
        add(new JLabel("Resultado:"));
        add(campoResultado);
        campoResultado.setEditable(false);

        setVisible(true);
    }

    public int getNumero1() {
        return Integer.parseInt(campoNumero1.getText());
    }

    public int getNumero2() {
        return Integer.parseInt(campoNumero2.getText());
    }

    public void setResultado(int resultado) {
        campoResultado.setText(String.valueOf(resultado));
    }

    public void agregarControlador(ActionListener controlador) {
        botonSumar.addActionListener(controlador);
    }
}
