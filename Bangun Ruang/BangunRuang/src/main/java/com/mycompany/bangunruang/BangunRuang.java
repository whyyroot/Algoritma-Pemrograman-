/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangunruang;
import java.util.Scanner;
/**
 *
 * @author wahyu
 */

public class BangunRuang {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== Program Bangun Ruang Java ===");
            System.out.println("1. Kubus");
            System.out.println("2. Tabung");
            System.out.print("Pilih menu (1/2): ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan panjang sisi: ");
                double s = input.nextDouble();
           
                double volume = Math.pow(s, 3);
                double luas = 6 * Math.pow(s, 2);

                System.out.println("Volume Kubus: " + volume);
                System.out.println("Luas Permukaan: " + luas);

            } else if (pilihan == 2) {
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                double volume = Math.PI * Math.pow(r, 2) * t;
                double luas = 2 * Math.PI * r * (r + t);

                System.out.printf("Volume Tabung: %.2f\n", volume);
                System.out.printf("Luas Permukaan: %.2f\n", luas);
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }

            input.close();
        }
    
}
