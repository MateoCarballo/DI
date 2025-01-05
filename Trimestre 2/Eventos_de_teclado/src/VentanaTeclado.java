import javax.swing.*;
import java.awt.*;

public class VentanaTeclado extends JFrame {
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
    Aqui seteo la ventana que llamo desde la main
     llamando a su vez al metodo que setea cada uno de los componentes
     */
    VentanaTeclado(){
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

}
