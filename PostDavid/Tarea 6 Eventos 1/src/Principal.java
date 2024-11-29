import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {
    private int tamanoX;
    private int tamanoY;
    private JLabel jLabel;
    private JSlider jSlider;
    private JComboBox <String> jComboBox;
    private JTextArea jTextArea;
    ButtonGroup buttonGroup;
    private JRadioButton jRadioButtonMasculino;
    private JRadioButton jRadioButtonFemenino;



    Principal(){
        tamanoX = 800;
        tamanoY=800;
        obtenerTamanoPantalla();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(tamanoX,tamanoY);
        setTitle("Ejercicio 6");
        setLayout(null);
        setLabel();
        setSlider();
        setCombobox();
        setTextArea();
        setButtonGroup();
        setVisible(true);
    }

    private void obtenerTamanoPantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - getWidth()) / 2;
        int y = (pantalla.height - getHeight()) / 2;
        setLocation(x -(tamanoX/2), y - (tamanoY/2));
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
        jTextArea = new JTextArea("Texto del constructor",15,2);
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
}
