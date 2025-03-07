package com.mycompany.ejercicio12_multixanela_dmi.controlador;


import com.mycompany.ejercicio12_multixanela_dmi.modelo.Modelo;
import com.mycompany.ejercicio12_multixanela_dmi.modelo.Trabajador;
import com.mycompany.ejercicio12_multixanela_dmi.vista.InternalFrameAltaTraballador;
import com.mycompany.ejercicio12_multixanela_dmi.vista.InternalFrameProfesiones;
import com.mycompany.ejercicio12_multixanela_dmi.vista.InternalFrameProvincias;
import com.mycompany.ejercicio12_multixanela_dmi.vista.InternalFrameTraballadoresDispoñibles;
import com.mycompany.ejercicio12_multixanela_dmi.vista.VentanaContenedora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Controlador implements ActionListener {
   
    private VentanaContenedora ventanaContendora;
    private InternalFrameAltaTraballador frameAltaTraballador;
    private InternalFrameProfesiones frameProfesiones;
    private InternalFrameProvincias frameProvincias;
    private InternalFrameTraballadoresDispoñibles frameTraballadoresDispoñibles;
   
    private Modelo modelo;

    public Controlador() {
        
    }

    public void setVentanaPrincipal(VentanaContenedora ventanaContendora) {
        this.ventanaContendora = ventanaContendora;
        this.ventanaContendora.setVisible(true);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
        modelo.cargarDatosDePrueba();
    }

    // Instanciar las nuevas ventanas
    public void abrirVentanaProvincias() {
        this.frameProvincias = new InternalFrameProvincias(this);
        this.ventanaContendora.getjDesktopPane1().add(frameProvincias);
        DefaultComboBoxModel<String> datos = new DefaultComboBoxModel<>();

        // Llenar el modelo con los elementos del ArrayList
        for (String opcion : modelo.getProvincias()) {
            datos.addElement(opcion);
        }
        frameProvincias.getjComboBox1().setModel(datos);
        frameProvincias.setVisible(true);
    }

    public void abrirVentanaProfesiones() {
        frameProfesiones = new InternalFrameProfesiones(this);
        
        this.ventanaContendora.getjDesktopPane1().add(frameProfesiones);
        frameProfesiones.setVisible(true);
    }

    public void abrirVentanaAltaTrabajador() {
        frameAltaTraballador = new InternalFrameAltaTraballador(this);
        DefaultComboBoxModel<String> datosProvincias = new DefaultComboBoxModel<>();

        // Llenar el modelo con los elementos del ArrayList
        for (String opcion : modelo.getProvincias()) {
            datosProvincias.addElement(opcion);
        }
        
        DefaultComboBoxModel<String> datosProfesiones = new DefaultComboBoxModel<>();

        // Llenar el modelo con los elementos del ArrayList
        for (String opcion : modelo.getProvincias()) {
            datosProfesiones.addElement(opcion);
        }
        frameAltaTraballador.getjComboBox1().setModel(datosProvincias);
        frameAltaTraballador.getjList1().setModel(datosProfesiones);
        this.ventanaContendora.getjDesktopPane1().add(frameAltaTraballador);
        frameAltaTraballador.setVisible(true);   
    }

    @SuppressWarnings("empty-statement")
    public void abrirVentanaTrabajadoresDisponibles() {
        frameTraballadoresDispoñibles = new InternalFrameTraballadoresDispoñibles(this);
        
        DefaultTableModel tModel = new DefaultTableModel();
        tModel.addColumn("Nombre");
        tModel.addColumn("Provincia");
        tModel.addColumn("Profesion");
        for(Trabajador t : modelo.getTrabajadores()){
            String[] fila = {t.getNombre() + " " + t.getApellido1() + " " + t.getApellido2(),t.getProvincia(),t.getProfesion()};
            tModel.addRow(fila);
        }
        frameTraballadoresDispoñibles.getjTable1().setModel(tModel);
        this.ventanaContendora.getjDesktopPane1().add(frameTraballadoresDispoñibles);
        frameTraballadoresDispoñibles.setVisible(true); 
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
        frameProfesiones.getjList1().setModel(new DefaultComboBoxModel<>(profesiones));
                //.getTextArea().setText(convertirArrayHaciaString(profesiones));
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
        frameProvincias.getjComboBox1().setModel(new DefaultComboBoxModel<>(nuevaListaProvincias));
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
            case "AGREGAR_PROVINCIA" -> agregarProvincia(frameProvincias.getjTextField1().getText());
            case "ELIMINAR_PROVINCIA" -> eliminarProvincia(frameProvincias.getjComboBox1().getSelectedItem().toString());
            case "AGREGAR_PROFESION" -> agregarProfesion(frameProfesiones.getjTextField1().getText());
            case "ELIMINAR_PROFESION" -> eliminarProfesion(frameProfesiones.getjTextField1().getText());
            case "ALTA_TRABALLADOR" -> agregarTraballador(
                        frameAltaTraballador.getjTextField1().getText(),
                        frameAltaTraballador.getjTextField2().getText(),
                        frameAltaTraballador.getjTextField3().getText(),
                        frameAltaTraballador.getjTextField4().getText(),
                        Objects.requireNonNull(frameAltaTraballador.getjComboBox1().getSelectedItem()).toString(),
                        frameAltaTraballador.getjList1().getSelectedValue());
            default -> System.out.println("Acción desconocida: " + comando);
        }
    }
/*
    
public void eliminarProvincia(String provincia) {
    if (modelo.eliminarProvincia(provincia)) {
        ventanaProvincias.actualizarProvincias();
        actualizarVentanasTrabajador();
    } else {
        JOptionPane.showMessageDialog(null, "No se puede eliminar la provincia");
    }
}

public void agregarProfesion(String profesion) {
    if (modelo.agregarProfesion(profesion)) {
        ventanaProfesiones.actualizarProfesiones();
        actualizarVentanasTrabajador();
    } else {
        JOptionPane.showMessageDialog(null, "Profesión ya existente");
    }
}

public void eliminarProfesion(String profesion) {
    if (Empresa.eliminarProfesion(profesion)) {
        ventanaProfesiones.actualizarProfesiones();
        actualizarVentanasTrabajador();
    } else {
        JOptionPane.showMessageDialog(null, "No se puede eliminar la profesión");
    }
}

public void registrarTrabajador(String dni, String nombre, String provincia, String profesion) {
    if (Empresa.agregarTrabajador(new Trabajador(dni, nombre, provincia, profesion))) {
        JOptionPane.showMessageDialog(null, "Trabajador registrado");
        if (ventanaTrabajadoresDisponibles != null) {
            ventanaTrabajadoresDisponibles.actualizarLista();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Error al registrar trabajador. DNI duplicado.");
    }
}

private void actualizarVentanasTrabajador() {
    if (ventanaAltaTrabajador != null) {
        ventanaAltaTrabajador.actualizarProvinciasYProfesiones();
    }
}
    */

}

