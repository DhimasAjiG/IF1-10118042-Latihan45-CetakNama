
package if1.pkg10118042.latihan45.cetaknama;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Mencetak Nama
 */
public class IF110118042Latihan45CetakNama {

    
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        Printer objP = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        objP.setNama(scan1.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        objP.setJmlCetak(scan2.nextInt());
        objP.cetak(objP.getNama());
        System.out.println("Hasil Cetak : ");
        objP.cetak(objP.getJmlCetak(), objP.getNama());
    }
    
}
