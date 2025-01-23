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
        alfombras.add(new Alfombra("a","a",11.11,11.11));
        alfombras.add(new Alfombra("b","b",22.22,33.33));

    }

    public ArrayList<Alfombra> getAlfombras() {
        return alfombras;
    }
    
    
    
    public DefaultListModel<String> engadirAlfombra(String modelo, String cor,  String ancho, String alto, JList jlist){
       
        try {
        // Verificar que los campos no estén vacíos antes de añadir la alfombra
        if (!alto.isEmpty() && !ancho.isEmpty() && !cor.isEmpty() && !modelo.isEmpty()) {
            // Intentar convertir ancho y alto a double si no es capaz lanza la excepcion
            double dAncho = Double.parseDouble(ancho);
            double dAlto = Double.parseDouble(alto);
            Alfombra alfombra = new Alfombra(modelo, cor, dAncho, dAlto);
            alfombras.add(alfombra);
        }else{
            JOptionPane.showMessageDialog(null, "Error: Todos los campos deben tener valores validos", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);

        }
        } catch (NumberFormatException e) {
        // Si ocurre un error, mostrar un mensaje al usuario
            JOptionPane.showMessageDialog(null, "Error: Ancho y alto deben ser valores numéricos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
        
             
        return devolverListadoString(alfombras);
    }
        
    public DefaultListModel<String> devolverListadoString(ArrayList<Alfombra> alfombras){
        ArrayList listadoComoString = new ArrayList<>();
        for(Alfombra a :alfombras){
            listadoComoString.add(a.getModelo());

        }
        return convertirArrayListADefaultListModel(listadoComoString); 
    }
    
     public DefaultListModel<String> convertirArrayListADefaultListModel(ArrayList<String> listado) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (String elemento : listado) {
            modelo.addElement(elemento);
        }
        return modelo;
    }
     
     
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
    
}
