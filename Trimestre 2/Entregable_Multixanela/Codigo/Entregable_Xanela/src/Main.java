import Controlador.Controlador;
import Modelo.Modelo;
import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Modelo modelo = new Modelo();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(controlador);

        controlador.setModelo(modelo);
        controlador.setVentanaPrincipal(ventanaPrincipal);
        modelo.setController(controlador);
    }
}