/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d9.d9;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vektorel
 */
public class KtpKisiListele extends javax.swing.JDialog {
    
    
 public static List<Kisiler> kisiler = new ArrayList<Kisiler>();
   
 
 public KtpKisiListele(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Liste();
    }
   
    
    public void Liste(){
       
            String [] baslik = new String []{"Ad","Soyad","Yaş","Doğum Yeri","Adres"}; 
            String [][] bilgiler = new String [kisiler.size()][5];
            
            for (int i = 0; i < kisiler.size(); i++) {
                bilgiler[i][0] = kisiler.get(i).getAd();
                bilgiler[i][1] = kisiler.get(i).getSoyad();
                bilgiler[i][2] = kisiler.get(i).getYas();
                bilgiler[i][3] = kisiler.get(i).getDogumYeri();
                bilgiler[i][4] = kisiler.get(i).getAdres();
                
                tblKisi.setModel(new DefaultTableModel(bilgiler ,baslik));
                
                
            }
                    
   
           
    }
    
    
    
    public void silme(){
         int selectedRow = tblKisi.getSelectedRow();
       if(selectedRow!=-1){
          kisiler.remove(selectedRow);
          Liste();
       }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblKisi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblKisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "Yaş", "Doğum Yeri", "Adres"
            }
        ));
        jScrollPane1.setViewportView(tblKisi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKisi;
    // End of variables declaration//GEN-END:variables
}
