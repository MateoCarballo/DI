package Basic;

import javax.swing.*;
import java.awt.event.*;


public class Ventana3 extends JFrame {
    private Ventana1 ventana1;


    public Ventana3(){
        setTitle("Testing");
        setBounds(100,500,400,500);
        setLayout(null);
        crearJTextFields();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void crearJTextFields(){
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(10,50,100,50);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(10,100,100,50);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(10,150,100,50);
        JButton jButton = new JButton("Sumar");
        jButton.setBounds(10,250,100,50);
        add(jTextField1);
        add(jTextField2);
        add(jTextField3);
        add(jButton);
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                jTextField3.setText(String.valueOf(Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jTextField2.getText())));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }

}


