/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Layouts.Grid_Layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author a22mateoca
 */
public class EjGridLayout extends JFrame{
    
    public EjGridLayout(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLayout(new GridLayout(1,2));
        add(new JButton("Aceptar"));
        add(new JButton("Cerrar"));
        setVisible(true);
        
    }
    
}
