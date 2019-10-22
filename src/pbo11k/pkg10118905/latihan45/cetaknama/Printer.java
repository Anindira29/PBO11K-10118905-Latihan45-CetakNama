/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan45.cetaknama;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Cetak Nama
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak (String nama) {
        System.out.println("Nama Anda\t: "+nama);
    }
    
    public void cetak (int jmlCetak,String nama) {
        System.out.println("Hasil Cetak\t:");
        for(int i = 1; i<= jmlCetak;i++) {
            System.out.println(i+". "+nama);
        }
    }
}

