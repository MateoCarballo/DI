/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 * @author mateo
 */

import Modelo.Model;
import Vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
        
public class Controller implements ActionListener{
    
    private View view;
    private final Model model;
    
    public Controller(View view,Model model){
        this.view = view;
        this.model = model;
        this.view.getjButtonEngadir().addActionListener(this);
        this.view.getjButtonInformacion().addActionListener(this);
        this.view.getjButtonEliminarAlfombra().addActionListener(this);
        this.view.getjButtonEliminarTodas().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        String comando = e.getActionCommand();
        
        if (comando.equals("engadir")){
            
            if (this.model.comprobarDatosOK(this.view.getJTextModelo().getText(), this.view.getJTextCor().getText(), this.view.getJTextAncho().getText(), this.view.getJTextAlto().getText())){
                this.view.getTableModel().addRow(this.model.engadirAlfombra(this.view.getJTextModelo().getText(), this.view.getJTextCor().getText(), this.view.getJTextAncho().getText(), this.view.getJTextAlto().getText()));
                this.view.getJTextModelo().setText("");
                this.view.getJTextCor().setText("");
                this.view.getJTextAncho().setText("");
                this.view.getJTextAlto().setText("");
            }
            
                
                
            }
        }
        
        
        /*
        if (comando.equals("eliminarAlfombra")){
            //Le pedimos a la vista el indice de la alfombra que queremos eliminar y 
            //se la pasamos al modelo para que la borre del arrayList de las alfombras y la vuelva a setear
             this.view.getjList2().setModel(this.model.eliminarAlfombraPorIndice(this.view.getjList2().getSelectedIndex()));
            
        }
        
        if (comando.equals("eliminarTodas")){
            this.view.getjList2().setModel(this.model.eliminarAlfombras());
            
        }
        
        if (comando.equals("mostrasInformacion")){
         
         
         if (this.view.getjList2().getSelectedIndex() >= 0) { // Verificar que el índice sea válido
        String[] info = this.model.informacionAlfombra(this.view.getjList2().getSelectedIndex());
        String mensaje = "Modelo: " + info[0] + "\n"
                       + "Color: " + info[1] + "\n"
                       + "Ancho: " + info[2] + "\n"
                       + "Alto: " + info[3];

        JOptionPane.showMessageDialog(null, mensaje, "Información de la Alfombra", JOptionPane.INFORMATION_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "Índice inválido o no se seleccionó ninguna alfombra.", "Error", JOptionPane.ERROR_MESSAGE);
            }
         
        }
        */
    }
