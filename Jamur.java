
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amel_
 */

import java.util.Scanner;

public class Jamur { 
   String namaSpesies;
   String warna;
   String aroma;
   
   public Jamur(String nama) {
       this.namaSpesies = nama;
   }
   
   public void inputIdentifikasi(Scanner scanner){
       System.out.println("Nama : " + this.namaSpesies);
       System.out.print("Masukan warna Jamur : "); 
            this.warna = scanner.nextLine();
       System.out.print("Aroma (menyengat/tidak) : ");
            this.aroma = scanner.nextLine().toLowerCase();
   }
    
   public void tampilanHasil() {
       System.out.println("\n==================\n");
       System.out.println("HASIL IDENTIFIKASI");
       
       if(this.warna.equalsIgnoreCase("putih")&&
               this.aroma.contains("tidak")) {
           System.out.println("Jamur Aman untuk Dikonsumsi!");}
       else { System.out.println("Jamur Beracun, Tidak aman untuk dikonsumsi");
       }
        System.out.println("==================");
   }
   
   public static void main(String[]args){
       Scanner keyboardInput = new Scanner(System.in);
       
       System.out.println("=== Mengindentifikasi Jamur ===");
       
       Jamur jamurUji = new Jamur("Jamur Tiram");
       
       jamurUji.inputIdentifikasi(keyboardInput);
       jamurUji.tampilanHasil();
       
       keyboardInput.close();
   }
}
