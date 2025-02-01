package Controlador;

import Modelo.Model;
import Vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener {
    
    private final View view;
    private Model model;
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        
        // Asociar los botones a los métodos correspondientes
        this.view.getjButtonEngadir().addActionListener(this);
        this.view.getjButtonInformacion().addActionListener(this);
        this.view.getjButtonEliminarAlfombra().addActionListener(this);
        this.view.getjButtonEliminarTodas().addActionListener(this);
        
        this.view.getjTable1().setModel(this.model.crearModeloTabla());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        // Botón para agregar una alfombra
        if (comando.equals("engadir")) {
            // Obtener los datos desde los JTextField de la vista
            String modelo = this.view.getJTextModelo().getText();
            String color = this.view.getJTextCor().getText();
            String ancho = this.view.getJTextAncho().getText();
            String alto = this.view.getJTextAlto().getText();
            
            // Validar que todos los campos estén completos antes de agregar
            if (modelo.isEmpty() || color.isEmpty() || ancho.isEmpty() || alto.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Todos los campos deben ser completados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            try {
                // Llamar al modelo para agregar la alfombra
                this.model.agregarAlfombra(modelo, color, ancho, alto);
                
                // Actualizar la JTable en la vista
                this.view.getjTable1().setModel(this.model.crearModeloTabla());
                
                // Limpiar los campos de texto
                this.view.getJTextModelo().setText("");
                this.view.getJTextCor().setText("");
                this.view.getJTextAncho().setText("");
                this.view.getJTextAlto().setText("");
                
            } catch (IllegalArgumentException ex) {
                // Si hay un error al agregar la alfombra
                JOptionPane.showMessageDialog(view, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Botón para eliminar una alfombra seleccionada
        if (comando.equals("eliminarAlfombra")) {
            int selectedRow = this.view.getjTable1().getSelectedRow();
            if (selectedRow != -1) {
                // Llamar al modelo para eliminar la alfombra
                this.model.eliminarAlfombraPorIndice(selectedRow);
                
                // Actualizar la JTable en la vista
                this.view.getjTable1().setModel(this.model.crearModeloTabla());
            } else {
                JOptionPane.showMessageDialog(view, "Seleccione una alfombra para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Botón para eliminar todas las alfombras
        if (comando.equals("eliminarTodas")) {
            this.model.eliminarTodasAlfombras();
            
            // Actualizar la JTable en la vista
            this.view.getjTable1().setModel(this.model.crearModeloTabla());
        }
        
        // Botón para mostrar información de la alfombra seleccionada
        if (comando.equals("mostrasInformacion")) {
            int selectedRow = this.view.getjTable1().getSelectedRow();
            if (selectedRow != -1) {
                // Obtener la información de la alfombra seleccionada
                String[] info = this.model.obtenerInformacionAlfombra(selectedRow);
                String mensaje = "Modelo: " + info[0] + "\n"
                               + "Color: " + info[1] + "\n"
                               + "Ancho: " + info[2] + "\n"
                               + "Alto: " + info[3];
                
                // Mostrar la información
                JOptionPane.showMessageDialog(view, mensaje, "Información de la Alfombra", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Seleccione una alfombra para ver la información.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
