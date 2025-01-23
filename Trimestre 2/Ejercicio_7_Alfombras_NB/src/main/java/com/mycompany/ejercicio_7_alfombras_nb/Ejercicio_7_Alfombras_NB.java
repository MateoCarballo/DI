package com.mycompany.ejercicio_7_alfombras_nb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import Controlador.Controller;
import Vista.View;
import Modelo.Alfombra;

/**
 *
 * @author mateo
 */
public class Ejercicio_7_Alfombras_NB {

    public static void main(String[] args) {
        System.out.println("Arrancando");
        Alfombra model = new Alfombra();
        View view = new View();
        Controller controller = new Controller(view,model);
        System.out.println("Completado arranque");
    }
}
