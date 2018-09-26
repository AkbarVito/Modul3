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
    public class Selasa extends Senin {
    private String hari = "Selasa";
    private String jadwal = "\n    - Fisika X "
                          + "\n    - Sistem Telekomunikasi X"
                          + "\n    - Sejarah Indonesia X"
                          + "\n    - Produktif RPL X";
     protected void selasa(){
       super.identitas();
       super.judul();
       super.info();
     System.out.println("  > Hari "+hari+" : "+jadwal);
}

}
