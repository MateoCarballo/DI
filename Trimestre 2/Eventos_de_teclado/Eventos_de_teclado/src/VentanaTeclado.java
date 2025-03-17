import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaTeclado extends JFrame implements KeyListener {
/*
En esta parte defino todos los elementos que tendra la ventana
Primero todas las etiquetas y despues las areas de texto
 */

    JLabel labelTitulo;
    JLabel labelTextAreaEntrada;
    JLabel labelTextAreaFiltradasVocales;
    JLabel labelMensajeTeclaSalida;
    JLabel labelMensajeVocalesTecleadas;

    JTextArea textAreaEntradaTextoSinFiltrar;
    JTextArea textAreaFiltradasVocales;
/*
Aqui declaro todas las variables que utilizare en la ultima parte para la logica del programa
 */
    char caracterTecleado;
    char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    int vocalesTecleadas;
    boolean teclaPresionada;

    /*
    Aqui seteo la ventana que llamo desde la main
     llamando a su vez al metodo que setea cada uno de los componentes
     */
    VentanaTeclado(){
        vocalesTecleadas = 0;
        teclaPresionada=false;
        setTitle("Eventos de Teclado");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setearTituloVentana();
        setearTituloTextAreaEntrada();
        setearTituloTextAreaFiltradasVocales();
        setearTextAreaEntradaTexto();
        setearTextAreaFiltradasVocales();
        setLabelMensajeTeclaSalida();
        setLabelMensajeVocalesTecleadas();
        setVisible(true);
    }
    // Metodo para setear el titulo principal de la ventana
    private void setearTituloVentana() {
        labelTitulo = new JLabel("Eventos de teclado");
        labelTitulo.setBounds(0,20,600,40);
        labelTitulo.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setVerticalAlignment(SwingConstants.CENTER);
        add(labelTitulo);
    }
// Metodo para setear el título del primer textArea

    private void setearTituloTextAreaEntrada() {
        labelTextAreaEntrada = new JLabel("Area de texto para la entrada por teclado");
        labelTextAreaEntrada.setBounds(20,70,580,40);
        add(labelTextAreaEntrada);
    }
// Metodo para setear el primer textArea

    private void setearTextAreaEntradaTexto() {
        textAreaEntradaTextoSinFiltrar = new JTextArea();
        textAreaEntradaTextoSinFiltrar.setBounds(20,120,540,100);
        textAreaEntradaTextoSinFiltrar.addKeyListener(this);
        textAreaEntradaTextoSinFiltrar.setEditable(false);
        add(textAreaEntradaTextoSinFiltrar);
    }
// Metodo para setear el titulo del segundo textArea

    private void setearTituloTextAreaFiltradasVocales() {
        labelTextAreaFiltradasVocales = new JLabel("Area de texto para mostrar las vocales filtradas");
        labelTextAreaFiltradasVocales.setBounds(20,230,580,40);
        add(labelTextAreaFiltradasVocales);
    }

    // Metodo para setear el segudno textArea

    private void setearTextAreaFiltradasVocales() {
        textAreaFiltradasVocales = new JTextArea();
        textAreaFiltradasVocales.setBounds(20,280,540,100);
        textAreaFiltradasVocales.setEditable(false);
        add(textAreaFiltradasVocales);
    }

    //Metodo para setear los mensajes de la parte inferior con la tecla de salida y el numero de vocales

    private void setLabelMensajeTeclaSalida() {
        labelMensajeTeclaSalida = new JLabel("Pulsa la tecla 'esc' para salir");
        labelMensajeTeclaSalida.setBounds(20, 520, 280, 30); // Lado izquierdo
        labelMensajeTeclaSalida.setHorizontalAlignment(SwingConstants.LEFT);
        add(labelMensajeTeclaSalida);
    }

    private void setLabelMensajeVocalesTecleadas() {
        labelMensajeVocalesTecleadas = new JLabel("Vocales tecleadas: 0");
        labelMensajeVocalesTecleadas.setBounds(280, 520, 280, 30); // Lado derecho
        labelMensajeVocalesTecleadas.setHorizontalAlignment(SwingConstants.RIGHT);
        add(labelMensajeVocalesTecleadas);
    }

    /*
    Eventos de teclado
        KeyPressed de desencadena cuando pulsamos la tecla (da igual si la soltamos o la mantenemos)
        KeyRelease se desencadena cuando soltamos la tecla
        KeyTyped cuando tecleamos por completo un elemento visible.

        Diferencia ! -> KeyTyped es para tecleos "visibles" y los otros son para todas las teclas
     */

    /*
    Registro que se esta pulsando una tecla, la primera vez que paso compruebe si ya ha sido presionada
    y si es asi no hago nada. El evento KeyReleased es el que me pasara este booleando a false
    asi podre asegurar que aunque mantenga una tecla, la letra pulsada solo se escribe y contabiliza uan vez
     */

    @Override
    public void keyPressed(KeyEvent e) {
        if (teclaPresionada){
            return;
        }

        caracterTecleado = e.getKeyChar();

        // Verifica si la tecla es una letra o un espacio
        if (Character.isLetter(caracterTecleado) || caracterTecleado == ' ') {
            // Escribir en el primer JTextArea
            textAreaEntradaTextoSinFiltrar.append(String.valueOf(caracterTecleado));
            teclaPresionada = true;
            // Si es una vocal, escribirla en el segundo JTextArea y actualizar el contador
            for (char vocal : vocales) {
                if (caracterTecleado == vocal) {
                    textAreaFiltradasVocales.append(String.valueOf(caracterTecleado));
                    vocalesTecleadas++;
                    labelMensajeVocalesTecleadas.setText("Vocales tecleadas: " + vocalesTecleadas);
                    break;
                }
            }
        }

    }
/*
Aqui me encargo de poner el booleano a false una vez se suelte la tecla para poder presionar y registrar otra nueva
 */
    @Override
    public void keyReleased(KeyEvent e) {
        teclaPresionada = false;
        //Tengo que registrar aqui cualquier tecla tecleada por consola porque en el evneto typed solo se pueden registrar teclas visibles (letras, numeros y simbolos)
        System.out.println(e.getKeyChar());
    }
/*
Cerrarmos la app si se pulsa la tecla escape con una ventana de confirmacion
 */
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres salir?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
