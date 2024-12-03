import javax.swing.*;

public class Opciones extends JOptionPane {

    public Opciones() {
        String [] opciones = {"Opcion 1", "Abrir VentanJSlider", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(
                null,              // Componente padre (null para centrar)
                "¿Qué acción deseas realizar?",   // Mensaje principal
                "Título Personalizado",          // Título de la ventana
                JOptionPane.DEFAULT_OPTION,     // Tipo de opciones (botones personalizados)
                JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje (ícono de información)
                null,                           // Ícono personalizado (null para usar el predeterminado)
                opciones,                       // Textos personalizados para los botones
                opciones[0]                     // Botón seleccionado por defecto
        );

        switch(seleccion){
            // Cambiar el ultimo valor qu esta ahora a cero cambia el tipo de ventana que sale al pulsar cada boton
            case 0 -> showMessageDialog(null,"Opcion 1 pulsada","Opcion 1",0);
            case 1 -> new VentanaJSlider();
            //showMessageDialog(null,"Opcion 2 pulsada","Opcion 2",1);
            case 2 -> showMessageDialog(null,"Opcion 3 pulsada","Opcion 3",2);

        }
    }
}
