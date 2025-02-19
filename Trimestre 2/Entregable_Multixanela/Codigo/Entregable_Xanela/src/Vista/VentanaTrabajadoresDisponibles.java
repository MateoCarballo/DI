package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaTrabajadoresDisponibles extends JFrame {

        private DefaultListModel<String> modeloLista;
        private JList<String> listaTrabajadores;

        public VentanaTrabajadoresDisponibles(Controlador controlador) {
            setTitle("Trabajadores Disponibles");
            setSize(400, 300);
            setLayout(new BorderLayout());

            modeloLista = new DefaultListModel<>();
            listaTrabajadores = new JList<>(modeloLista);
            actualizarLista();

            add(new JScrollPane(listaTrabajadores), BorderLayout.CENTER);

            setVisible(true);
        }

        public void actualizarLista() {
            /*
            modeloLista.clear();
            for (VentanaTrabajador t : modelo.getTrabajadores()) {
                modeloLista.addElement(t.getDni() + " - " + t.getNombre() + " - " + t.getProvincia() + " - " + t.getProfesion());
            }
             */
        }

}
