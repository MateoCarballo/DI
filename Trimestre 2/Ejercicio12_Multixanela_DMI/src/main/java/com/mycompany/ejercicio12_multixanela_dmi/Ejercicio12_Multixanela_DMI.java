/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12_multixanela_dmi;
import com.mycompany.ejercicio12_multixanela_dmi.controlador.Controlador;
import com.mycompany.ejercicio12_multixanela_dmi.modelo.Modelo;
import com.mycompany.ejercicio12_multixanela_dmi.vista.VentanaContenedora;

/**
 *
 * @author mateo
 */
public class Ejercicio12_Multixanela_DMI {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Modelo modelo = new Modelo();
        VentanaContenedora ventanaPrincipal = new VentanaContenedora(controlador);

        controlador.setModelo(modelo);
        controlador.setVentanaPrincipal(ventanaPrincipal);
        modelo.setController(controlador);
    }
}
