# PROGRAM ARRAY 2 DIMENSI/LARIK
# Array 2 Dimensi Java

Program ini merupakan implementasi Array 2 Dimensi (Matriks) menggunakan bahasa Java.

## Fitur
- Input matriks 3x3
- Menampilkan matriks
- Menghitung jumlah seluruh elemen matriks

## Bahasa
Java
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

import java.util.Scanner 
Digunakan untuk membaca input dari keyboard menggunakan Scanner.
public class Array2Dimensi
Merupakan class utama dari program Java.
