/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Mateo
 */
public class Modelo {

    private Controlador controlador;
    private DefaultListModel<String> datosLista;

    public Modelo() {
        datosLista = new DefaultListModel<>();
    }
    
    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void  añadirElemnto(String s) {
        int nuevoIndice = datosLista.size();
        datosLista.add(nuevoIndice, s);
    }

    void borraElementoPorIndice(int indiceParaBorrar) {
        datosLista.remove(indiceParaBorrar);
    }

    public DefaultListModel<String> getDatosLista() {
        return datosLista;
    }
    
}
