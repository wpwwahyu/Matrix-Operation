/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixOperation;

import java.util.Scanner;

/**
 *
 * @author Wahyu Priyo W
 */
public class perkalian {
    int baris1, kolom1, baris2, kolom2;
    int[][] matriksA;
    int[][] matriksB;
    int[][] matriksAll;
    int sum;

    public void kali() {
        Scanner input = new Scanner(System.in);
        System.out.println("matriks 1");
        System.out.print("jumlah baris = ");
        baris1 = input.nextInt();
        System.out.print("jumlah kolom = ");
        kolom1 = input.nextInt();

        System.out.println("\nmatriks 2");
        System.out.print("jumlah baris = ");
        baris2 = input.nextInt();
        System.out.print("jumlah kolom = ");
        kolom2 = input.nextInt();

        if (kolom1 == baris2) {
            matriksA = new int[baris1][kolom1];
            matriksB = new int[baris2][kolom2];
            matriksAll = new int[baris2][kolom2];

            System.out.println("\ninputing element matriks\n");

            System.out.println("Matriks 1");
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    System.out.print("Elemen matriks ke [" + (i + 1) + "]" + (j + 1) + "] : ");
                    matriksA[i][j] = input.nextInt();
                }
            }

            System.out.println("\nMatriks 2");
            for (int i = 0; i < baris2; i++) {
                for (int j = 0; j < kolom2; j++) {
                    System.out.print("Elemen matriks ke [" + (i + 1) + "]" + (j + 1) + "] : ");
                    matriksB[i][j] = input.nextInt();
                }
            }
            
            System.out.println("Hasil");
            for (int i = 0; i < baris1; i++) {
              for (int j = 0; j < kolom2; j++) {
                sum = 0;
                for (int k = 0; k < baris2; k++) {
                  sum = sum+matriksA[i][k]*matriksB[k][j];
                }
                matriksAll[i][j] = sum;
              }
            }
            
            for (int i = 0; i < baris1; i++) {
              for (int j = 0; j < kolom2; j++) {
                  System.out.print(matriksAll[i][j]+"\t");
              }
                System.out.println("");
            }
        }
        else {
            System.out.println("Anda memasukan ordo yang salah");
            kali();
        }
    }
}
