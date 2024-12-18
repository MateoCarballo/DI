/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Layouts.Border_Layout;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author a22mateoca
 */
public class MateoFrame extends JFrame{
    
    BorderLayout myLayout;
    JButton buttonN;
    JButton buttonW;
    JButton buttonE;
    JButton buttonS;
    JButton buttonC;

    public MateoFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,500);
        this.myLayout = new BorderLayout();
        setLayout(myLayout);
        
        this.buttonN= new JButton("NORTH");
        add(buttonN,BorderLayout.NORTH);
        this.buttonW = new JButton("WEST");
        add(buttonW,BorderLayout.WEST);
        this.buttonE = new JButton("EAST");
        add(buttonE,BorderLayout.EAST);
        this.buttonS = new JButton("SOUTH");
        add(buttonS,BorderLayout.SOUTH);
        this.buttonC = new JButton("CENTRE");
        add(buttonC,BorderLayout.CENTER);
        
        setVisible(true);
        
    }
    

}
