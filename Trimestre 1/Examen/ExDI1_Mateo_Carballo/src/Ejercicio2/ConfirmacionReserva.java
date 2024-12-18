package Ejercicio2;

import javax.swing.*;

public class ConfirmacionReserva extends JFrame {
    private String nombre;
    private String ciudad;
    private String fechaEntrada;
    private String fechaSalida;
    private String mes;
    private String numeroPersonas;

    public ConfirmacionReserva(String nombre, String ciudad, String fechaEntrada,String fechaSalida, String mes, String numeroPersonas){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.mes = mes;
        this.numeroPersonas = numeroPersonas;
        setBounds(20,20,300,300);
        contruirNombre();
        construirCiudad();
        construirfechas();
        construirMes();
        construirPersonas();
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Datos de la reserva");
        setVisible(true);
    }

    private void contruirNombre() {
        JLabel label = new JLabel("Nombre ->");
        JLabel label2 = new JLabel(nombre);
        label.setBounds(10,130,150,30);
        label2.setBounds(210,130,100,30);

        add(label);
        add(label2);

    }

    private void construirCiudad() {
        JLabel label = new JLabel("Destino ->");
        JLabel label2 = new JLabel(ciudad);
        label.setBounds(10,100,150,30);
        label2.setBounds(210,100,100,30);

        add(label);
        add(label2);
    }

    private void construirfechas() {
        JLabel label = new JLabel("Entrada - Salida ->");
        JLabel label2 = new JLabel("Del " + fechaEntrada + " al " + fechaSalida);
        label.setBounds(10,70,150,30);
        label2.setBounds(210,70,100,30);

        add(label);
        add(label2);
    }

    private void construirMes() {
        JLabel label = new JLabel("Mes ->");
        JLabel label2 = new JLabel(mes);
        label.setBounds(10,40,150,30);
        label2.setBounds(210,40,100,30);

        add(label);
        add(label2);
    }

    private void construirPersonas() {
        JLabel label = new JLabel("Numero de Personas ->");
        JLabel label2 = new JLabel(numeroPersonas);
        label.setBounds(10,10,150,30);
        label2.setBounds(210,10,100,30);

        add(label);
        add(label2);

    }
}
