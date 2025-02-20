package Controlador;

import Modelo.Modelo;
import Vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Controlador implements ActionListener {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaProvincias ventanaProvincias;
    private VentanaProfesiones ventanaProfesiones;
    private VentanaAltaTrabajador ventanaAltaTrabajador;
    private VentanaTrabajadoresDisponibles ventanaTrabajadoresDisponibles;
    private Modelo modelo;
    private boolean ventanaProvinciasAbierta = false;
    private boolean ventanaProfesionesAbierta = false;
    private boolean ventanaTrabajadoresDisponiblesAbierta = false;

    public Controlador( ) {

    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    // Instanciar las nuevas ventanas
    public void abrirVentanaProvincias() {
        if ((ventanaProvincias == null || !ventanaProvincias.isVisible() && !ventanaProvinciasAbierta) ) {
            ventanaProvincias = new VentanaProvincias(this);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Ya tienes una ventana abierta",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);

        }
    }

    public void abrirVentanaProfesiones() {
        if ((ventanaProfesiones == null || !ventanaProfesiones.isVisible()) && !ventanaProfesionesAbierta) {
            ventanaProfesiones = new VentanaProfesiones(this);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Ya tienes una ventana abierta",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);

        }
    }

    public void abrirVentanaAltaTrabajador() {
        ventanaAltaTrabajador = new VentanaAltaTrabajador(this, modelo.getProvincias(), modelo.getProfesiones());
    }

    public void abrirVentanaTrabajadoresDisponibles() {
        if ((ventanaTrabajadoresDisponibles == null || !ventanaTrabajadoresDisponibles.isVisible()) && !ventanaTrabajadoresDisponiblesAbierta) {
            ventanaTrabajadoresDisponibles = new VentanaTrabajadoresDisponibles(this,modelo.getTrabajadores());
        }else{
            JOptionPane.showMessageDialog(null,
                    "Ya tienes una ventana abierta",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);

        }
    }


    public String[] obtenerProfesiones() {
        return modelo.getProfesiones().toArray(new String[ modelo.getProfesiones().size()]);
    }

    private void eliminarProfesion(String profesionParaEliminar) {
        if (!modelo.eliminarProfesion(profesionParaEliminar)) {
            actualizarValoresTextAreaProfesiones(modelo.deleteProfesion(profesionParaEliminar));
        } else {
            JOptionPane.showMessageDialog(null, "Profesion ya existente");
        }
    }

    private void agregarProfesion(String nuevaProfesion) {
        if (!modelo.agregarProfesion(nuevaProfesion)) {
            actualizarValoresTextAreaProfesiones(modelo.addProfesion(nuevaProfesion));
        } else {
            JOptionPane.showMessageDialog(null, "Profesion ya existente");
        }
    }

    private void actualizarValoresTextAreaProfesiones(String[] profesiones) {
        ventanaProfesiones.getTextArea().setText(convertirArrayHaciaString(profesiones));
    }

    public String convertirArrayHaciaString( String[] datos) {
        StringBuilder sb = new StringBuilder();
        for (String dato : datos) {
            sb.append(dato).append("\n");
        }
        return sb.toString();
    }

    //Obtener las provincias del modelo que le pasara a la ventana provincias
    public String[] obtenerProvincias() {
        return   modelo.getProvincias().toArray(new String[ modelo.getProvincias().size()]);
    }
    public void agregarProvincia(String nuevaProvincia){
        if (!modelo.agregarProvincia(nuevaProvincia)) {
            actualizarValoresComboBoxProvincias(modelo.addProvincia(nuevaProvincia));
        } else {
            JOptionPane.showMessageDialog(null, "Provincia ya existente");
        }
    }

    public void eliminarProvincia(String provinciaParaEliminar){
        //TODO si algun trabajor es de la provincia no puede eliminarse
        if (provinciaParaEliminar != null) {
            actualizarValoresComboBoxProvincias(modelo.eliminarProvincia(provinciaParaEliminar));
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar la provincia");
        }
    }

    public void actualizarValoresComboBoxProvincias(String[] nuevaListaProvincias){
        ventanaProvincias.getComboProvincias().setModel(new DefaultComboBoxModel<>(nuevaListaProvincias));
    }

    private void agregarTraballador(
            String txtNome,
            String txtApelido1,
            String txtApelido2,
            String txtDNI,
            String profesion,
            String provincia) {
        if(!modelo.existeTrabajador(txtDNI)) modelo.agregarTrabajador(txtNome,txtApelido1,txtApelido2,txtDNI,profesion,provincia);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();  // Obtiene el comando del botón
        switch (comando) {
            case "PROVINCIAS":
                abrirVentanaProvincias();
                break;
            case "PROFESIONES":
                abrirVentanaProfesiones();
                break;
            case "ALTA_TRABAJADOR":
                abrirVentanaAltaTrabajador();
                break;
            case "VER_TRABAJADORES":
                abrirVentanaTrabajadoresDisponibles();
                break;
            case "AGREGAR_PROVINCIA":
                agregarProvincia(ventanaProvincias.getTxtNueva().getText());
                break;
            case "ELIMINAR_PROVINCIA":
                eliminarProvincia(ventanaProvincias.getComboProvincias().getSelectedItem().toString());
                break;
            case "AGREGAR_PROFESION":
                agregarProfesion(ventanaProfesiones.getTxtField().getText());
                break;
            case "ELIMINAR_PROFESION":
                eliminarProfesion(ventanaProfesiones.getTxtField().getText());
                break;
            case "ALTA_TRABALLADOR":
                agregarTraballador(
                        ventanaAltaTrabajador.getTxtNome().getText(),
                        ventanaAltaTrabajador.getTxtApelido1().getText(),
                        ventanaAltaTrabajador.getTxtApelido2().getText(),
                        ventanaAltaTrabajador.getTxtDNI().getText(),
                        Objects.requireNonNull(ventanaAltaTrabajador.getComboProvincia().getSelectedItem()).toString(),
                        ventanaAltaTrabajador.getListaProfesion().getSelectedValue());
                break;
            default:
                System.out.println("Acción desconocida: " + comando);
        }
    }



    /**
     *
     *
     *     public void agregarProvincia(String provincia) {
     *         if (modelo.agregarProvincia(provincia)) {
     *             ventanaProvincias.actualizarProvincias();
     *             actualizarVentanasTrabajador();
     *         } else {
     *             JOptionPane.showMessageDialog(null, "Provincia ya existente");
     *         }
     *     }
     *
     *     public void eliminarProvincia(String provincia) {
     *         if (modelo.eliminarProvincia(provincia)) {
     *             ventanaProvincias.actualizarProvincias();
     *             actualizarVentanasTrabajador();
     *         } else {
     *             JOptionPane.showMessageDialog(null, "No se puede eliminar la provincia");
     *         }
     *     }
     *
     *     public void agregarProfesion(String profesion) {
     *         if (modelo.agregarProfesion(profesion)) {
     *             ventanaProfesiones.actualizarProfesiones();
     *             actualizarVentanasTrabajador();
     *         } else {
     *             JOptionPane.showMessageDialog(null, "Profesión ya existente");
     *         }
     *     }
     *
     *     public void eliminarProfesion(String profesion) {
     *         if (Empresa.eliminarProfesion(profesion)) {
     *             ventanaProfesiones.actualizarProfesiones();
     *             actualizarVentanasTrabajador();
     *         } else {
     *             JOptionPane.showMessageDialog(null, "No se puede eliminar la profesión");
     *         }
     *     }
     *
     *     public void registrarTrabajador(String dni, String nombre, String provincia, String profesion) {
     *         if (Empresa.agregarTrabajador(new Trabajador(dni, nombre, provincia, profesion))) {
     *             JOptionPane.showMessageDialog(null, "Trabajador registrado");
     *             if (ventanaTrabajadoresDisponibles != null) {
     *                 ventanaTrabajadoresDisponibles.actualizarLista();
     *             }
     *         } else {
     *             JOptionPane.showMessageDialog(null, "Error al registrar trabajador. DNI duplicado.");
     *         }
     *     }
     *
     *     private void actualizarVentanasTrabajador() {
     *         if (ventanaAltaTrabajador != null) {
     *             ventanaAltaTrabajador.actualizarProvinciasYProfesiones();
     *         }
     *     }
     */
}

