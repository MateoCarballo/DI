/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entregable_3_1.controlador;

import com.mycompany.entregable_3_1.vista.VentanaCreditos;
import com.mycompany.entregable_3_1.vista.VentanaInicioSesion;
import com.mycompany.entregable_3_1.vista.VentanaJuego;
import com.mycompany.entregable_3_1.vista.VentanaPrincipal;
import com.mycompany.entregable_3_1.vista.VentanaRegistro;
import com.mycompany.entregable_3_1.vista.VentanaTablaRecords;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author mateo
 */
public class Controller implements ActionListener {

    Boolean algunaVentanaAbierta = false;
    VentanaPrincipal ventanaPpal;
    VentanaRegistro ventanaRegistro;
    VentanaInicioSesion ventanaInicioSesion;
    VentanaJuego ventanaJ;
    VentanaTablaRecords VentanaRecords;
    VentanaCreditos VentanaC;

    public Controller() {
        ventanaPpal = new VentanaPrincipal(this);
        ventanaPpal.setVisible(true);
        ventanaRegistro.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        //Recogemos que comando estamos recibiendo y instanciamos el internal frame que corresponda a cada boton.
        //En primer lugar aseguramos que no este ya instanciada para solo poder tener una de cada tipo a la vez.
        //Despues de esto la creamos y se la pasamos al frame principal
        //solo haremos caso a cada una de las opciones del menu, cuando no tengamos ninguna ventana abierta
        //TODO falta meter ventana de ayuda
        switch (comando) {
            case "Inicio sesion" -> {
                if (ventanaInicioSesion == null) {
                    ventanaInicioSesion = new VentanaInicioSesion();
                    ventanaPpal.deleteFirstMessage();
                    ventanaInicioSesion.setVisible(true);
                    ventanaPpal.getjDesktopPane1().add(ventanaInicioSesion);
                }
            }
            case "Registro usuario" -> {
                if (ventanaRegistro == null) {
                    ventanaRegistro = new VentanaRegistro();
                    ventanaPpal.deleteFirstMessage();
                    ventanaRegistro.setVisible(true);
                    ventanaPpal.getjDesktopPane1().add(ventanaRegistro);
                }
            }
            case "Abrir juego" -> {
                ventanaPpal.deleteFirstMessage();
            }
            case "Records" -> {
                ventanaPpal.deleteFirstMessage();
            }
            case "Creditos" -> {
                ventanaPpal.deleteFirstMessage();
            }
            case "Primeros pasos" -> {
                ventanaPpal.deleteFirstMessage();
            }
            default ->
                System.out.println("Acción desconocida: " + comando);
        }
    }

    public void setAlgunaVentanaAbierta(Boolean algunaVentanaAbierta) {
        this.algunaVentanaAbierta = algunaVentanaAbierta;
    }

    
    
}
