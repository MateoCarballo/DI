/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_ComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Controlador implements ActionListener {

    private Modelo modelo;
    private Vista vista;

    public Controlador() {
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "Boton Añadir Pulsado" -> {
                if (vista.getjTextField1().getText().isBlank() || vista.getjTextField1().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Se ha producido un error", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String nuevoItem = vista.getjTextField1().getText();
                    modelo.añadirElemnto(nuevoItem);
                    vista.getjComboBox1().setModel(modelo.getDatosListaTabla());
                }
            }
            case "Boton Eliminar Pulsado" -> {
               int indiceComboBox = vista.getjComboBox1().getSelectedIndex();
               modelo.borraElementoPorIndice(indiceComboBox);
               vista.getjComboBox1().setModel(modelo.getDatosListaTabla());
            }
        }
    }

}
