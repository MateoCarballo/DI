import javax.swing.*;
import java.awt.event.*;


public class Ventana3 extends JFrame {
    private Ventana1 ventana1;


    public Ventana3(){
        setTitle("Testing");
        setBounds(200,200,400,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buton1();
        jlabel();
    }

    private void buton1(){
        JButton jButton=new JButton("Hola");
        jButton.setBounds(10,10,100,80);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ventana1 = new Ventana1();
                ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
    private void jlabel(){
        JLabel jLabel=new JLabel("label");
        jLabel.setBounds(200,50,50,50);
        add(jLabel);
        jLabel.addMouseListener(new MouseListener() {
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
            jLabel.setText("change");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            jLabel.setText("label");
            }
        });
    }
}


