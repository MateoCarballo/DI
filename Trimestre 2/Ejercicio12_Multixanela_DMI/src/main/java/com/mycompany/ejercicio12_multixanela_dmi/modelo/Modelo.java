package com.mycompany.ejercicio12_multixanela_dmi.modelo;

import com.mycompany.ejercicio12_multixanela_dmi.controlador.Controlador;
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
        cargarDatosDePrueba();
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

    public boolean existeTrabajador(String txtDNI) {
        for (Trabajador t : trabajadores){
            if (t.getDni().equalsIgnoreCase(txtDNI)) return true;
        }
        return false;
    }

    public void agregarTrabajador(String txtNome, String txtApelido1, String txtApelido2, String txtDNI, String profesion, String provincia) {
        trabajadores.add(new Trabajador(txtDNI,txtNome,txtApelido1,txtApelido2,provincia,profesion));
    }




    //METODO PARA PROBAR
    public void cargarDatosDePrueba() {
        // Agregar provincias de prueba
        provincias.addAll(Arrays.asList("A Coruña", "Lugo", "Ourense", "Pontevedra", "Madrid", "Barcelona"));

        // Agregar profesiones de prueba
        profesiones.addAll(Arrays.asList("Ingeniero", "Médico", "Profesor", "Abogado", "Carpintero", "Electricista"));

        // Agregar trabajadores de prueba
        trabajadores.add(new Trabajador("12345678A", "Juan", "Pérez", "Gómez", "Madrid", "Ingeniero"));
        trabajadores.add(new Trabajador("87654321B", "María", "López", "Fernández", "Barcelona", "Médico"));
        trabajadores.add(new Trabajador("11223344C", "Carlos", "Rodríguez", "Sánchez", "A Coruña", "Profesor"));
        trabajadores.add(new Trabajador("22334455D", "Laura", "González", "Martínez", "Lugo", "Abogado"));
        trabajadores.add(new Trabajador("33445566E", "Pedro", "Fernández", "Pérez", "Ourense", "Carpintero"));
        trabajadores.add(new Trabajador("44556677F", "Ana", "Gómez", "Rodríguez", "Pontevedra", "Electricista"));
    }

}
