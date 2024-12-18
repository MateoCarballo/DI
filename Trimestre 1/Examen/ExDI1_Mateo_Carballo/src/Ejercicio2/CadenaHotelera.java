package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadenaHotelera extends JFrame {


    private int numeroReserva= 0;

    private JLabel etiquetaHotel;
    private JLabel etiquetaDiasComienzo;
    private JLabel etiquetaDiasFinal;
    private JLabel etiquetaMeses;
    private JLabel etiquetaPersonas;
    private JLabel etiquetaCiudad;
    private JLabel etiquetaNombre;

    private Font fuentePersonalizada = new Font("Broadway", Font.BOLD,60);

    private JComboBox<String> listadoDiasEntrada;
    private JComboBox<String> listadoDiasSalida;
    private JComboBox<String> listadoMeses;
    private JComboBox<String> listadoPersonas;
    private JComboBox<String> listadoCiudades;

    private JTextField textFieldnombre;

    private JTextArea textAreaConfirmadaReserva;

    private JButton botonConfirmarReserva;


    public CadenaHotelera(){
        setBounds(50,50,1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2 Cadena Hotelera");
        setLayout(null);
        generarEtiquetaHotel();
        generarEtiquetasComboboxes();
        generarEtiquetaNombre();
        generarTextFieldNombre();
        generarComboBoxDiasEntrada();
        generarComboBoxDiasSalida();
        generarComboBoxMeses();
        generarComboBoxPersonasAlojadas();
        generarComboBoxCiudades();
        generarBotonConfirmarReserva();
        generarTextAreaReserva();
        setVisible(true);
    }

    private void generarTextAreaReserva() {
        JLabel label = new JLabel("RESERVAS");
        label.setBounds(750,120,200,30);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        textAreaConfirmadaReserva = new JTextArea();
        textAreaConfirmadaReserva.setBounds(750,150,200,200);
        //textAreaConfirmadaReserva.setEnabled(false);
        //botonConfirmarReserva.setBounds(750,380,200,50);
        add(textAreaConfirmadaReserva);

    }

    private void generarEtiquetasComboboxes() {
        etiquetaDiasComienzo = new JLabel("Dia de entrada");
        etiquetaDiasFinal = new JLabel("Dia de salida");
        etiquetaMeses = new JLabel("Mes de la reserva");
        etiquetaPersonas = new JLabel("Personas alojadas");
        etiquetaCiudad = new JLabel("Destinos");

        etiquetaDiasComienzo.setBounds(20,135,120,25);
        etiquetaDiasFinal.setBounds(20,190,120,25);
        etiquetaMeses.setBounds(160,135,120,25);
        etiquetaPersonas.setBounds(300,135,120,25);
        etiquetaCiudad.setBounds(460,135,120,25);

        add(etiquetaDiasComienzo);
        add(etiquetaDiasFinal);
        add(etiquetaMeses);
        add(etiquetaPersonas);
        add(etiquetaCiudad);
    }

    public void generarEtiquetaHotel(){
        etiquetaHotel  = new JLabel("HOTEL GRAN SPA RESORT");
        etiquetaHotel.setFont(fuentePersonalizada);
        etiquetaHotel.setBounds(50,50,880,75);
        etiquetaHotel.setOpaque(true);
        etiquetaHotel.setBackground(Color.WHITE);
        etiquetaHotel.setHorizontalAlignment(JLabel.CENTER);
        add(etiquetaHotel);
    }



    private void generarEtiquetaNombre() {
        etiquetaNombre = new JLabel("Nombre");
        etiquetaNombre.setBounds(160,190,120,25);
        add(etiquetaNombre);
    }

    private void generarTextFieldNombre(){
        textFieldnombre = new JTextField();
        textFieldnombre.setBounds(160,215,180,25);
        add(textFieldnombre);
    }


    private void generarComboBoxDiasEntrada() {
        String[] datosListadoDias = new String[31];
        for (int i = 0; i < datosListadoDias.length; i++) {
            datosListadoDias[i] = String.valueOf(i+1);
        }
        listadoDiasEntrada = new JComboBox<>(datosListadoDias);
        listadoDiasEntrada.setBounds(20,160,100,25);
        add(listadoDiasEntrada);
    }

    private void generarComboBoxMeses() {
        String[] datosListadoMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        listadoMeses = new JComboBox<>(datosListadoMeses);
        listadoMeses.setBounds(160,160,100,25);
        add(listadoMeses);
    }

    private void generarComboBoxPersonasAlojadas() {
        String[] datosListadoPersonas = new String[11];
        for (int i = 0; i < datosListadoPersonas.length; i++) {
            datosListadoPersonas[i] = String.valueOf(i+1);
        }
        listadoPersonas = new JComboBox<>(datosListadoPersonas);
        listadoPersonas.setBounds(300,160,100,25);
        add(listadoPersonas);

    }

    private void generarComboBoxCiudades() {
        String[] datoslistadoCiudades = {"Madrid","Barcelona","Paris","Milan","Florencia","Venecia","Roma","Londres"};
        listadoCiudades = new JComboBox<>(datoslistadoCiudades);
        listadoCiudades.setBounds(460,160,100,25);
        add(listadoCiudades);
    }

    private void generarComboBoxDiasSalida() {
        String[] datosListadoDias = new String[31];
        for (int i = 0; i < datosListadoDias.length; i++) {
            datosListadoDias[i] = String.valueOf(i+1);
        }
        listadoDiasSalida = new JComboBox<>(datosListadoDias);
        listadoDiasSalida.setBounds(20,215,100,25);
        add(listadoDiasSalida);
    }


    private void generarBotonConfirmarReserva() {
        botonConfirmarReserva = new JButton("Confirmar Reserva");
        botonConfirmarReserva.setBounds(750,380,200,50);
        add(botonConfirmarReserva);
        botonConfirmarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!textFieldnombre.getText().isBlank()) && (!textFieldnombre.getText().isEmpty())){
                    int eleccion = JOptionPane.showConfirmDialog(null,"Confirmamos la reserva?");
                    //Aqui escribir los datos
                    if(eleccion == 0)
                    {
                        textAreaConfirmadaReserva.setText("");
                        numeroReserva++;
                        textAreaConfirmadaReserva.append("###### Reserva numero "+ numeroReserva + " ######" +"\n");
                        textAreaConfirmadaReserva.append("Dia de entrada -> " + listadoDiasEntrada.getSelectedItem().toString() + "\n");
                        textAreaConfirmadaReserva.append("Dia de salida -> " + listadoDiasSalida.getSelectedItem().toString() + "\n");
                        textAreaConfirmadaReserva.append("Mes ->" + listadoMeses.getSelectedItem().toString() + "\n");
                        textAreaConfirmadaReserva.append("Personas alojadas -> " + listadoPersonas.getSelectedItem().toString() + "\n");
                        textAreaConfirmadaReserva.append("Ciudad destino -> " + listadoCiudades.getSelectedItem().toString() + "\n");
                        textAreaConfirmadaReserva.append("Nombre -> " + textFieldnombre.getText());
                        textAreaConfirmadaReserva.append("\n");

                        new ConfirmacionReserva(
                                textFieldnombre.getText(),
                                listadoCiudades.getSelectedItem().toString(),
                                listadoDiasEntrada.getSelectedItem().toString(),
                                listadoDiasSalida.getSelectedItem().toString(),
                                listadoMeses.getSelectedItem().toString(),
                                listadoPersonas.getSelectedItem().toString()
                                );
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Es necesario introducir un nombre");
                }
            }
        });
    }

}
