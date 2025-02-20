package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaProfesiones extends JFrame {
    private TextArea textArea;
    private JTextField txtField;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private Controlador controlador;

    public VentanaProfesiones(Controlador controlador) {
        this.controlador = controlador;
        configurarVentana();
        inicializarComponentes();
        agregarComponentes();
        setVisible(true);
    }

    private void configurarVentana() {
        setTitle("Gestión de Profesiones");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void inicializarComponentes() {
        textArea = new TextArea();
        txtField = new JTextField(10);
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");
        textArea.setEditable(false);
        btnAgregar.addActionListener(controlador);
        btnAgregar.setActionCommand("AGREGAR_PROFESION");

        btnEliminar.addActionListener(controlador);
        btnEliminar.setActionCommand("ELIMINAR_PROFESION");
    }

    private void agregarComponentes() {
        add(textArea);
        add(txtField);
        add(btnAgregar);
        add(btnEliminar);
    }

    // Getters para permitir acceso desde el Controlador
    public JTextField getTxtField() {
        return txtField;
    }

    public TextArea getTextArea() {
        return textArea;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }
}
