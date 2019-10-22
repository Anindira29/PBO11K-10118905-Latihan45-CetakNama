/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan45.cetaknama;
import java.util.*;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Cetak Nama
 */
public class PBO11K10118905Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer p = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.println("====== Aplikasi Pencetak Nama =======");
        System.out.print("Masukan nama anda\t\t: ");
        String nama = input.nextLine();
        System.out.print("Mau cetak nama berapa kali\t: ");
        int jml = input.nextInt();
        p.setNama(nama);
        p.setJmlCetak(jml);
        p.cetak(p.getNama());
        p.cetak(p.getJmlCetak(), p.getNama());
    }
    
}
