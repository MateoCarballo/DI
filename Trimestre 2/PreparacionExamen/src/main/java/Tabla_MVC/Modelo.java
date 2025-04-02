/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tabla_MVC;

import MVC.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo
 */
public class Modelo {

    private final String[] encabezado = {"Columna 1", "Columna 2", "Columna 3", "Columna 4"};
    private Controlador controlador;
    private DefaultTableModel datosListaTabla;

    public Modelo() {
        datosListaTabla = new DefaultTableModel(encabezado, 0);
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void añadirElemnto(String[] s) {
        datosListaTabla.addRow(s);
    }

    public void borraElementoPorIndice(int indiceParaBorrar) {
        if (indiceParaBorrar == -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar toda la lista?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                System.out.println("Has borrado toda la lista ");
                datosListaTabla = new DefaultTableModel(encabezado, 0);
                return;
            } else {
                return;
            }

        }
        datosListaTabla.removeRow(indiceParaBorrar);
    }

    public DefaultTableModel getDatosListaTabla() {
        return datosListaTabla;
    }

    /*
    void borraElementoPorIndice(int indiceParaBorrar) {
        datosLista.remove(indiceParaBorrar);
    }
    
    public DefaultListModel<String> getDatosLista() {
        return datosLista;
    }
    
     */
}
