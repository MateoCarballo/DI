import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 extends JFrame {
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JButton jbutton1;
    private JButton jbutton2;
    private JLabel jLabel;
    private Font fuentePersonalizada1 = new Font("Fira Code Nerd Font Mono", Font.BOLD | Font.ITALIC, 10);

    private Font fuentePersonalizada2 = new Font("Ink Free", Font.BOLD | Font.ITALIC, 15);

    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private ButtonGroup grupoRadioButtons;

    private JSlider sliderHorizontal;


    public Ventana1(){
        setBounds(900,600,400,400);
        setTitle("Pruebas examen");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMenuSuperior();
        setCombobox();
        setCombobox2();
        setBotonAbrirVentana();
        setBotonSeleccionarFuente();
        setGrupoDeRadioButtons();
        setSlideHorizontal();
        setLabel();
        setVisible(true);
    }


    private void setMenuSuperior() {
        // Toda la barra
        JMenuBar menuSuperior = new JMenuBar();
        //Cada elmento de la barra principal
        JMenu menuAbrir = new JMenu("Abrir");
        JMenu menuCerrar = new JMenu("Cerrar");
        JMenu menuEditar = new JMenu("Editar");
        //Cada subelemento de cada elemento de la barra principal
        JMenuItem abrirInputDialog = new JMenuItem("Option pane Input Dialog");
        JMenuItem abrirConfirmDialog = new JMenuItem("Option pane Confirm Dialog");
        JMenuItem abrirMessage = new JMenuItem("Option pane Message Dialog");
        //Cada subelemento de cada elemento de la barra principal
        JMenuItem cerrarVentana1 = new JMenuItem("Cerrar ventana 1");
        JMenuItem cerrarVentana2 = new JMenuItem("Cerrar ventana 2");
        JMenuItem cerrarVentana3 = new JMenuItem("Cerrar ventana 3");
        //Cada subelemento de cada elemento de la barra principal
        JMenuItem cambiarFuenteLabel = new JMenuItem("Cambiar Fuente label");
        JMenuItem cambiarColorFonfoLabel = new JMenuItem("Cambiar Color De Fonfolabel");
        JMenuItem cambiarTamanoLabel = new JMenuItem("Cambiar Tamanho label");

        menuAbrir.add(abrirInputDialog);
        menuAbrir.add(abrirConfirmDialog);
        menuAbrir.add(abrirMessage);

        menuCerrar.add(cerrarVentana1);
        menuCerrar.add(cerrarVentana2);
        menuCerrar.add(cerrarVentana3);

        menuEditar.add(cambiarFuenteLabel);
        menuEditar.add(cambiarColorFonfoLabel);
        menuEditar.add(cambiarTamanoLabel);

        menuSuperior.add(menuAbrir);
        menuSuperior.add(menuCerrar);
        menuSuperior.add(menuEditar);
        setJMenuBar(menuSuperior);

        abrirInputDialog.addActionListener(actionEvent -> JOptionPane.showInputDialog(null,"Input","Input Dialog"));

        abrirConfirmDialog.addActionListener(actionEvent -> {
            int opcionSeleccionada = JOptionPane.showConfirmDialog(null," Confirm dialog");
            switch (opcionSeleccionada){
                case 0 -> System.out.println("Pulsada opcion 0");
                case 1 -> System.out.println("Pulsada opcion 1");
            }
        });

        abrirMessage.addActionListener(e -> JOptionPane.showMessageDialog(null,"Message Dialog"));
        cambiarFuenteLabel.addActionListener(e -> {
            if (jLabel.getFont().equals(fuentePersonalizada1)){
                jLabel.setFont(fuentePersonalizada2);
            }else{
                jLabel.setFont(fuentePersonalizada1);
            }
        });

    }

    private void setLabel() {
        jLabel = new JLabel("Label para probar a cambiar cosas");
        jLabel.setBounds(10,120,350,50);
        jLabel.setFont(fuentePersonalizada1);
        jLabel.setOpaque(true);
//        jLabel.setBackground(Color.BLUE);
        add(jLabel);
    }

    private void setBotonAbrirVentana() {
        jbutton1 = new JButton("Abrir ventana");
        jbutton1.setBounds(10,50,150,50);
        jbutton1.setVisible(true);
        add(jbutton1);
        jbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceSeleccionado = jComboBox1.getSelectedIndex();
                switch (indiceSeleccionado){
                    case 0 -> new Ventana2();
                    case 1 -> new Ventana3();
                    case 2 -> System.out.println("Elegida ventana 4");
                }
            }
        });
    }

    private void setBotonSeleccionarFuente() {
        jbutton2 = new JButton("Seleccionar fuente");
        jbutton2.setBounds(210,50,150,50);
        add(jbutton2);
        jbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int indiceSeleccionado = jComboBox2.getSelectedIndex();
                switch (indiceSeleccionado){
                    case 0 -> {
                        jLabel.setFont(fuentePersonalizada1);
                        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
                        jLabel.setVerticalAlignment(SwingConstants.TOP);
                    }
                    case 1 -> {
                        jLabel.setFont(fuentePersonalizada2);
                        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
                        jLabel.setVerticalAlignment(SwingConstants.CENTER);
                    }

                }
            }
        });
    }

    private void setCombobox() {
        String[] elecciones = {"Ventana 2","Ventana 3"};
        jComboBox1 = new JComboBox<>(elecciones);
        jComboBox1.setBounds(10,100,150,20);
        jComboBox1.addItem("Ventana 4");
        jComboBox1.setVisible(true);
        add(jComboBox1);

    }

    private void setCombobox2() {
        String[] elecciones = {"Estilo 1","Estilo 2"};
        jComboBox2 = new JComboBox<>(elecciones);
        jComboBox2.setBounds(210,100,150,20);
        jComboBox2.setVisible(true);
        add(jComboBox2);

    }

    private void setGrupoDeRadioButtons() {
        grupoRadioButtons = new ButtonGroup();
        //Botones aislados
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        //Botones agrupados
        grupoRadioButtons.add(radioButton1);
        grupoRadioButtons.add(radioButton2);
        grupoRadioButtons.add(radioButton3);

        //Colocamos los radioButton en el frame
        radioButton1.setBounds(10, 170, 150, 30); // Posición y tamaño
        radioButton2.setBounds(10, 200, 150, 30);
        radioButton3.setBounds(10, 230, 150, 30);

        radioButton1.setSelected(true);
        radioButton1.setText("Radio button 1");
        radioButton2.setText("Radio button 2");
        radioButton3.setText("Radio button 3");

        //Añadir botones al frame
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
    }


    private void setSlideHorizontal() {
        sliderHorizontal = new JSlider(JSlider.HORIZONTAL,0,200,50);
        sliderHorizontal.setBounds(10,260,300,50);
        sliderHorizontal.setMajorTickSpacing(20); // Espaciado de marcas principales
        sliderHorizontal.setMinorTickSpacing(5);  // Espaciado de marcas secundarias
        sliderHorizontal.setPaintTicks(true);     // Mostrar marcas
        sliderHorizontal.setPaintLabels(true);
        add(sliderHorizontal);
        System.out.println("Valor del slider" + sliderHorizontal.getValue());
        sliderHorizontal.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println("El valor es -> " + sliderHorizontal.getValue());
            }
        });
    }

}
