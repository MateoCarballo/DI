/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.aplicacion.mateobutton;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author a22mateoca
 */
public class Mateobutton extends JButton{

    public Mateobutton(){
        initComponent();
    }
    
    private void initComponent(){
        setVisible(true);
        setBounds(CENTER, CENTER, 75, 30);
        setBackground(Color.red);
    }
}
