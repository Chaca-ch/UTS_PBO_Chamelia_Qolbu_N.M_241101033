
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amel_
 */
public class mushroomUTS { 
            
    String namaSpesies;
    boolean dapatDikonsumsi; 
    
    public mushroomUTS (String nama, boolean edible){
        this.namaSpesies = nama;
        this.dapatDikonsumsi = edible;
        System.out.println("Jamur " + nama + " untuk di identifikasi.");
        
    }
    
    public String cekStatus(){
        if (this.dapatDikonsumsi) {
            return "Jamur ini aman untuk dikonsumsi(Edible).";
            
        } else {
                return "Jamur ini Beracun(Poisonous)!";
        }
    }
    
    public void klasifikasi(){
        System.out.println("Spesies:" + this.namaSpesies);
        System.out.println("Hasil pengecekan:" + this.cekStatus());
    }
    
    public static void main(String[] args){
        mushroomUTS aman = new
        mushroomUTS("Tiram", true);
        
        mushroomUTS beracun = new
        mushroomUTS("kikik lalat", false);
        
        System.out.println("\n===== Pengecekan Jamur =====");
        
        aman.klasifikasi();
        
        System.out.println("\n===== Pengecekan Jamur =====");
        
        beracun.klasifikasi();
    }
}