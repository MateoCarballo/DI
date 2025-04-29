/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mateo
 */

public class JuegoMemoria {
    private List<Carta> cartas;
    private long tiempoInicio;
    private long tiempoFinal;

    public JuegoMemoria(List<String> nombresCartas) {
        cartas = new ArrayList<>();
        for (String nombre : nombresCartas) {
            cartas.add(new Carta(nombre));
            cartas.add(new Carta(nombre)); 
        }
        Collections.shuffle(cartas);
    }

    public void iniciarJuego() {
        tiempoInicio = System.currentTimeMillis();
    }

    public void terminarJuego() {
        tiempoFinal = System.currentTimeMillis();
    }

    public long getTiempoTotal() {
        return (tiempoFinal - tiempoInicio) / 1000; 
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public boolean comprobarPareja(Carta c1, Carta c2) {
        return c1.getNombre().equals(c2.getNombre());
    }

    public boolean todasDescubiertas() {
        for (Carta carta : cartas) {
            if (!carta.isDescubierta()) {
                return false;
            }
        }
        return true;
    }
}

