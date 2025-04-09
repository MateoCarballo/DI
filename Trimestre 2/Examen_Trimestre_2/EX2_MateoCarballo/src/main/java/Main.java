
import appMateo.modelo.Modelo;
import controlador.Controlador;
import vista.VentanaPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a22mateoca
 */
public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        VentanaPrincipal ventanappal = new VentanaPrincipal();
        Controlador controlador = new Controlador(modelo,ventanappal);
        ventanappal.setControlador(controlador);
    }
}
