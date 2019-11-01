/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menampilkan jenis handphone
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Android android = new Android("Samsung", "Android", "Grand", 3000000);
       android.setKeyStore("234ibfd3840fo");
       android.displayProduct();
       System.out.println("Android Key Store : " + android.getKeyStore());
       
       System.out.println();
        
      Blackberry blackberry = new Blackberry("BlackB", "RIM", "Curve", 2000000);
      blackberry.setPinBB("BHS249");
      blackberry.displayProduct();
      System.out.println("PIN : " + blackberry.getPinBB());
      
      System.out.println();
        
      WindowsPhone wPhone = new WindowsPhone("Nokia", "Win 8", "Lumia", 1000000);
      wPhone.setWpKeyStore("UUUQIJWORJ");
      wPhone.displayProduct();
       System.out.println("Wp Key Store : " + wPhone.getWpKeyStore());
       
    }
    
}
