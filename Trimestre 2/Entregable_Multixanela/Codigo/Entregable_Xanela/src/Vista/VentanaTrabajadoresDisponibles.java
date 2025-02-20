package Vista;

import Controlador.Controlador;
import Modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaTrabajadoresDisponibles  extends JFrame {

    private JList<Trabajador> listaTrabajadores;
    private JScrollPane scrollListaTrabajadores;
    private Controlador controlador;

    public VentanaTrabajadoresDisponibles(Controlador controlador, List<Trabajador> trabajadores) {
        this.controlador = controlador;
        configurarVentana();
        inicializarComponentes(trabajadores);
        agregarComponentes();
        setVisible(true);
    }

    private void configurarVentana() {
        setTitle("Lista de Trabajadores");
        setSize(650, 550);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 240, 250)); // Fondo suave
    }

    private void inicializarComponentes(List<Trabajador> trabajadores) {
        Font font = new Font("Arial", Font.PLAIN, 14);

        // Crear el modelo de la lista
        DefaultListModel<Trabajador> modelo = new DefaultListModel<>();
        for (Trabajador trabajador : trabajadores) {
            modelo.addElement(trabajador);
        }

        listaTrabajadores = new JList<>(modelo);
        listaTrabajadores.setFont(font);
        listaTrabajadores.setCellRenderer(new TrabajadorCellRenderer());  // Establecer el renderizador de celdas
        listaTrabajadores.setVisibleRowCount(10);
        listaTrabajadores.setFixedCellHeight(30);

        scrollListaTrabajadores = new JScrollPane(listaTrabajadores);
        scrollListaTrabajadores.setPreferredSize(new Dimension(600, 400));
    }

    private void agregarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Trabajadores:"), gbc);

        // Panel para la cabecera con los títulos
        JPanel panelCabecera = new JPanel();
        panelCabecera.setLayout(new GridLayout(1, 3)); // Tres columnas
        panelCabecera.setBackground(new Color(200, 220, 240)); // Color suave de fondo para la cabecera

        JLabel lblNombreApellido = new JLabel("Nombre + Apellidos", SwingConstants.CENTER);
        JLabel lblProvincia = new JLabel("Provincia", SwingConstants.CENTER);
        JLabel lblProfesion = new JLabel("Profesión", SwingConstants.CENTER);

        // Personalizar la apariencia de los títulos
        Font fontCabecera = new Font("Arial", Font.BOLD, 14);
        lblNombreApellido.setFont(fontCabecera);
        lblProvincia.setFont(fontCabecera);
        lblProfesion.setFont(fontCabecera);

        panelCabecera.add(lblNombreApellido);
        panelCabecera.add(lblProvincia);
        panelCabecera.add(lblProfesion);

        // Agregar la cabecera
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;  // Ocupa las dos columnas
        gbc.fill = GridBagConstraints.BOTH;
        add(panelCabecera, gbc);

        // Agregar la lista de trabajadores
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;  // Ocupa las dos columnas
        gbc.fill = GridBagConstraints.BOTH;
        add(scrollListaTrabajadores, gbc);
    }

    // Definir un renderizador de celdas para mostrar las tres columnas
    class TrabajadorCellRenderer extends JPanel implements ListCellRenderer<Trabajador> {
        private JLabel lblNombreApellido, lblProvincia, lblProfesion;

        public TrabajadorCellRenderer() {
            setLayout(new GridLayout(1, 3)); // Tres columnas
            lblNombreApellido = new JLabel();
            lblProvincia = new JLabel();
            lblProfesion = new JLabel();

            add(lblNombreApellido);
            add(lblProvincia);
            add(lblProfesion);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Trabajador> list, Trabajador trabajador, int index, boolean isSelected, boolean cellHasFocus) {
            lblNombreApellido.setText(trabajador.getNombre() + " " + trabajador.getApellido1() + " " + trabajador.getApellido2());
            lblProvincia.setText(trabajador.getProvincia());
            lblProfesion.setText(trabajador.getProfesion());

            // Estilo de selección
            if (isSelected) {
                setBackground(new Color(100, 150, 200));
                lblNombreApellido.setForeground(Color.WHITE);
                lblProvincia.setForeground(Color.WHITE);
                lblProfesion.setForeground(Color.WHITE);
            } else {
                setBackground(list.getBackground());
                lblNombreApellido.setForeground(Color.BLACK);
                lblProvincia.setForeground(Color.BLACK);
                lblProfesion.setForeground(Color.BLACK);
            }

            return this;
        }
    }
}
