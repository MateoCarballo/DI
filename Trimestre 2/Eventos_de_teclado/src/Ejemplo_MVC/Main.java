package Ejemplo_MVC;

public class Main {
    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraModelo modelo = new CalculadoraModelo();
        new CalculadoraControlador(vista, modelo);
    }
}