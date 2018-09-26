/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author asus
 */
public class Senin {
        private String hari = "Senin";
    private String jadwal = "\n    - Penjas & kesehatan X "
                          + "\n    - Produktif RPL X "
                          + "\n    - Bahasa Inggris X"
                          + "\n    - BK X";

    protected void identitas(){
        System.out.println("-----------AKBAR VITO HARTONO / X RPL 5 / 05-----------");
    }
    protected void judul(){
        System.out.println("\n* Jadwal Pelajaran SMK Telkom Malang Kelas X RPL 5");

    }
     public void info (){
     System.out.println("  > Hari "+hari+" : "+jadwal);

}

}
