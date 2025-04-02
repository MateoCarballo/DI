/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_ComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Modelo {

    private Controlador controlador;
    private DefaultComboBoxModel datosComboBox;

    public Modelo() {
        datosComboBox = new DefaultComboBoxModel();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void añadirElemnto(String s) {
        datosComboBox.addElement(s);
    }

    public void borraElementoPorIndice(int indiceParaBorrar) {
        if (indiceParaBorrar == -1) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar toda la lista?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                System.out.println("Has borrado toda la lista ");
                datosComboBox = new DefaultComboBoxModel();
                return;
            } else {
                return;
            }

        }
        datosComboBox.removeElementAt(indiceParaBorrar);
    }

    public DefaultComboBoxModel getDatosListaTabla() {
        return datosComboBox;
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
