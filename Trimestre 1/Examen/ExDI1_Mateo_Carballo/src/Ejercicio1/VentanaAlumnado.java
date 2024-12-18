package Ejercicio1;

import javax.swing.*;

public class VentanaAlumnado extends JFrame {

    public VentanaAlumnado(){
        setBounds(50,50,1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 1 Xestion de alumnado");
        inicializaMenu();
        setLayout(null);
        setVisible(true);
    }

    public void inicializaMenu(){
        //PRIMER NIVEL
        JMenuBar menu = new JMenuBar();
        //SEGUNDO NIVEL
        JMenu inicio = new JMenu("INICIO");
        JMenu xestionAlumnado = new JMenu("XESTIÓN ALUMNADO");
        JMenu profesorado = new JMenu("PROFESORADO");
        JMenu nonDocente = new JMenu("NON DOCENTE");

        //ANIDACION DEL SEGUNDO NIVEL DENTRO DE "Matrícula
        JMenu matricula = new JMenu("Matrícula");

        //ULTIMO NIVEL OPCIONES DENTRO DEL SUBMENU MATRICULA
        JMenuItem matriculaDirecta = new JMenuItem("Matrícula directa");
        JMenuItem matriculaListaxe = new JMenuItem("Matrícula listaxe");

        //ULTIMO NIVEL CONTENIDO POR XESTIÓN ALUMNADO
        JMenuItem grupo = new JMenuItem("Grupo");
        JMenuItem actividades = new JMenuItem("Actividades");

        matricula.add(matriculaDirecta);
        matricula.add(matriculaListaxe);

        xestionAlumnado.add(matricula);
        xestionAlumnado.add(grupo);
        xestionAlumnado.add(actividades);

        menu.add(inicio);
        menu.add(xestionAlumnado);
        menu.add(profesorado);
        menu.add(nonDocente);
        menu.setBounds(0,0,1000,30);
        add(menu);
    }
}
