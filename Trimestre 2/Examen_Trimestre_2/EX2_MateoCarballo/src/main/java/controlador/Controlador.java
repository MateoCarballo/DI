/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import appMateo.modelo.Modelo;
import appMateo.modelo.Pelicula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JOptionPane;
import vista.VentanaAñadirDirector;
import vista.VentanaAñadirGenero;
import vista.VentanaEliminarDirector;
import vista.VentanaEliminarGenero;
import vista.VentanaGestionPeliculas;
import vista.VentanaPrincipal;

/**
 *
 * @author a22mateoca
 */
public class Controlador implements ActionListener {

    private Modelo modelo;
    private VentanaPrincipal vista;

    public Controlador(Modelo modelo, VentanaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        cargarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        /*
        
         añadirDirector.addActionListener(controlador);
        añadirDirector.setActionCommand("añadirDirector");
        eliminarDirector.addActionListener(controlador);
        eliminarDirector.setActionCommand("eliminarDirector");
        añadirGenero.addActionListener(controlador);
        añadirGenero.setActionCommand("añadirGenero");
        eliminarGenero.addActionListener(controlador);
        eliminarGenero.setActionCommand("eliminarGenero");
        añadirPelicula.addActionListener(controlador);
        añadirPelicula.setActionCommand("añadirPelicula");
        eliminarPelicula.addActionListener(controlador);
        eliminarPelicula.setActionCommand("eliminarPelicula");
        
        
        this.vad.getjButton1().addActionListener(controlador);
        this.vad.getjButton1().setActionCommand("botonInternalFrameAñadirDirector");
        
         */
        switch (comando) {
            case "añadirDirector" -> {
                genenarInternalFrameAñadirDirector();
            }
            case "eliminarDirector" -> {
                genenarInternalFrameEliminarDirector();
            }
            case "añadirGenero" -> {
                genenarInternalFrameAñadirGenero();

            }
            case "eliminarGenero" -> {
                genenarInternalFrameEliminarGenero();
            }
            case "añadirPelicula" -> {
                genenarInternalFrameAñadirPelicula();
            }
            case "eliminarPelicula" -> {

            }
            case "botonInternalFrameAñadirDirector" -> {
                //Le paso al modelo el String con el nuevo director para insertarlo en el modelo de datos que usara el combobox
                modelo.añadirDirector(vista.getVad().getTextFieldNuevoDirector().getText());
                JOptionPane.showMessageDialog(null, "Has añadido el director " + vista.getVad().getTextFieldNuevoDirector().getText() + " a los directores disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);

            }

            case "botonInternalFrameEliminarDirector" -> {
                //Mensaje para confirmar eliminacion

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar el director seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    //Le paso el indice seleccionado del comboBox ahi se borrara del modelo de datos que use para mostrar los directores que insertamos
                    modelo.eliminarDirector(vista.getVed().getjComboBox1().getSelectedIndex());
                    //Le cargamos los datos actualizados al combobox desde el modelo
                    vista.getVed().getjComboBox1().setModel(modelo.getDatosComboBoxDirector());
                } else {

                }

            }

            case "botonInternalFrameAgregarGenero" -> {
                //Le paso al modelo el String con el nuevo director para insertarlo en el modelo de datos que usara el combobox
                String nuevoGenero = vista.getVag().getTextFieldNuevoGenero().getText();
                modelo.añadirGenero(nuevoGenero);
                JOptionPane.showMessageDialog(null, "Has añadido el genero de " + nuevoGenero + " a los generos disponibles", "Nueva insercion", JOptionPane.INFORMATION_MESSAGE);

            }

            case "botonInternalFrameEliminarGenero" -> {
                //Mensaje para confirmar eliminacion

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar el genero seleccionado?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    //Le paso el indice seleccionado del comboBox ahi se borrara del modelo de datos que use para mostrar los directores que insertamos
                    modelo.eliminarGenero(vista.getVeg().getjList1().getSelectedIndex());
                    //Le cargamos los datos actualizados al combobox desde el modelo
                    vista.getVeg().getjList1().setModel(modelo.getDatosListaGenero());
                } else {

                }
            }

            case "botonInternalFrameAgregarPelicula" -> {
                //Si no hay campos vacios ni en blanco permitir eliminar si me datiempo comprobaria esto
                /*
                public Pelicula(int codPelicula, String titulo, int año, String director, String genero, String sinopsis) {
        this.codPelicula = codPelicula;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.fechaInsercion = LocalDate.now();
    }
                 */

                //Instancio una nueva pelicula con los datos recogidos en la pantalla
                
                
                int codigoPelicula = 10;
                
                String titulo = vista.getVgp().getTextFieldTitulo().getText();
                
                int año = Integer.parseInt(vista.getVgp().getTextFieldAño().getText());
                
                int indiceSeleccionadoUsuarioGenero = vista.getVgp().getComboBoxGeneros().getSelectedIndex();
                
                String genero = modelo.recogerIndiceGeneros(indiceSeleccionadoUsuarioGenero);
                
                int indiceSeleccionadoUsuarioDirector = vista.getVgp().getComboBoxDirectores().getSelectedIndex();
                
                String director = modelo.recogerIndiceDirectores(indiceSeleccionadoUsuarioDirector);
                
                String sinopsis = vista.getVgp().getjTextArea1().getText();
                
                
                
                Pelicula pelicula = new Pelicula(codigoPelicula, titulo, año, director, genero, sinopsis);
                //Añado mi lista a la de peliculas disponibles
                modelo.añadirPelicula(pelicula);
                //Las añado al modelo de datos de la tabla
                modelo.añadirPeliculaDatosTabla();
                //Le cargo los datos a la tabla denuevo
                vista.getVgp().getjTable1().setModel(modelo.getDatosTablaPelicula());
            }
            case "botonInternalFrameEliminarPelicula" -> {

            }

        }

    }

    private void genenarInternalFrameAñadirDirector() {
        VentanaAñadirDirector vad = new VentanaAñadirDirector();
        vista.setVad(vad);
    }

    private void genenarInternalFrameEliminarDirector() {
        VentanaEliminarDirector ved = new VentanaEliminarDirector();
        ved.getjComboBox1().setModel(modelo.getDatosComboBoxDirector());
        vista.setVed(ved);
    }

    private void genenarInternalFrameAñadirGenero() {
        VentanaAñadirGenero vag = new VentanaAñadirGenero();
        vista.setVag(vag);
    }

    private void genenarInternalFrameEliminarGenero() {
        VentanaEliminarGenero veg = new VentanaEliminarGenero();
        veg.getjList1().setModel(modelo.getDatosListaGenero());
        vista.setVeg(veg);
    }

    private void genenarInternalFrameAñadirPelicula() {
        VentanaGestionPeliculas vgp = new VentanaGestionPeliculas();
        vgp.getComboBoxDirectores().setModel(modelo.getDatosComboBoxDirector());
        vgp.getComboBoxGeneros().setModel(modelo.getDatosListaGeneroParseada());
        vgp.getjTable1().setModel(modelo.getDatosTablaPelicula());
        
        vista.setVgp(vgp);
    }

    private void cargarDatos() {
        vista.setVisible(true);
    }

}
