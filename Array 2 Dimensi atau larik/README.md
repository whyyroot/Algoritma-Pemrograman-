# PROGRAM ARRAY 2 DIMENSI/LARIK
# Array 2 Dimensi Java

# penulis :Muhammad Hanif Ramadhani
Program ini merupakan implementasi Array 2 Dimensi (Matriks) menggunakan bahasa Java.

## Fitur
- Input matriks 3x3
- Menampilkan matriks
- Menghitung jumlah seluruh elemen matriks

## Bahasa
Java
# Program Array 2 Dimensi (Matriks)

## Program Code

```java
import java.util.Scanner;

public class Array2Dimensi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int jumlah = 0;

        System.out.println("PROGRAM ARRAY 2 DIMENSI (MATRIKS 3x3)");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                System.out.print("Masukkan nilai [" + i + "][" + j + "] : ");
                matriks[i][j] = input.nextInt();

                jumlah += matriks[i][j];

            }
        }

        System.out.println("\nHasil Matriks:");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                System.out.print(matriks[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("\nJumlah semua elemen matriks = " + jumlah);

    }
}
```

## Penjelasan Code

### import java.util.Scanner
Digunakan untuk memanggil class Scanner agar program bisa membaca input dari keyboard.

### public class Array2Dimensi
Merupakan class utama dari program Java.

### public static void main(String[] args)
Merupakan method utama yang akan dijalankan pertama kali saat program dijalankan.

### Scanner input = new Scanner(System.in)
Digunakan untuk membuat objek Scanner yang berfungsi membaca input dari pengguna.

### int[][] matriks = new int[3][3]
Digunakan untuk membuat array 2 dimensi (matriks) dengan ukuran 3 baris dan 3 kolom.

### for(int i = 0; i < 3; i++)
Perulangan untuk mengakses baris pada matriks.

### for(int j = 0; j < 3; j++)
Perulangan untuk mengakses kolom pada matriks.

### matriks[i][j] = input.nextInt()
Digunakan untuk mengisi nilai matriks berdasarkan input dari pengguna.

### jumlah += matriks[i][j]
Digunakan untuk menjumlahkan semua elemen matriks.

### System.out.println
Digunakan untuk menampilkan output ke layar.

## Ringkasan

Program ini dibuat menggunakan bahasa Java untuk mengimplementasikan konsep **Array 2 Dimensi (Matriks)**.  
Program akan meminta pengguna memasukkan nilai ke dalam matriks berukuran **3x3**, kemudian program akan menampilkan matriks tersebut serta menghitung jumlah seluruh elemen matriks.


Program berhasil menampilkan matriks dan menghitung jumlah seluruh elemen matriks.
