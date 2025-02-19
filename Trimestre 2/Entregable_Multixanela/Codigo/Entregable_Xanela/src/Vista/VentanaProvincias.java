package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaProvincias extends JFrame {
    private final Controlador controller;
    private JComboBox<String> comboProvincias;
    private JTextField txtNueva;
    private JButton btnAgregar, btnEliminar;

    public VentanaProvincias(Controlador controller) {
        this.controller = controller;
        configurarVentana();
        inicializarComponentes();
        agregarComponentes();
        setVisible(true);
    }

    private void configurarVentana() {
        setTitle("Gestión de Provincias");
        setSize(350, 200);
        setLocationRelativeTo(null); // Centrar ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());
    }

    private void inicializarComponentes() {
        comboProvincias = new JComboBox<>(controller.obtenerProvincias());
        txtNueva = new JTextField(15);
        btnAgregar = crearBoton("Agregar", "AGREGAR_PROVINCIA");
        btnEliminar = crearBoton("Eliminar", "ELIMINAR_PROVINCIA");
    }

    private JButton crearBoton(String texto, String actionCommand) {
        JButton boton = new JButton(texto);
        boton.addActionListener(controller);
        boton.setActionCommand(actionCommand);
        return boton;
    }

    private void agregarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(comboProvincias, gbc);

        gbc.gridy = 1; gbc.gridwidth = 1;
        add(txtNueva, gbc);

        gbc.gridx = 1;
        add(btnAgregar, gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        add(btnEliminar, gbc);
    }

    // Getters
    public JComboBox<String> getComboProvincias() { return comboProvincias; }
    public JTextField getTxtNueva() { return txtNueva; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnEliminar() { return btnEliminar; }
}
