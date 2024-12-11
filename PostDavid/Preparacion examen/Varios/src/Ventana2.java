import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana2 extends JFrame{
    private JButton jbutton1;
    private JLabel jLabel;
    private JTextField jTextField;
    public Ventana2(){
        setBounds(300,300,600,600);
        setTitle("Ventana 2");
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTextField();
        setBotonAbrirVentana();
        setLabel();
        setVisible(true);
    }

    private void setTextField() {
        jTextField = new JTextField();
        jTextField.setText("Sin pasar");
        jTextField.setBounds(10,10,100,100);
        add(jTextField);
        jTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                if (jTextField.getBackground()==Color.BLUE){
                    jTextField.setBackground(Color.GREEN);
                }else {
                    jTextField.setBackground(Color.BLUE);

                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {


            }
        });
    }

    private void setBotonAbrirVentana() {
        jbutton1 = new JButton("Boton");
        jTextField.setBounds(10,70,100,50);
        jbutton1.setVisible(true);
        add(jbutton1);
    }
    private void setLabel() {
        jLabel = new JLabel("Sin pasar mouse");
        jTextField.setBounds(10,130,100,50);
        jLabel.setOpaque(true);
//        jLabel.setBackground(Color.BLUE);
        add(jLabel);
    }
}
