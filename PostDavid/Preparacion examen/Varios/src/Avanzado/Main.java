package Avanzado;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame miFrame = new JFrame();
        miFrame.setBounds(100,100,500,500);
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miFrame.setLayout(null);
        miFrame.add(new BotonEstandar());
        miFrame.setVisible(true);
    }
}
