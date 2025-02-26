package com.mycompany.ejercicio12_multixanela_dmi.controlador;


import com.mycompany.ejercicio12_multixanela_dmi.modelo.Modelo;
import com.mycompany.ejercicio12_multixanela_dmi.vista.InternalFrameTraballadores;
import com.mycompany.ejercicio12_multixanela_dmi.vista.VentanaContenedora;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Controlador implements ActionListener {
    private VentanaContenedora ventanaContendora;
    private Modelo modelo;

    public Controlador( ) {

    }

    public void setVentanaPrincipal(VentanaContenedora ventanaContendora) {
        this.ventanaContendora = ventanaContendora;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    // Instanciar las nuevas ventanas
    public void abrirVentanaProvincias() {
      ventanaProvincias = new VentanaProvincias(this);
    }

    public void abrirVentanaProfesiones() {
        ventanaProfesiones = new VentanaProfesiones(this);
    }

    public void abrirVentanaAltaTrabajador() {
        ventanaContendora.getjDesktopPane1().add(new InternalFrameTraballadores());
                
    }

    public void abrirVentanaTrabajadoresDisponibles() {
        ventanaTrabajadoresDisponibles = new VentanaTrabajadoresDisponibles(this,modelo.getTrabajadores());
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
            case "PROVINCIAS" -> abrirVentanaProvincias();
            case "PROFESIONES" -> abrirVentanaProfesiones();
            case "ALTA_TRABAJADOR" -> abrirVentanaAltaTrabajador();
            case "VER_TRABAJADORES" -> abrirVentanaTrabajadoresDisponibles();
            case "AGREGAR_PROVINCIA" -> agregarProvincia(ventanaProvincias.getTxtNueva().getText());
            case "ELIMINAR_PROVINCIA" -> eliminarProvincia(ventanaProvincias.getComboProvincias().getSelectedItem().toString());
            case "AGREGAR_PROFESION" -> agregarProfesion(ventanaProfesiones.getTxtField().getText());
            case "ELIMINAR_PROFESION" -> eliminarProfesion(ventanaProfesiones.getTxtField().getText());
            case "ALTA_TRABALLADOR" -> agregarTraballador(
                        ventanaAltaTrabajador.getTxtNome().getText(),
                        ventanaAltaTrabajador.getTxtApelido1().getText(),
                        ventanaAltaTrabajador.getTxtApelido2().getText(),
                        ventanaAltaTrabajador.getTxtDNI().getText(),
                        Objects.requireNonNull(ventanaAltaTrabajador.getComboProvincia().getSelectedItem()).toString(),
                        ventanaAltaTrabajador.getListaProfesion().getSelectedValue());
            default -> System.out.println("Acción desconocida: " + comando);
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

