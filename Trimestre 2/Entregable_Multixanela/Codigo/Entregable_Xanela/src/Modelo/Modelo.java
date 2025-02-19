package Modelo;// Modeloo

import Controlador.Controlador;

import java.lang.reflect.Array;
import java.util.*;

public class Modelo {

    private Controlador controller;
    private ArrayList<String> provincias ;
    private ArrayList<String> profesiones ;
    private ArrayList<Trabajador> trabajadores;

    public Modelo(){
        provincias = new ArrayList<>();
        profesiones = new ArrayList<>();
        trabajadores = new ArrayList<>();
    }

    public Controlador getController() {
        return controller;
    }

    public void setController(Controlador controller) {
        this.controller = controller;
    }

    public ArrayList<String> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<String> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<String> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(ArrayList<String> profesiones) {
        this.profesiones = profesiones;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean agregarProvincia(String nuevaEntrada){
        boolean existe = false;
        for (String provincia: provincias){
            if (provincia.equalsIgnoreCase(nuevaEntrada)) existe = true;
        }
        return existe;
    }

    public String[] addProvincia(String nuevaProvincia) {
        provincias.add(nuevaProvincia);
        return provincias.toArray(new String[provincias.size()]);
    }

    public String[] eliminarProvincia(String provinciaParaEliminar) {
        boolean tieneTrabajadores = false;
        for (Trabajador t :trabajadores){
            if (t.getProvincia().equalsIgnoreCase(provinciaParaEliminar)) tieneTrabajadores = true;
        }
        if (!tieneTrabajadores) provincias.remove(provinciaParaEliminar);
        return provincias.toArray(new String[provincias.size()]);
    }

    public boolean agregarProfesion(String nuevaProfesion) {
        boolean existe = false;
        for (String profesion: profesiones){
            if (profesion.equalsIgnoreCase(nuevaProfesion)) existe = true;
        }
        return existe;
    }
    public String[] addProfesion(String nuevaProfesion) {
        profesiones.add(nuevaProfesion);
        return profesiones.toArray(new String[profesiones.size()]);
    }

    public boolean eliminarProfesion(String profesionParaEliminar) {
        boolean existe = false;
        for (Trabajador t : trabajadores){
            if (t.getProfesion().equalsIgnoreCase(profesionParaEliminar)) existe = true;
        }
        return existe;
    }

    public String[] deleteProfesion(String profesionParaEliminar) {
        profesiones.remove(profesionParaEliminar);
        return profesiones.toArray(new String[profesiones.size()]);
    }
}
