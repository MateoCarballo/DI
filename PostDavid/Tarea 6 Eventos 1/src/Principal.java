import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    private final int tamanoX = 800;
    private final int tamanoY = 800;
    private int valorActualSlider = 0;
    private JMenuBar jMenuBar;
    private JLabel jLabel;
    private JLabel jlabelSlider;
    private JProgressBar jProgressBar;
    private JSlider jSlider;
    private JComboBox <String> jComboBox;
    private JTextArea jTextArea;
    ButtonGroup buttonGroup;
    private JRadioButton jRadioButtonMasculino;
    private JRadioButton jRadioButtonFemenino;
    private JButton jButton;
    private VentanaJSlider ventanaSlider;


    Principal(){
        definirPantalla();
        setMenuu();
        setLabel();
        setSlider();
        setLabelParaSlider();
        setProgressBar();
        setCombobox();
        setTextArea();
        setButtonGroup();
        setButtonOperacion();
        setVisible(true);
    }

    private void definirPantalla(){
        obtenerTamanoPantalla();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 6");
        setLayout(null);
    }

    private void obtenerTamanoPantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - getWidth()) / 2;
        int y = (pantalla.height - getHeight()) / 2;
        setBounds(x -(tamanoX/2), y - (tamanoY/2),tamanoX,tamanoY);
    }



    private void setMenuu() {
        //Instancio la barra de menu de la ventana
        jMenuBar = new JMenuBar();

        //Opciones del menu a primer nivel
        JMenu jMenuSlide = new JMenu("Slider");
        JMenu jMenuModificaLabel = new JMenu("Label");

        // Opciones del menu a segundo nivel
        JMenuItem jMenuItemAbrirSlider = new JMenuItem("Abrir Slider");
        jMenuItemAbrirSlider.addActionListener(actionEvent -> new VentanaJSlider());
        jMenuSlide.add(jMenuItemAbrirSlider);

        JMenuItem jMenuItemCambiarColorLabel = new JMenuItem("Modificar color label");
        jMenuItemCambiarColorLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (jLabel.getBackground() == Color.BLUE){
                    jLabel.setBackground(Color.RED);
                }else{
                    jLabel.setBackground(Color.BLUE);
                }
            }
        });
        jMenuModificaLabel.add(jMenuItemCambiarColorLabel);

        //Relacionamos las opciones jMenuItem a cada JMenu
        jMenuBar.add(jMenuSlide);
        jMenuBar.add(jMenuModificaLabel);

        //Agregamos el jMenuBar al frame
        setJMenuBar(jMenuBar);

    }

    private void setLabel() {
        jLabel = new JLabel("Ejercicio con varios componentes");
        jLabel.setBounds(150,50,500,100);
        jLabel.setFont(new Font("Fira Code",Font.BOLD,25));
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.red);
        add(jLabel);
    }

    private void setSlider(){
        jSlider = new JSlider(JSlider.HORIZONTAL,0,100,50);
        jSlider.setBounds(150,200,300,45);
        jSlider.setMajorTickSpacing(1);
        jSlider.setMinorTickSpacing(1);
        jSlider.setPaintTicks(true);
        valorActualSlider = jSlider.getValue();
        //jSlider.setPaintLabels(true);
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                valorActualSlider = jSlider.getValue();
                jProgressBar.setValue(valorActualSlider);
                jlabelSlider.setText(valorActualSlider + "%");
            }
        });
        add(jSlider);

    }

    private void setLabelParaSlider(){
        //TODO pendiente
        jlabelSlider = new JLabel(String.valueOf(valorActualSlider));
        jlabelSlider.setBounds(150,170,75,35);
        jlabelSlider.setFont(new Font("Fira Code",Font.BOLD,14));
        add(jlabelSlider);

    }

    private void setProgressBar(){
        jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
        jProgressBar.setValue(valorActualSlider);

    }

    private void setCombobox() {
        String [] contenidoCombobox = {"Ruben","Mateo","Miriam","Mauro","Ramón","Carlos"};
        jComboBox = new JComboBox<>(contenidoCombobox);
        jComboBox.setBounds(200,600,120,25);
        add(jComboBox);
    }



    private void setTextArea() {
        jTextArea = new JTextArea("Texto del constructor");
        jTextArea.setBounds(150,250,300,300);
        add(jTextArea);
    }

    private void setButtonGroup() {
        jRadioButtonMasculino = new JRadioButton("Hombre");
        jRadioButtonFemenino = new JRadioButton("Mujer");
        jRadioButtonMasculino.setBounds(600,300,80,30);
        jRadioButtonFemenino.setBounds(600,330,80,30);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButtonMasculino);
        buttonGroup.add(jRadioButtonFemenino);
        /*
        Para poner por defecto un valor -> como debe escribir cada valor mejor dejarlos sin marcar y usar eventos
        jRadioButtonFemenino.setSelected(true);
        */
        add(jRadioButtonMasculino);
        add(jRadioButtonFemenino);
    }

    private void setButtonOperacion(){
        jButton = new JButton("Lanzar JPane con opciones");
        jButton.setBounds(200,650,300,50);
        jButton.setOpaque(true);
        jButton.setBackground(Color.LIGHT_GRAY);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Opciones();
            }
        });
        add(jButton);

    }
}
