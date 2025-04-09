/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.aplicacion.tarefa_13_componente;

/**
 *
 * @author a22mateoca
 */

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*

*/

public class Tarefa_13_Componente extends JLabel implements Runnable {

    private JLabel labelReloj;
  
    
    public Tarefa_13_Componente() {
        initComponents();
    }
    
    private void initComponents(){
        labelReloj.setSize(300, 200);
        Thread hiloReloj = new Thread(this);
        hiloReloj.start();
    }

    @Override
    public void run() {
        while (true) {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaActual = formateador.format(LocalDateTime.now());
            setText(horaActual);
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Tarefa_13_Componente();
    }

}
