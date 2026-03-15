/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan_algoritma_pemrograman_v1;

/**
 *
 * @author andir
 */
public class ArraySatuDimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array nilai mahasiswa
        int[] nilai = {85, 90, 78, 92, 88};
        
        // Menampilkan semua nilai
        System.out.println("Daftar Nilai Mahasiswa Informatika:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilai[i]);
        }
        
        // Menghitung rata-rata nilai
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
