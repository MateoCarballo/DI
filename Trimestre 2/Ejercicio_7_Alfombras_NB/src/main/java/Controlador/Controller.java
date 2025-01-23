/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 * @author mateo
 */

import Modelo.Alfombra;
import Modelo.Model;
import Vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
        
public class Controller implements ActionListener{
    
    private View view;
    private Model model;
    
    public Controller(View view,Model model){
        this.view = view;
        this.model = model;
        this.view.getjButtonEngadir().addActionListener(this);
        this.view.getjButtonInformacion().addActionListener(this);
        this.view.getjButtonEliminarAlfombra().addActionListener(this);
        this.view.getjButtonEliminarTodas().addActionListener(this);
        
    }
    
    public void añadir(){
        
    }
    public void generarInformacionAlfombra(){
        
    }
    public void eliminarAlfombra(){
        
    }
    public void eliminarTodasLasAlfombras(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        String comando = e.getActionCommand();
        System.out.println("Comando recibido" + comando);
        if (comando.equals("engadir")){
            //Adquirimos los datos de los JTextField y llamados al modelo para que gestione los elementos y el controlador con los nuevos datos se los pasara a la vista
            this.view.getjList2().setModel(this.model.engadirAlfombra(this.view.getJTextModelo().getText(), this.view.getJTextCor().getText(), this.view.getJTextAncho().getText(), this.view.getJTextAlto().getText(), this.view.getjList2()));
            //Vaciamos los campos de los JTextField de modelo, color, ancho y alto
            this.view.getJTextModelo().setText("");
            this.view.getJTextCor().setText("");
            this.view.getJTextAncho().setText("");
            this.view.getJTextAlto().setText("");
        }
        
        if (comando.equals("eliminarTodas")){
            
        }
        
        if (comando.equals("eliminarAlfombra")){
            
        }
        if (comando.equals("mostrasInformacion")){
            
        }
    }
    
}
