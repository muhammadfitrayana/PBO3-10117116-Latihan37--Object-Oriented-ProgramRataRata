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
public class PBO310117116Latihan37ObjectOrientedProgramRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         nilaiMahasiswa mhs = new nilaiMahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.hitungTotal(mhs.nilaiMhs, n);
         mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
       
        System.out.println("Developed By : Muhammad Fitrayana");
    }
    
 }
    

