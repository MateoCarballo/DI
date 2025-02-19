package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaAltaTrabajador extends JFrame {
    public VentanaAltaTrabajador(Controlador controlador) {
        setTitle("Alta Trabajador");
        setSize(300, 300);
        setLayout(new FlowLayout());

        JTextField txtDni = new JTextField(10);
        JTextField txtNombre = new JTextField(10);
        JComboBox<String> comboProvincia = new JComboBox<>(controlador.obtenerProvincias());
        JComboBox<String> comboProfesion = new JComboBox<>(controlador.obtenerProfesiones());
        JButton btnAlta = new JButton("Alta");

        /* TODO ACCIONES

        btnAlta.addActionListener(e -> {
            if (Empresa.agregarTrabajador(new VentanaTrabajador(txtDni.getText(), txtNombre.getText(), (String) comboProvincia.getSelectedItem(), (String) comboProfesion.getSelectedItem()))) {
                JOptionPane.showMessageDialog(this, "Trabajador dado de alta");
            } else {
                JOptionPane.showMessageDialog(this, "Error al dar de alta");
            }
        });
         */

        add(txtDni);
        add(txtNombre);
        add(comboProvincia);
        add(comboProfesion);
        add(btnAlta);
        setVisible(true);
    }
}
