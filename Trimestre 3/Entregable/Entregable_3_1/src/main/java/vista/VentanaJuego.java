package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class VentanaJuego extends javax.swing.JInternalFrame {
    // Cambiar tipo de interrogacionIcon a ImageIcon

    private final ImageIcon interrogacionIcon;

    public VentanaJuego() {
        initComponents();
        configurarAparienciaInicial();
        // Inicializar icono de interrogación
        interrogacionIcon = escalarImagen("/img/interrogacion.png", 100, 100);
    }

    private void configurarAparienciaInicial() {
    Color colorFondo = Color.WHITE;  // o Color.BLACK para fondo negro
    Color colorBorde = Color.DARK_GRAY;
    
    for (JButton boton : getTodosLosBotones()) {
        // Fondo blanco y borde gris oscuro
        boton.setBackground(colorFondo);
        boton.setBorder(BorderFactory.createLineBorder(colorBorde, 2));
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setIcon(interrogacionIcon);
        boton.setEnabled(false);
        
        // Opcional: eliminar efecto de enfoque
        boton.setFocusPainted(false);
    }
    btnComenzar.setText("Iniciar Juego");
}

    public ImageIcon escalarImagen(String ruta, int ancho, int alto) {
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource(ruta));
        if (iconoOriginal.getImage() == null) {
            throw new IllegalArgumentException("Imagen no encontrada: " + ruta);
        }
        Image imagen = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imagen);
    }

    // Métodos de acceso para el controlador (¡Estos son clave!)
    public JButton getBotonComenzar() {
        return btnComenzar;
    }

    public JButton[] getTodosLosBotones() {
        return new JButton[]{
            jButtonCarta1, jButtonCarta2, jButtonCarta3, jButtonCarta4,
            jButtonCarta5, jButtonCarta6, jButtonCarta7, jButtonCarta8,
            jButtonCarta9, jButtonCarta10, jButtonCarta11, jButtonCarta12,
            jButtonCarta13, jButtonCarta14, jButtonCarta15, jButtonCarta16,
            jButtonCarta17, jButtonCarta18, jButtonCarta19, jButtonCarta20,
            jButtonCarta21, jButtonCarta22, jButtonCarta23, jButtonCarta24
        };
    }

    // Métodos para manipulación visual desde el controlador
    public void mostrarImagenEnBoton(JButton boton, ImageIcon imagen) {
        boton.setIcon(imagen);
    }

    public void mostrarCarta(JButton boton, ImageIcon icono) {
        boton.setIcon(icono);
    }

    public void habilitarCarta(JButton boton, boolean habilitar) {
        boton.setEnabled(habilitar);
        if (habilitar) {
            boton.setIcon(interrogacionIcon);
        }
    }

    public void resetearBoton(JButton boton, ImageIcon iconoInterrogacion) {
        boton.setIcon(iconoInterrogacion);
        boton.setEnabled(true);
    }

    public void mostrarMensajeFin(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCarta1 = new javax.swing.JButton();
        jButtonCarta2 = new javax.swing.JButton();
        jButtonCarta3 = new javax.swing.JButton();
        jButtonCarta4 = new javax.swing.JButton();
        jButtonCarta5 = new javax.swing.JButton();
        jButtonCarta6 = new javax.swing.JButton();
        jButtonCarta7 = new javax.swing.JButton();
        jButtonCarta8 = new javax.swing.JButton();
        jButtonCarta9 = new javax.swing.JButton();
        jButtonCarta10 = new javax.swing.JButton();
        jButtonCarta11 = new javax.swing.JButton();
        jButtonCarta12 = new javax.swing.JButton();
        jButtonCarta13 = new javax.swing.JButton();
        jButtonCarta14 = new javax.swing.JButton();
        jButtonCarta15 = new javax.swing.JButton();
        jButtonCarta16 = new javax.swing.JButton();
        jButtonCarta17 = new javax.swing.JButton();
        jButtonCarta18 = new javax.swing.JButton();
        jButtonCarta19 = new javax.swing.JButton();
        jButtonCarta20 = new javax.swing.JButton();
        jButtonCarta21 = new javax.swing.JButton();
        jButtonCarta22 = new javax.swing.JButton();
        jButtonCarta23 = new javax.swing.JButton();
        jButtonCarta24 = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Juego de memoria");

        btnComenzar.setText("Comenzar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCarta19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCarta13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarta18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarta13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarta19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCarta24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton jButtonCarta1;
    private javax.swing.JButton jButtonCarta10;
    private javax.swing.JButton jButtonCarta11;
    private javax.swing.JButton jButtonCarta12;
    private javax.swing.JButton jButtonCarta13;
    private javax.swing.JButton jButtonCarta14;
    private javax.swing.JButton jButtonCarta15;
    private javax.swing.JButton jButtonCarta16;
    private javax.swing.JButton jButtonCarta17;
    private javax.swing.JButton jButtonCarta18;
    private javax.swing.JButton jButtonCarta19;
    private javax.swing.JButton jButtonCarta2;
    private javax.swing.JButton jButtonCarta20;
    private javax.swing.JButton jButtonCarta21;
    private javax.swing.JButton jButtonCarta22;
    private javax.swing.JButton jButtonCarta23;
    private javax.swing.JButton jButtonCarta24;
    private javax.swing.JButton jButtonCarta3;
    private javax.swing.JButton jButtonCarta4;
    private javax.swing.JButton jButtonCarta5;
    private javax.swing.JButton jButtonCarta6;
    private javax.swing.JButton jButtonCarta7;
    private javax.swing.JButton jButtonCarta8;
    private javax.swing.JButton jButtonCarta9;
    // End of variables declaration//GEN-END:variables
}
