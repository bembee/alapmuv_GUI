
import java.util.Random;
import javax.swing.JOptionPane;

public class KozosGUI extends javax.swing.JFrame {

    public KozosGUI() {
        initComponents();
    }
    Random rnd = new Random();
    int feladatTipus;
    int megoldas;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFeladat = new javax.swing.JLabel();
        txBeolvas = new javax.swing.JTextField();
        btUj = new javax.swing.JButton();
        btEllenoriz = new javax.swing.JButton();
        btMegoldKiir = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnOsszeadas = new javax.swing.JMenuItem();
        mnKivonas = new javax.swing.JMenuItem();
        mnSzorzas = new javax.swing.JMenuItem();
        mnOsztas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtFeladat.setText("FELADAT");

        txBeolvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBeolvasActionPerformed(evt);
            }
        });

        btUj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUjActionPerformed(evt);
            }
        });

        btEllenoriz.setText("Ellenőrzés");
        btEllenoriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEllenorizActionPerformed(evt);
            }
        });

        btMegoldKiir.setBackground(new java.awt.Color(0, 204, 0));
        btMegoldKiir.setText("Megoldás kiírása");

        jMenu.setText("Feladatok");

        mnOsszeadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        mnOsszeadas.setText("Összeadás");
        mnOsszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOsszeadasActionPerformed(evt);
            }
        });
        jMenu.add(mnOsszeadas);

        mnKivonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus-512.png"))); // NOI18N
        mnKivonas.setText("Kivonás");
        mnKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKivonasActionPerformed(evt);
            }
        });
        jMenu.add(mnKivonas);

        mnSzorzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        mnSzorzas.setText("Szorzás");
        mnSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSzorzasActionPerformed(evt);
            }
        });
        jMenu.add(mnSzorzas);

        mnOsztas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/division.png"))); // NOI18N
        mnOsztas.setText("Osztás");
        mnOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOsztasActionPerformed(evt);
            }
        });
        jMenu.add(mnOsztas);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btEllenoriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txBeolvas)
                                .addComponent(btMegoldKiir, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btUj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFeladat)
                .addGap(12, 12, 12)
                .addComponent(btUj)
                .addGap(18, 18, 18)
                .addComponent(txBeolvas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEllenoriz)
                .addGap(18, 18, 18)
                .addComponent(btMegoldKiir)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSzorzasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSzorzasActionPerformed

    private void txBeolvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBeolvasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBeolvasActionPerformed

    private void btEllenorizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEllenorizActionPerformed

        try {
            int valasz = Integer.parseInt(txBeolvas.getText());
            if (megoldas == valasz) {
                JOptionPane.showMessageDialog(this, "Jó", "Rendelés", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Rossz", "Rendelés", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btEllenorizActionPerformed

    private void btUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUjActionPerformed
        if (feladatTipus == 2) {
            kivonas();
        } else if (feladatTipus == 4) {
            osztas();
        } else if (feladatTipus == 1) {
            osszeadas();
        }
    }//GEN-LAST:event_btUjActionPerformed

    private void mnOsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOsszeadasActionPerformed
        osszeadas();
    }//GEN-LAST:event_mnOsszeadasActionPerformed

    private void mnKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKivonasActionPerformed
        kivonas();
    }//GEN-LAST:event_mnKivonasActionPerformed

    private void mnOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_mnOsztasActionPerformed

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
            java.util.logging.Logger.getLogger(KozosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KozosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KozosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KozosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KozosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEllenoriz;
    private javax.swing.JButton btMegoldKiir;
    private javax.swing.JButton btUj;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem mnKivonas;
    private javax.swing.JMenuItem mnOsszeadas;
    private javax.swing.JMenuItem mnOsztas;
    private javax.swing.JMenuItem mnSzorzas;
    private javax.swing.JTextField txBeolvas;
    private javax.swing.JLabel txtFeladat;
    // End of variables declaration//GEN-END:variables

    private void osztas() {
        int osztandoszam = rnd.nextInt(99) + 1;
        int osztoszam = rnd.nextInt(98) + 2;
        while (!(osztandoszam % osztoszam == 0) || (osztandoszam == osztoszam)) {
            osztandoszam = rnd.nextInt(99) + 1;
            osztoszam = rnd.nextInt(98) + 2;
        }
        txtFeladat.setText(String.valueOf(osztandoszam + " / " + osztoszam));
        feladatTipus = 4;
        megoldas = osztandoszam / osztoszam;
    }

    private void kivonas() {
        int alapSzam = rnd.nextInt(99) + 1;
        int kivonandoSzam = rnd.nextInt(99) + 1;
        while (kivonandoSzam > alapSzam) {
            alapSzam = rnd.nextInt(99) + 1;
            kivonandoSzam = rnd.nextInt(99) + 1;
        }
        txtFeladat.setText(String.valueOf(alapSzam + " - " + kivonandoSzam));
        feladatTipus = 2;
        megoldas = alapSzam - kivonandoSzam;
    }
    
    private void osszeadas(){
        int szam1 = rnd.nextInt(98) + 1;
        int szam2 = rnd.nextInt(99 - szam1) + 1;
        txtFeladat.setText(String.valueOf(szam1 + " + " + szam2));
        feladatTipus = 1;
        megoldas = szam1 + szam2;
    }
}
