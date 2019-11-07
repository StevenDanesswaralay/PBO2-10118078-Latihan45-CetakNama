/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author  
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas: Cetak Nama
 */
public class PBO2_10118078_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer print = new Printer();
        System.out.println("===== Aplikasi Pencetak Nama =====");
        System.out.print("Masukan Nama Anda : " );
        print.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scanner.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
