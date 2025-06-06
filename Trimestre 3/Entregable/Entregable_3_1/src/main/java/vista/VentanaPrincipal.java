/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controller;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

/**
 *
 * @author mateo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private final Controller controlador;
    
    /**
     * Creates new form VentanaPrincipal
     *
     * @param c
     */
    public VentanaPrincipal(Controller c) {
        this.controlador = c;
        initComponents();
        añadirListeners();
    }

    public void setControlador(Controller c) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelMensajeBienvenida = new javax.swing.JLabel();
        jBarraMenuSuperior = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemIniciarSesion = new javax.swing.JMenuItem();
        jMenuItemRegistro = new javax.swing.JMenuItem();
        jMenuJuego = new javax.swing.JMenu();
        jMenuItemAbrirJuego = new javax.swing.JMenuItem();
        jMenuItemTablaRecords = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemPrimerosPasos = new javax.swing.JMenuItem();
        jMenuItemCreditos = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entregable 3_1");

        jLabelMensajeBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMensajeBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensajeBienvenida.setText("<html><div style='text-align: center;'>Bienvenido al Juego de la Memoria!<br>En primer lugar debes registrarte para hacerlo pincha en el menú de arriba y selecciona registro.<br>Si ya estás registrado inicia sesión para guardar tus records.<br> ¡A GANAR!></html>");
        jLabelMensajeBienvenida.setToolTipText("Mensaje_Bienvenida");

        jDesktopPane1.setLayer(jLabelMensajeBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jLabelMensajeBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabelMensajeBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jBarraMenuSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jBarraMenuSuperior.setToolTipText("Menu");

        jMenuInicio.setText("Inicio");

        jMenuItemIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIniciarSesion.setText("Iniciar Sesion");
        jMenuInicio.add(jMenuItemIniciarSesion);

        jMenuItemRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRegistro.setText("Registro");
        jMenuInicio.add(jMenuItemRegistro);

        jBarraMenuSuperior.add(jMenuInicio);

        jMenuJuego.setText("Juego");

        jMenuItemAbrirJuego.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemAbrirJuego.setText("Jugar");
        jMenuItemAbrirJuego.setToolTipText("Boton jugar");
        jMenuJuego.add(jMenuItemAbrirJuego);

        jMenuItemTablaRecords.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItemTablaRecords.setText("Tabla Records");
        jMenuJuego.add(jMenuItemTablaRecords);

        jBarraMenuSuperior.add(jMenuJuego);

        jMenuAyuda.setText("Ayuda");

        jMenuItemPrimerosPasos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemPrimerosPasos.setText("Primeros pasos");
        jMenuItemPrimerosPasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrimerosPasosActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemPrimerosPasos);

        jMenuItemCreditos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCreditos.setText("Creditos");
        jMenuAyuda.add(jMenuItemCreditos);

        jBarraMenuSuperior.add(jMenuAyuda);

        setJMenuBar(jBarraMenuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPrimerosPasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrimerosPasosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPrimerosPasosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jBarraMenuSuperior;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelMensajeBienvenida;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemAbrirJuego;
    private javax.swing.JMenuItem jMenuItemCreditos;
    private javax.swing.JMenuItem jMenuItemIniciarSesion;
    private javax.swing.JMenuItem jMenuItemPrimerosPasos;
    private javax.swing.JMenuItem jMenuItemRegistro;
    private javax.swing.JMenuItem jMenuItemTablaRecords;
    private javax.swing.JMenu jMenuJuego;
    // End of variables declaration//GEN-END:variables

    private void añadirListeners() {
        //Seteamos los comandos para saber que tiene que realizar dependiendo de quien desencadene el evento:

        //Abrir internal frame de inicio de session
        jMenuItemIniciarSesion.addActionListener((ActionListener) this.controlador);
        jMenuItemIniciarSesion.setActionCommand("Inicio sesion");

        //Abrir internal frame de registro de usuario
        jMenuItemRegistro.addActionListener((ActionListener) this.controlador);
        jMenuItemRegistro.setActionCommand("Registro usuario");

        //Abrir internal frame de juego
        jMenuItemAbrirJuego.addActionListener((ActionListener) this.controlador);
        jMenuItemAbrirJuego.setActionCommand("Abrir juego");

        //Abrir internal frame de tabla de records
        jMenuItemTablaRecords.addActionListener((ActionListener) this.controlador);
        jMenuItemTablaRecords.setActionCommand("Records");

        //Abrir internal frame de creditos
        jMenuItemCreditos.addActionListener((ActionListener) this.controlador);
        jMenuItemCreditos.setActionCommand("Creditos");

        //Abrir internal frame de ayuda
        jMenuItemPrimerosPasos.addActionListener((ActionListener) this.controlador);
        jMenuItemPrimerosPasos.setActionCommand("Primeros pasos");

    }

    //Getters y setter necesarios para el correcto funcionamiento de la aplicacion
    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }


    public void deleteFirstMessage() {
        jDesktopPane1.remove(jLabelMensajeBienvenida);
        jDesktopPane1.repaint();
    }
}
