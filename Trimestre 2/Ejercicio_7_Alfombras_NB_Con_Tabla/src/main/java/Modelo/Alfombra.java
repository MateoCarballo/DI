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
    private double ancho;
    private double alto;
    
    public Alfombra(){
        
    }

    public Alfombra(String modelo, String cor, double ancho, double alto) {
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

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

   
    public String[] toArrayOfString() {
        return new String [] {modelo,cor,String.valueOf(ancho),String.valueOf(alto)};
    }
}
