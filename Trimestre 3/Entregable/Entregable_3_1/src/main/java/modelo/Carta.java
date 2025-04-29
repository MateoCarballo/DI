/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mateo
 */
public class Carta {
    private String nombre; 
    private boolean descubierta;

    public Carta(String nombre) {
        this.nombre = nombre;
        this.descubierta = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }
}

