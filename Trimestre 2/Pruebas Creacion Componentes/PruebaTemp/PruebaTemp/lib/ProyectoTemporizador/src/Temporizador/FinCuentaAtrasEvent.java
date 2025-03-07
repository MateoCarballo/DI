/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Temporizador;

import java.util.EventListener;

/**
 *
 * @author usuario
 */
public class FinCuentaAtrasEvent extends java.util.EventObject
{
    //Variable instancia para diferenciar cada objetos de este tipo
    String id;
    // constructor, se le pasa el objeto y un identificador.
    public FinCuentaAtrasEvent(Object source, String id)
    {
        super(source);
        this.id = id;
    }
    // get the temperature value
    public String getId()
    {
        return id;
    }
}

//Define la interfaz para el nuevo tipo de evento
interface FinCuentaAtrasListener extends EventListener
{
    void capturarFinCuentaAtras(FinCuentaAtrasEvent ev);
}




