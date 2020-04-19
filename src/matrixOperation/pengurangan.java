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
public class pengurangan {
    int baris, kolom, baris2, kolom2;
    int [][] matriksA;
    int [][] matriksB;
    int [][] matriksAll;
    
    public void kurang(){
        Scanner input = new Scanner(System.in);
        System.out.println("matriks 1");
        System.out.print("jumlah baris = ");
        baris = input.nextInt();
        System.out.print("jumlah kolom = ");
        kolom = input.nextInt();
        
        System.out.println("matriks 2");
        System.out.print("jumlah baris = ");
        baris2 = input.nextInt();
        System.out.print("jumlah kolom = ");
        kolom2 = input.nextInt();
        
        if (baris == baris2 && kolom == kolom2){
        matriksA = new int [baris][kolom];
        matriksB = new int [baris][kolom];
        matriksAll = new int [baris][kolom];
        
        System.out.println("\ninputing element matriks\n");
        
        System.out.println("Matriks 1");
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                System.out.print("Elemen matriks ke ["+(i+1)+"]"+(j+1)+"] : " );
                matriksA[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\nMatriks 2");
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                System.out.print("Elemen matriks ke ["+(i+1)+"]"+(j+1)+"] : ");
                matriksB[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Hasil");
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                matriksAll[i][j] = matriksA[i][j] - matriksB[i][j];
            }
        }
        for(int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                System.out.print(matriksAll[i][j]+"\t");
            }
            System.out.println("");
        }
        }
        else {
            System.out.println("Anda salah memasukkan ordo");
            kurang();
        }
    }
}
