/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Layouts.Card_Layout;

import java.awt.Button;
import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author a22mateoca
 */
public class MyCardLayout extends JFrame{
    
   public MyCardLayout(){
       
       setTitle("Ejemplo CardLayout");
       setLayout(new CardLayout());
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(new Button("1"));
       add(new Button("2"));
       setVisible(true);
       setSize(500,500);
       
       setLocationRelativeTo(null);
   } 
    

    
    public static void main(String[] args) {
       
       MyCardLayout frame = new MyCardLayout();
       
        }
}


