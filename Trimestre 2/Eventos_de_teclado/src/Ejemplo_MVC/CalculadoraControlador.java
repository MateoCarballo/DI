package Ejemplo_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador implements ActionListener {
    private CalculadoraVista vista;
    private CalculadoraModelo modelo;

    public CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.agregarControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand(); // Identifica qué botón se presionó

        switch (comando) {
            case "Sumar":
                try {
                    int num1 = vista.getNumero1();
                    int num2 = vista.getNumero2();
                    modelo.sumar(num1, num2);
                    vista.setResultado(modelo.getResultado());
                } catch (NumberFormatException ex) {
                    vista.setResultado(0);
                    System.out.println("Error: Ingresa solo números.");
                }
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
        }
    }
}
