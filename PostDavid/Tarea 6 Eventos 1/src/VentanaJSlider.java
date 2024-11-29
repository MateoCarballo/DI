import javax.swing.*;
import java.awt.*;

public class VentanaJSlider extends JFrame {
    private final Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    private final int tamanoX = 400;
    private final int tamanoY = 400;
    private JSlider jSlider;


    public VentanaJSlider(){
        definirPantalla();
        obtenerTamanoPantalla();
        setJslider();
    }

    private void definirPantalla(){
        obtenerTamanoPantalla();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(tamanoX,tamanoY);
        setTitle("Slider");
        setLayout(null);
        setVisible(true);
    }

    private void obtenerTamanoPantalla() {
        setLocation(pantalla.width/40, pantalla.height/10);
    }

    private void setJslider() {
        jSlider = new JSlider(JSlider.HORIZONTAL,0,10,5);
        jSlider.setMajorTickSpacing(1);
        jSlider.setMinorTickSpacing(1);
        jSlider.setPaintLabels(true);
        jSlider.setPaintTicks(true);
        jSlider.setBounds(tamanoX/4, tamanoY/6,tamanoX/2,tamanoY/2);
        add(jSlider);
    }
}
