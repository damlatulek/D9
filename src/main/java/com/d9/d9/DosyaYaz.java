/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d9.d9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 
public class DosyaYaz {

    public void dosyayaYaz(List<Kisiler> liste, String path) throws IOException {

        File file = new File(path);

        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }


        FileWriter fw = new FileWriter(file);

        String kisiyaz = "";
        for (Kisiler kisiler : liste) {
            kisiyaz += kisiler.getAd() + "-" + kisiler.getSoyad() + "-" + kisiler.getYas() + "-" + kisiler.getDogumYeri() + "-" + kisiler.getAdres() + "|";
        }

        fw.write(kisiyaz);
        fw.flush();
        fw.close();
    }

    public List<Kisiler> dosyadanOku(String path) {
        List<Kisiler> list = new ArrayList<Kisiler>();
        try {
            Scanner sc = new Scanner(new File(path));
            String icerik = "";
            while (sc.hasNext()) {
                icerik += sc.next();
            }

            String[] dizi = icerik.split("|");

            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i].length() > 2) {
                    String[] diziAlt = dizi[i].split("-");
                    list.add(new Kisiler(diziAlt[0], diziAlt[1], diziAlt[2], diziAlt[3], diziAlt[4]));
                }
            }

        } catch (Exception e) {
        }
        return list;
    }
    
    
    
}
