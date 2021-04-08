
import java.util.Random;
import javax.swing.JOptionPane;

public class KozosGUI extends javax.swing.JFrame {

    public KozosGUI() {
        initComponents();
    }
    Random rnd = new Random();
    int feladatTipus;
    int megoldas;
    int kerdesSzama = 0;
    int probalkozasDb = 0;
    int joValaszDb = 0;
    double winrate = 0;
    int[] kerdesekSzama = {0, 0, 0, 0};
    int[] probalkozasokSzama = {0, 0, 0, 0};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFeladat = new javax.swing.JLabel();
        txBeolvas = new javax.swing.JTextField();
        btUj = new javax.swing.JButton();
        btEllenoriz = new javax.swing.JButton();
        btMegoldKiir = new javax.swing.JButton();
        txtKerSzoveg = new javax.swing.JLabel();
        txtProbSzoveg = new javax.swing.JLabel();
        txtJoSzoveg = new javax.swing.JLabel();
        txtKerSzam = new javax.swing.JLabel();
        txtProbSzam = new javax.swing.JLabel();
        txtJoSzam = new javax.swing.JLabel();
        txtWinRate = new javax.swing.JLabel();
        txtWinRateSzam = new javax.swing.JLabel();
        btStat = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnOsszeadas = new javax.swing.JMenuItem();
        mnKivonas = new javax.swing.JMenuItem();
        mnSzorzas = new javax.swing.JMenuItem();
        mnOsztas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtFeladat.setText(" ");

        txBeolvas.setToolTipText("");
        txBeolvas.setName(""); // NOI18N
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
        btMegoldKiir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegoldKiirActionPerformed(evt);
            }
        });

        txtKerSzoveg.setText("Kérdések száma:");

        txtProbSzoveg.setText("Próbálkozások száma:");

        txtJoSzoveg.setText("Jó eredmények:");

        txtKerSzam.setText("0");

        txtProbSzam.setText("0");

        txtJoSzam.setText("0");

        txtWinRate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtWinRate.setText("Win rate:");

        txtWinRateSzam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtWinRateSzam.setText("0,0%");

        btStat.setText("Statisztika");
        btStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStatActionPerformed(evt);
            }
        });

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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btStat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProbSzoveg)
                            .addComponent(txtKerSzoveg)
                            .addComponent(txtJoSzoveg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJoSzam)
                            .addComponent(txtKerSzam)
                            .addComponent(txtProbSzam)
                            .addComponent(txtWinRateSzam)))
                    .addComponent(txtWinRate))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFeladat)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txBeolvas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEllenoriz))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWinRateSzam)
                        .addComponent(txtWinRate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKerSzoveg)
                            .addComponent(txtKerSzam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProbSzoveg)
                            .addComponent(txtProbSzam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJoSzam)
                            .addComponent(txtJoSzoveg))
                        .addGap(41, 41, 41)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMegoldKiir)
                    .addComponent(btStat))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        txBeolvas.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSzorzasActionPerformed
        szorzas();
    }//GEN-LAST:event_mnSzorzasActionPerformed

    private void txBeolvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBeolvasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBeolvasActionPerformed

    private void btEllenorizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEllenorizActionPerformed

        try {
            int valasz = Integer.parseInt(txBeolvas.getText());
            if (megoldas == valasz) {
                JOptionPane.showMessageDialog(this, "Jó válasz", "Jó", JOptionPane.INFORMATION_MESSAGE);
                joValaszDb++;
                txtJoSzam.setText(Integer.toString(joValaszDb));
                ujKerdes();
            } else {
                JOptionPane.showMessageDialog(this, "Rossz válasz", "Rossz", JOptionPane.INFORMATION_MESSAGE);
            }
            winrate();
            probalkozas();
            txtProbSzam.setText(Integer.toString(probalkozasDb));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btEllenorizActionPerformed

    private void btUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUjActionPerformed
        ujKerdes();
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

    private void btMegoldKiirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegoldKiirActionPerformed
        JOptionPane.showMessageDialog(this, "Megoldás:\n" + txtFeladat.getText() + " = " + megoldas, "Megoldás", JOptionPane.INFORMATION_MESSAGE);
        ujKerdes();
    }//GEN-LAST:event_btMegoldKiirActionPerformed

    private void btStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStatActionPerformed
        String szoveg = "";
        szoveg += "Kérdések száma:";
        szoveg += "\n\tÖsszeadás: " + kerdesekSzama[0];
        szoveg += "\n\tKivonás: " + kerdesekSzama[1];
        szoveg += "\n\tSzorzás: " + kerdesekSzama[2];
        szoveg += "\n\tOsztás: " + kerdesekSzama[3];
        szoveg += "\n\nPróbálkozások száma:";
        szoveg += "\n\tÖsszeadás: " + probalkozasokSzama[0];
        szoveg += "\n\tKivonás: " + probalkozasokSzama[1];
        szoveg += "\n\tSzorzás: " + probalkozasokSzama[2];
        szoveg += "\n\tOsztás: " + probalkozasokSzama[3];
        JOptionPane.showMessageDialog(this, szoveg, "Statisztika", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btStatActionPerformed

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
    private javax.swing.JButton btStat;
    private javax.swing.JButton btUj;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem mnKivonas;
    private javax.swing.JMenuItem mnOsszeadas;
    private javax.swing.JMenuItem mnOsztas;
    private javax.swing.JMenuItem mnSzorzas;
    private javax.swing.JTextField txBeolvas;
    private javax.swing.JLabel txtFeladat;
    private javax.swing.JLabel txtJoSzam;
    private javax.swing.JLabel txtJoSzoveg;
    private javax.swing.JLabel txtKerSzam;
    private javax.swing.JLabel txtKerSzoveg;
    private javax.swing.JLabel txtProbSzam;
    private javax.swing.JLabel txtProbSzoveg;
    private javax.swing.JLabel txtWinRate;
    private javax.swing.JLabel txtWinRateSzam;
    // End of variables declaration//GEN-END:variables

    private void osszeadas() {
        feladatTipus = 1;
        kerdesSzamlalo();
        int szam1 = rnd.nextInt(98) + 1;
        int szam2 = rnd.nextInt(99 - szam1) + 1;
        txtFeladat.setText(String.valueOf(szam1 + " + " + szam2));
        megoldas = szam1 + szam2;
    }

    private void kivonas() {
        feladatTipus = 2;
        kerdesSzamlalo();
        int alapSzam = rnd.nextInt(99) + 1;
        int kivonandoSzam = rnd.nextInt(99) + 1;
        while (kivonandoSzam > alapSzam) {
            alapSzam = rnd.nextInt(99) + 1;
            kivonandoSzam = rnd.nextInt(99) + 1;
        }
        txtFeladat.setText(String.valueOf(alapSzam + " - " + kivonandoSzam));
        megoldas = alapSzam - kivonandoSzam;
    }

    private void osztas() {
        feladatTipus = 4;
        kerdesSzamlalo();
        int osztandoszam = rnd.nextInt(99) + 1;
        int osztoszam = rnd.nextInt(98) + 2;
        while (!(osztandoszam % osztoszam == 0) || (osztandoszam == osztoszam)) {
            osztandoszam = rnd.nextInt(99) + 1;
            osztoszam = rnd.nextInt(98) + 2;
        }
        txtFeladat.setText(String.valueOf(osztandoszam + " / " + osztoszam));
        megoldas = osztandoszam / osztoszam;
    }

    private void ujKerdes() {
        txBeolvas.setText("");
        if (feladatTipus == 1) {
            osszeadas();
        } else if (feladatTipus == 2) {
            kivonas();
        } else if (feladatTipus == 4) {
            osztas();
        } else if (feladatTipus == 3) {
            szorzas();
        }
        winrate();
    }

    private void kerdesSzamlalo() {
        txBeolvas.setText("");
        if (feladatTipus == 1) {
            kerdesekSzama[0]++;
        } else if (feladatTipus == 2) {
            kerdesekSzama[1]++;
        } else if (feladatTipus == 4) {
            kerdesekSzama[3]++;
        } else if (feladatTipus == 3) {
            kerdesekSzama[2]++;
        }
        kerdesSzama++;
        txtKerSzam.setText(Integer.toString(kerdesSzama));
    }

    private void probalkozas() {
        txBeolvas.setText("");
        probalkozasDb++;
        if (feladatTipus == 1) {
            probalkozasokSzama[0]++;
        } else if (feladatTipus == 2) {
            probalkozasokSzama[1]++;
        } else if (feladatTipus == 4) {
            probalkozasokSzama[3]++;
        } else if (feladatTipus == 3) {
            probalkozasokSzama[2]++;
        }
    }

    private void winrate() {
        //                      2     /                  2           +           20+1-2  =20 *100
        winrate = (double) joValaszDb / ((double) probalkozasDb + (double) kerdesSzama + 1 - (double) joValaszDb) * 100;
        txtWinRateSzam.setText(String.format("%.1f", winrate) + "%");

    }

    private void szorzas() {
        feladatTipus = 3;
        kerdesSzamlalo();
        int szorzandoSzam = rnd.nextInt(50) + 2;
        int szorzoSzam = rnd.nextInt(50) + 2;
        while (szorzandoSzam * szorzoSzam > 100) {
            szorzandoSzam = rnd.nextInt(50) + 2;
            szorzoSzam = rnd.nextInt(50) + 2;
        }
        txtFeladat.setText(String.valueOf(szorzandoSzam + " * " + szorzoSzam));
        megoldas = szorzandoSzam * szorzoSzam;
    }
}
