/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class Alfombra {
    private String modelo;
    private String cor;
    private String ancho;
    private String alto;
    
    public Alfombra(){
        
    }

    public Alfombra(String modelo, String cor, String ancho, String alto) {
        this.modelo = modelo;
        this.cor = cor;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    } 
    
    @Override
    public String toString() { // Importante: Representación en cadena
        return "Modelo: " + modelo + ", Color: " + cor + ", Ancho: " + ancho + ", Alto: " + alto;
    }
}
