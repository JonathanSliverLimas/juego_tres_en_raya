package Ventanas;

public class VentanaInicial extends javax.swing.JFrame {

    private String usuario1;
    private String usuario2;

    public VentanaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        etiquetaImagenGif = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzarJuego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(0, 0, 153));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Tres en raya");

        etiquetaNombre1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        etiquetaNombre1.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombre1.setText("Digite el nombre del usuario 1:");

        etiquetaNombre2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        etiquetaNombre2.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaNombre2.setText("Digite el nombre del usuario 2:");

        cajaNombre1.setBackground(new java.awt.Color(255, 204, 204));
        cajaNombre1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cajaNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        cajaNombre2.setBackground(new java.awt.Color(255, 204, 204));
        cajaNombre2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cajaNombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        etiquetaImagenGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gifPrincipal.gif"))); // NOI18N

        botonGuardar.setBackground(new java.awt.Color(204, 255, 153));
        botonGuardar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(0, 51, 51));
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonGuardar.setBorderPainted(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        etiquetaMuestra1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(0, 0, 153));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(0, 0, 153));

        botonComenzarJuego.setBackground(new java.awt.Color(0, 51, 51));
        botonComenzarJuego.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonComenzarJuego.setForeground(new java.awt.Color(255, 255, 51));
        botonComenzarJuego.setText("Comenzar juego");
        botonComenzarJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 153), null));
        botonComenzarJuego.setBorderPainted(false);
        botonComenzarJuego.setVisible(false);
        botonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarJuegoActionPerformed(evt);
            }
        });

        jLabel1.setText("www.jonathanlimas.com");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(263, 263, 263)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonComenzarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(etiquetaImagenGif))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaNombre1)
                                .addGap(18, 18, 18)
                                .addComponent(cajaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaNombre2)
                                .addGap(18, 18, 18)
                                .addComponent(cajaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaTitulo)
                .addGap(56, 56, 56)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(etiquetaNombre1))
                    .addComponent(cajaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(etiquetaNombre2))
                    .addComponent(cajaNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(botonComenzarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaImagenGif))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaNombre1.getText();
        usuario2 = cajaNombre2.getText();
        botonGuardar.setVisible(false);
        etiquetaMuestra1.setText(usuario1 + ", jugará primero su ficha es la ESTRELLA");
        etiquetaMuestra2.setText(usuario2 + " su ficha es la HOJA");
        botonComenzarJuego.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarJuegoActionPerformed
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1, usuario2);
        ventanaP.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonComenzarJuegoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzarJuego;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetaImagenGif;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
