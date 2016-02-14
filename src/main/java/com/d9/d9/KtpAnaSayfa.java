/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d9.d9;

/**
 *
 * @author vektorel
 */
public class KtpAnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form KtpAnaSayfa
     */
    public KtpAnaSayfa() {
        initComponents();
        KtpKisiListele kisilistele = new KtpKisiListele(this, true);
        kisilistele.Liste();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miKisiEkle = new javax.swing.JMenuItem();
        miKisiGuncelle = new javax.swing.JMenuItem();
        miKisiListele = new javax.swing.JMenuItem();
        miKisiSil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miKitapEkle = new javax.swing.JMenuItem();
        miKitapSil = new javax.swing.JMenuItem();
        miKitapListele = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miExcel = new javax.swing.JMenuItem();
        miYardim = new javax.swing.JMenuItem();
        micikis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Kişiler");

        miKisiEkle.setText("Kişi Ekle");
        miKisiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiEkleActionPerformed(evt);
            }
        });
        jMenu1.add(miKisiEkle);

        miKisiGuncelle.setText("Kişi Güncelle");
        jMenu1.add(miKisiGuncelle);

        miKisiListele.setText("Kişi Listele");
        miKisiListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiListeleActionPerformed(evt);
            }
        });
        jMenu1.add(miKisiListele);

        miKisiSil.setText("Kişi Sil");
        miKisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKisiSilActionPerformed(evt);
            }
        });
        jMenu1.add(miKisiSil);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Kitaplar");

        miKitapEkle.setText("Kitap Ekle");
        jMenu2.add(miKitapEkle);

        miKitapSil.setText("Kitap Sil");
        jMenu2.add(miKitapSil);

        miKitapListele.setText("Kitap Listele");
        jMenu2.add(miKitapListele);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Diğer");

        miExcel.setText("Excel Görüntüle");
        jMenu3.add(miExcel);

        miYardim.setText("Yardım");
        jMenu3.add(miYardim);

        micikis.setText("Çıkış");
        micikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micikisActionPerformed(evt);
            }
        });
        jMenu3.add(micikis);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void micikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micikisActionPerformed
        System.exit(1);
    }//GEN-LAST:event_micikisActionPerformed

    private void miKisiListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiListeleActionPerformed
        KtpKisiListele kisilistele = new KtpKisiListele(this, true);
        kisilistele.show();
        
    }//GEN-LAST:event_miKisiListeleActionPerformed

    private void miKisiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiEkleActionPerformed
        KtpKisiEkle kisiekle = new KtpKisiEkle(this, true);
        kisiekle.show();
        KtpKisiListele kisiliste = new KtpKisiListele(this, true);
        kisiliste.show();
        
    }//GEN-LAST:event_miKisiEkleActionPerformed

    private void miKisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKisiSilActionPerformed
       
      KtpKisiListele kisiliste = new KtpKisiListele(this, true);
      kisiliste.silme();
        
        
        
    }//GEN-LAST:event_miKisiSilActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miExcel;
    private javax.swing.JMenuItem miKisiEkle;
    private javax.swing.JMenuItem miKisiGuncelle;
    private javax.swing.JMenuItem miKisiListele;
    private javax.swing.JMenuItem miKisiSil;
    private javax.swing.JMenuItem miKitapEkle;
    private javax.swing.JMenuItem miKitapListele;
    private javax.swing.JMenuItem miKitapSil;
    private javax.swing.JMenuItem miYardim;
    private javax.swing.JMenuItem micikis;
    // End of variables declaration//GEN-END:variables
}
