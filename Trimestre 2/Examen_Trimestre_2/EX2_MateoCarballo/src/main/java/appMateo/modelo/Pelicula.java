/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appMateo.modelo;

import java.time.LocalDate;

/**
 *
 * @author a22mateoca
 */
public class Pelicula {
    
    private int codPelicula;
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String sinopsis;
    private LocalDate fechaInsercion;

    public Pelicula(int codPelicula, String titulo, int año, String director, String genero, String sinopsis) {
        this.codPelicula = codPelicula;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.fechaInsercion = LocalDate.now();
    }

    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public LocalDate getFechaInsercion() {
        return fechaInsercion;
    }

    public void setFechaInsercion(LocalDate fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }
    
    
    
    
    
}
