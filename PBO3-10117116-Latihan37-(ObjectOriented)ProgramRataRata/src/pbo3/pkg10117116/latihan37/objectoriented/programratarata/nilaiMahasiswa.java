/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan37.objectoriented.programratarata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Rata Rata Berbasis Objek
 *  
 */
public class nilaiMahasiswa {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double hitungTotal(int parNilaiMhs, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
    return totalNilaiMhs;}

    public double hitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
    
}
