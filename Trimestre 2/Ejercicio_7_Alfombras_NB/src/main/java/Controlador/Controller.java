/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 * @author mateo
 */

import Modelo.Alfombra;
import Vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
        
public class Controller implements ActionListener{
    
    private View view;
    private Alfombra model;
    
    public Controller(View view,Alfombra model){
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
            String alto = this.view.getJTextAlto().getText();
            String ancho = this.view.getJTextAncho().getText();
            String cor = this.view.getJTextCor().getText();
            String modelo = this.view.getJTextModelo().getText();

            if (!alto.isEmpty() && !ancho.isEmpty() && !cor.isEmpty() && !modelo.isEmpty()){
                DefaultListModel<String> modeloLista = view.getModeloListaAlfombras();
                modeloLista.addElement(nombreAlfombra);
                view.getListaAlfombras().setModel(modeloLista);
                view.getNombreAlfombra().setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Completa todos los campos","Error en la insercion",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (comando.equals("eliminarTodas")){
            
        }
        
        if (comando.equals("eliminarAlfombra")){
            
        }
        if (comando.equals("mostrasInformacion")){
        JOptionPane.showMessageDialog(null, "Esta es la ventana emergente", "Título de la ventana",JOptionPane.INFORMATION_MESSAGE );
        }
    }
    
}
