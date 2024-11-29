import javax.swing.*;
import java.awt.*;

public class Main {

    static final int ESPACIO_ENTRE_JLABEL = 30;

    static final int ALTURA_JLABEL = 25;
    static final int ANCHO_JLABEL = 150;

    static final int ALTURA_TJEXTFIELD = 25;
    static final int ANCHO_JTEXTFIELD = 150;


    static final int VALOR_Y_PRIMERA_FILA = 20 ;
    static final int VALOR_X_PRIMERA_COLUMNA = 10 ;
    static final int VALOR_X_SEGUNDA_COLUMNA = 150;




    public static void main(String[] args) {
        //lanzarVentanaAzulRojo();
        lanzarFormulario();
    }

    private static void lanzarFormulario() {
        JFrame datosJFrame = new JFrame("Introduzca datos");
        datosJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        datosJFrame.setSize(320,340);
        datosJFrame.setLayout(null);

        // PREAPARACIONES DE LOS TAMAÑOS DE CADA ELEMENTO QUE VAMOS A AÑADIR

        JLabel radioJLabel = new JLabel("Ingrese el radio");
        radioJLabel.setSize(ANCHO_JLABEL,ALTURA_JLABEL);
        JLabel alturaJLabel = new JLabel("Ingrese la altura");
        alturaJLabel.setSize(ANCHO_JLABEL,ALTURA_JLABEL);
        JLabel areaJLabel = new JLabel("El area es: ");
        areaJLabel.setSize(ANCHO_JLABEL,ALTURA_JLABEL);
        JLabel volumenJLabel = new JLabel(" El volumen es: ");
        volumenJLabel.setSize(ANCHO_JLABEL,ALTURA_JLABEL);

        JTextField radioJTextField = new JTextField();
        radioJTextField.setSize(ANCHO_JTEXTFIELD,ALTURA_TJEXTFIELD);
        JTextField alturaJTextField = new JTextField();
        alturaJTextField.setSize(ANCHO_JTEXTFIELD,ALTURA_TJEXTFIELD);

        int jButtonWidth1 = ((radioJLabel.getWidth() + radioJTextField.getWidth())/2) - 5;
        int jButtonWidth2 = jButtonWidth1/2 + 15;
        int jButtinHeight = radioJTextField.getHeight();

        JButton calcularJButton = new JButton("Calcular");
        calcularJButton.setSize(jButtonWidth1,jButtinHeight);
        JButton reiniciarJButton = new JButton("Reiniciar");
        reiniciarJButton.setSize(jButtonWidth1,jButtinHeight);

        JButton okJButton = new JButton("OK");
        okJButton.setSize(jButtonWidth2,jButtinHeight);
        JButton cancelJButton = new JButton("Cancel");
        cancelJButton.setSize(jButtonWidth2,jButtinHeight);


        datosJFrame.setLocation(900,150);



        //PRIMERA FILA => CON UN LABEL Y UN TEXTFIELD
        datosJFrame.add(radioJLabel);
        radioJLabel.setLocation(VALOR_X_PRIMERA_COLUMNA, VALOR_Y_PRIMERA_FILA);
        datosJFrame.add(radioJTextField);
        radioJTextField.setLocation(VALOR_X_SEGUNDA_COLUMNA,VALOR_Y_PRIMERA_FILA);

        //SEGUNDA FILA => CON UN LABEL Y UN TEXTFIELD
        datosJFrame.add(alturaJLabel);
        alturaJLabel.setLocation(VALOR_X_PRIMERA_COLUMNA, VALOR_Y_PRIMERA_FILA + ESPACIO_ENTRE_JLABEL);
        datosJFrame.add(alturaJTextField);
        alturaJTextField.setLocation(VALOR_X_SEGUNDA_COLUMNA, VALOR_Y_PRIMERA_FILA + ESPACIO_ENTRE_JLABEL);


        //TERCERA Y CUARTA FILA => ESCRIBIMOS RESULTADOS
        datosJFrame.add(areaJLabel);
        areaJLabel.setLocation(VALOR_X_PRIMERA_COLUMNA, VALOR_Y_PRIMERA_FILA + (2* ESPACIO_ENTRE_JLABEL));
        datosJFrame.add(volumenJLabel);
        volumenJLabel.setLocation(VALOR_X_PRIMERA_COLUMNA, VALOR_Y_PRIMERA_FILA +(3* ESPACIO_ENTRE_JLABEL));

        //  QUINTA FILA => BOTONES CALCULAR Y REINICIAR
        datosJFrame.add(calcularJButton);
        calcularJButton.setLocation(VALOR_X_PRIMERA_COLUMNA,VALOR_Y_PRIMERA_FILA + (4*ESPACIO_ENTRE_JLABEL));
        datosJFrame.add(reiniciarJButton);
        reiniciarJButton.setLocation(VALOR_X_PRIMERA_COLUMNA + calcularJButton.getWidth(),VALOR_Y_PRIMERA_FILA + (4*ESPACIO_ENTRE_JLABEL));

        //  SEXTA FILA => BOTONES OK Y CANCEL
        datosJFrame.add(okJButton);
        okJButton.setLocation(VALOR_X_PRIMERA_COLUMNA + calcularJButton.getWidth() - okJButton.getWidth() -2,VALOR_Y_PRIMERA_FILA + (7*ESPACIO_ENTRE_JLABEL));
        datosJFrame.add(cancelJButton);
        cancelJButton.setLocation(VALOR_X_PRIMERA_COLUMNA + calcularJButton.getWidth() + 2,VALOR_Y_PRIMERA_FILA + (7*ESPACIO_ENTRE_JLABEL));


        datosJFrame.setVisible(true);
    }

    public static void lanzarVentanaAzulRojo(){
        JFrame principalJFrame = new JFrame();
        principalJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principalJFrame.setLayout(null);
        principalJFrame.setSize(600,400);
        principalJFrame.setTitle("Ejemplo de Layout a null");

        JButton redJButton = new JButton("Rojo");
        redJButton.setSize(100,100);
        Color red = Color.red;
        redJButton.setBackground(red);
        redJButton.setLocation(150,80);

        JButton blueJButton = new JButton("Azul");
        blueJButton.setSize(100,100);
        Color blue = Color.blue;
        blueJButton.setBackground(blue);
        blueJButton.setLocation(300,80);

        principalJFrame.add(redJButton);
        principalJFrame.add(blueJButton);

        principalJFrame.setLocation(100,150);

        principalJFrame.setVisible(true);
    }
}