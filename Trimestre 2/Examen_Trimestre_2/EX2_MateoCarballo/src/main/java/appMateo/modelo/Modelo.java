/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appMateo.modelo;

import appMateo.modelo.Pelicula;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a22mateoca
 */

public class Modelo {
    
    private DefaultListModel<String> datosListaGenero;
    private DefaultTableModel datosTablaPelicula;
    private DefaultComboBoxModel datosComboBoxDirector;
    private DefaultComboBoxModel datosComboBoxGenero;
    private ArrayList<Pelicula> peliculasDisponibles;
    private ArrayList<Pelicula> peliculasFavoritas;
    private static final String[] cabeceraTabla = {"codPelicula", "titulo", "año", "director", "genero", "fecha"};
    
    public Modelo() {
        this.datosComboBoxDirector = new DefaultComboBoxModel();
        this.datosComboBoxGenero = new DefaultComboBoxModel();
        this.datosListaGenero = new DefaultListModel();
        this.datosTablaPelicula = new DefaultTableModel(cabeceraTabla, 0);
        this.peliculasDisponibles = peliculasDisponibles;
        this.peliculasFavoritas = peliculasFavoritas;
    }
    
    public void añadirPeliculaDatosTabla(){
        Pelicula p = peliculasDisponibles.getLast();
        String fecha = p.getFechaInsercion().format(DateTimeFormatter.ISO_DATE);
        String[]fila = {String.valueOf(p.getCodPelicula()),p.getTitulo(),String.valueOf(p.getAño()),p.getDirector(),p.getGenero(),fecha};
        datosTablaPelicula.addRow(fila);
    }
    
    public void añadirPelicula(Pelicula p) {
        peliculasDisponibles.add(p);
    }
    
    public void eliminarPelicula() {
        
    }
    
    public void añadirDirector(String nuevoDirector) {
        datosComboBoxDirector.addElement(nuevoDirector);
    }
    
    public void eliminarDirector(int index) {
        datosComboBoxDirector.removeElementAt(index);
    }
    
    public void añadirGenero(String nuevoGenero) {
        datosListaGenero.addElement(nuevoGenero);
        datosComboBoxGenero.addElement(nuevoGenero);
    }
    
    public void eliminarGenero(int index) {
        datosListaGenero.remove(index);
    }
    
    public DefaultListModel getDatosListaGenero() {
        return datosListaGenero;
    }
    
    public DefaultComboBoxModel getDatosListaGeneroParseada() {
        return datosComboBoxGenero;
    }
    
    public DefaultTableModel getDatosTablaPelicula() {
        return datosTablaPelicula;
    }
    
    public DefaultComboBoxModel getDatosComboBoxDirector() {
        return datosComboBoxDirector;
    }

    public ArrayList<Pelicula> getPeliculasDisponibles() {
        return peliculasDisponibles;
    }

    public String recogerIndiceGeneros(int indiceSeleccionadoUsuario) {
        return datosListaGenero.get(indiceSeleccionadoUsuario);
    }

    public String recogerIndiceDirectores(int indiceSeleccionadoUsuarioDirector) {
        return datosComboBoxDirector.getElementAt(indiceSeleccionadoUsuarioDirector).toString();
    }
    
    
}
