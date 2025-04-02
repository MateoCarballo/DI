/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import javax.swing.DefaultListModel;

/**
 *
 * @author Mateo
 */
public class Modelo {
    
    private DefaultListModel<String> datosLista;

    public Modelo() {
        datosLista = new DefaultListModel<>();
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
