import javax.swing.*;
import java.awt.*;

public class Slider extends JFrame {
    private int tamanoX;
    private int tamanoY;
    public Slider(){

    }

    private void setSlider(){
        setBounds(200,200,tamanoX,tamanoY);
    }

    private void obtenerTamanoPantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (pantalla.width - getWidth()) / 4;
        int y = (pantalla.height - getHeight()) / 4;
        setLocation(x,y);
    }
}
