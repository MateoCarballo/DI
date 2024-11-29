import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {
    private int tamanoX;
    private int tamanoY;
    private JMenuBar jMenuBar;
    private JLabel jLabel;
    private JSlider jSlider;
    private JComboBox <String> jComboBox;
    private JTextArea jTextArea;
    ButtonGroup buttonGroup;
    private JRadioButton jRadioButtonMasculino;
    private JRadioButton jRadioButtonFemenino;
    private JButton jButton;


    Principal(){
        definirPantalla();
        setMenuu();
        setLabel();
        setSlider();
        setCombobox();
        setTextArea();
        setButtonGroup();
        setButtonOperacion();
        setVisible(true);
    }

    private void definirPantalla(){
        tamanoX = 800;
        tamanoY=800;
        obtenerTamanoPantalla();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(tamanoX,tamanoY);
        setTitle("Ejercicio 6");
        setLayout(null);
    }

    private void obtenerTamanoPantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - getWidth()) / 2;
        int y = (pantalla.height - getHeight()) / 2;
        setLocation(x -(tamanoX/2), y - (tamanoY/2));
    }



    private void setMenuu() {
        //Instancio la barra de menu de la ventana
        jMenuBar = new JMenuBar();

        //Opciones del menu a primer nivel
        JMenu jMenuSlide = new JMenu("Slider");
        JMenu jMenuModificaLabel = new JMenu("Label");

        // Opciones del menu a segundo nivel
        JMenuItem jMenuItemAbrirSlider = new JMenuItem("Abrir Slider");
        jMenuSlide.add(jMenuItemAbrirSlider);

        JMenuItem jMenuItemCambiarColorSlider = new JMenuItem("Modificar color label");
        jMenuModificaLabel.add(jMenuItemCambiarColorSlider);

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
        //jSlider.setPaintLabels(true);
        add(jSlider);
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
        add(jButton);
    }
}
