package com.mycompany.ejercicio_7_alfombras_nb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import Controlador.Controller;
import Vista.View;
import Modelo.Model;

/**
 *
 * @author mateo
 */
public class Ejercicio_7_Alfombras_NB {

    public static void main(String[] args) {
        System.out.println("Arrancando");
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
        System.out.println("Completado arranque");
    }
}
