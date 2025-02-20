package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaAltaTrabajador extends JFrame {

    private JTextField txtNome;
    private JTextField txtApelido1;
    private JTextField txtApelido2;
    private JTextField txtDNI;
    private JScrollPane scrollListaProfesion;
    private JComboBox<String> comboProvincia;
    private JList<String> listaProfesion;
    private JButton btnAlta;
    private Controlador controlador;

    public VentanaAltaTrabajador(Controlador controlador, List<String> provincias, List<String> profesiones) {
        this.controlador = controlador;
        configurarVentana();
        inicializarComponentes(provincias, profesiones);
        agregarComponentes();
        setVisible(true);
    }

    private void configurarVentana() {
        setTitle("Alta de Traballador");
        setSize(650, 550);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 240, 250)); // Fondo suave
    }

    private void inicializarComponentes(List<String> provincias, List<String> profesiones) {
        Font font = new Font("Arial", Font.PLAIN, 14);

        txtNome = new JTextField();
        txtNome.setPreferredSize(new Dimension(375, 30));
        txtNome.setFont(font);

        txtApelido1 = new JTextField();
        txtApelido1.setPreferredSize(new Dimension(375, 30));
        txtApelido1.setFont(font);

        txtApelido2 = new JTextField();
        txtApelido2.setPreferredSize(new Dimension(375, 30));
        txtApelido2.setFont(font);

        txtDNI = new JTextField();
        txtDNI.setPreferredSize(new Dimension(375, 30));
        txtDNI.setFont(font);

        comboProvincia = new JComboBox<>(provincias.toArray(new String[0]));
        comboProvincia.setPreferredSize(new Dimension(375, 30));
        comboProvincia.setFont(font);

        listaProfesion = new JList<>(profesiones.toArray(new String[0]));
        listaProfesion.setFont(font);
        listaProfesion.setVisibleRowCount(8);
        listaProfesion.setFixedCellHeight(30);

        scrollListaProfesion = new JScrollPane(listaProfesion);
        scrollListaProfesion.setPreferredSize(new Dimension(400, 200));

        btnAlta = new JButton("Dar de Alta");
        btnAlta.setFont(new Font("Arial", Font.BOLD, 14));
        btnAlta.setBackground(new Color(100, 150, 200));
        btnAlta.setForeground(Color.WHITE);
        btnAlta.setFocusPainted(false);
        btnAlta.setBorder(BorderFactory.createRaisedBevelBorder());
        btnAlta.addActionListener(controlador);
        btnAlta.setActionCommand("ALTA_TRABALLADOR");
    }

    private void agregarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        add(txtNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Primer Apelido:"), gbc);
        gbc.gridx = 1;
        add(txtApelido1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Segundo Apelido:"), gbc);
        gbc.gridx = 1;
        add(txtApelido2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("DNI:"), gbc);
        gbc.gridx = 1;
        add(txtDNI, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Provincia:"), gbc);
        gbc.gridx = 1;
        add(comboProvincia, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; // Permitir expansión horizontal
        gbc.weighty = 1.0; // Permitir expansión vertical
        add(scrollListaProfesion, gbc);
        gbc.weighty = 0; // Reset para las siguientes filas
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnAlta, gbc);
    }

    // Getters para permitir acceso desde el Controlador
    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtApelido1() {
        return txtApelido1;
    }

    public JTextField getTxtApelido2() {
        return txtApelido2;
    }

    public JTextField getTxtDNI() {
        return txtDNI;
    }

    public JComboBox<String> getComboProvincia() {
        return comboProvincia;
    }

    public JList<String> getListaProfesion() {
        return listaProfesion;
    }

    public JButton getBtnAlta() {
        return btnAlta;
    }
}
