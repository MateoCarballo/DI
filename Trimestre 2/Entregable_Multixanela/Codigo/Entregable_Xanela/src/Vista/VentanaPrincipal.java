package Vista;

import javax.swing.*;
import java.awt.*;
import Controlador.Controlador;

public class VentanaPrincipal extends JFrame{
    private Controlador controller;

    public VentanaPrincipal(Controlador c) {
        this.controller = c;
       crearVentana();
    }

    public void crearVentana(){
        setTitle("Gestión de Empresa");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton btnProvincias = new JButton("Gestión de Provincias");
        JButton btnProfesiones = new JButton("Gestión de Profesiones");
        JButton btnTrabajador = new JButton("Alta Trabajador");
        JButton btnVerTrabajadores = new JButton("Trabajadores Disponibles");

        btnProvincias.setActionCommand("PROVINCIAS");
        btnProfesiones.setActionCommand("PROFESIONES");
        btnTrabajador.setActionCommand("ALTA_TRABAJADOR");
        btnVerTrabajadores.setActionCommand("VER_TRABAJADORES");

        btnProvincias.addActionListener(controller);
        btnProfesiones.addActionListener(controller);
        btnTrabajador.addActionListener(controller);
        btnVerTrabajadores.addActionListener(controller);

        add(btnProvincias);
        add(btnProfesiones);
        add(btnTrabajador);
        add(btnVerTrabajadores);

        setVisible(true);
    }

    public Controlador getController() {
        return controller;
    }

    public void setController(Controlador controller) {
        this.controller = controller;
    }
}
