package com.mycompany.entregable_3_1.controlador;

import com.mycompany.entregable_3_1.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class Controller implements ActionListener {

    boolean algunaVentanaAbierta = false;
    VentanaPrincipal ventanaPpal;
    VentanaRegistro ventanaRegistro;
    VentanaInicioSesion ventanaInicioSesion;
    VentanaJuego ventanaJ;
    VentanaTablaRecords ventanaRecords;
    VentanaCreditos ventanaCreditos;

    public Controller() {
        ventanaPpal = new VentanaPrincipal(this);
        ventanaPpal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // Solo permitir abrir ventana si no hay otra abierta
        if (algunaVentanaAbierta) {
            System.out.println("Ya hay una ventana abierta, cierra primero la actual.");
            return;
        }

        ventanaPpal.deleteFirstMessage(); // (Imagino que esto limpia algún mensaje inicial)

        switch (comando) {
            case "Inicio sesion" -> abrirVentanaInicioSesion();
            case "Registro usuario" -> abrirVentanaRegistro();
            case "Abrir juego" -> abrirVentanaJuego();
            case "Records" -> abrirVentanaRecords();
            case "Creditos" -> abrirVentanaCreditos();
            case "Primeros pasos" -> abrirVentanaAyuda();
            default -> System.out.println("Acción desconocida: " + comando);
        }
    }

    private void abrirVentanaInicioSesion() {
        ventanaInicioSesion = new VentanaInicioSesion();
        agregarVentana(ventanaInicioSesion);
    }

    private void abrirVentanaRegistro() {
        ventanaRegistro = new VentanaRegistro();
        agregarVentana(ventanaRegistro);
    }

    private void abrirVentanaJuego() {
        ventanaJ = new VentanaJuego();
        agregarVentana(ventanaJ);
    }

    private void abrirVentanaRecords() {
        ventanaRecords = new VentanaTablaRecords();
        agregarVentana(ventanaRecords);
    }

    private void abrirVentanaCreditos() {
        ventanaCreditos = new VentanaCreditos();
        agregarVentana(ventanaCreditos);
    }

    private void abrirVentanaAyuda() {
        // Aquí iría tu ventana de ayuda si la tienes creada
    }

    private void agregarVentana(javax.swing.JInternalFrame ventana) {
        ventana.setVisible(true);
        ventanaPpal.getjDesktopPane1().add(ventana);
        algunaVentanaAbierta = true;

        ventana.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) { }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                limpiarReferenciasVentanas();
            }

            @Override
            public void internalFrameOpened(InternalFrameEvent e) { }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) { }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) { }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) { }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) { }
        });
    }

    private void limpiarReferenciasVentanas() {
        ventanaInicioSesion = null;
        ventanaRegistro = null;
        ventanaJ = null;
        ventanaRecords = null;
        ventanaCreditos = null;
        algunaVentanaAbierta = false;
    }
}
