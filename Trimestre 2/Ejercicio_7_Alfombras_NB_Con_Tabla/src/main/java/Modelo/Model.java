/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class Model { 
    private final ArrayList <Alfombra> alfombras;
    
    public Model(){
        alfombras = new ArrayList<>();

    }

    public ArrayList<Alfombra> getAlfombras() {
        return alfombras;
    }
    
    public boolean comprobarDatosOK(String modelo, String cor,  String ancho, String alto){
        boolean datosValidos = false;
        try{
            
            if (!alto.isEmpty() && !ancho.isEmpty() && !cor.isEmpty() && !modelo.isEmpty()) {
                datosValidos = true;
            }else{
                
            JOptionPane.showMessageDialog(null, "Error: Todos los campos deben tener valores validos", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);

            }
        } catch (NumberFormatException e) {
        // Si ocurre un error, mostrar un mensaje al usuario
            JOptionPane.showMessageDialog(null, "Error: Ancho y alto deben ser valores numéricos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
        return datosValidos;
    }
    
    
    
    public String[] engadirAlfombra(String modelo, String cor,  String ancho, String alto){
       
        double dAncho = Double.parseDouble(ancho);
        double dAlto = Double.parseDouble(alto);
        Alfombra alfombra = new Alfombra(modelo, cor, dAncho, dAlto);
        alfombras.add(alfombra);  
        
        return new String []{modelo,cor,ancho,alto};
    }
        
    
    /*
    public DefaultListModel<String> eliminarAlfombraPorIndice(int indice){
         //Eliminamos el indice que ocupa en la lista de objetos alfombra
         alfombras.remove(indice);
         //Llamamos al metodo que convierte el arrayList de Alfombras en un ArrayList 
         //de String y llamo a otro metodo que lo convierte en 
         //una lista valida para el componente JList de nuestra vista
         return devolverListadoString(this.alfombras);  
     }
     
     public DefaultListModel<String> eliminarAlfombras(){
         //Borramos todo el arrayList
         alfombras.clear();
         //Devolvemos el nuevo arrayListVacio
         return devolverListadoString(this.alfombras);  
     }
     
     public String[] informacionAlfombra(int indice){
        return new String[] {
            alfombras.get(indice).getModelo(),
            alfombras.get(indice).getCor(),
            String.valueOf(alfombras.get(indice).getAncho()),
            String.valueOf(alfombras.get(indice).getAlto())};     
     }
    */

    
}
