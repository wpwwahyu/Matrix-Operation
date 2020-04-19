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
public class pembagian {

    public void bagi(){
        Scanner inp = new Scanner(System.in);
        float MatriksA [][] = new float[2][2];
        float MatriksB [][]  = new float[2][2];
        float MatrikstHasil[][]  = new float[2][2];
        float temp;
        
        System.out.println("\nMatriks A : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Elemen matriks ke ["+(i+1)+"]"+(j+1)+"] : " );
                MatriksA[i][j]=inp.nextFloat();
            }
        }
        System.out.println("");
        System.out.println("Matriks B : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Elemen matriks ke ["+(i+1)+"]"+(j+1)+"] : " );
                MatriksB[i][j]=inp.nextFloat();
            }
        }

        float det = (MatriksB[0][0]*MatriksB[1][1])-(MatriksB[0][1]*MatriksB[1][0]);
        
        System.out.println("Hasil Detrminan : "+det);
        
        System.out.println("\nInvers Matriks B : ");
        temp=MatriksB[0][0];
        MatriksB[0][0]=MatriksB[1][1]/det;
        MatriksB[1][1]=temp/det;
        MatriksB[0][1]*=-1/det;
        MatriksB[1][0]*=-1/det;
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(MatriksB[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                float total=0;
                for(int z=0;z<2;z++){
                    total+=(MatriksA[i][z]*MatriksB[z][j]);
                }
                MatrikstHasil[i][j]=total;
            }
        }
        System.out.println("Hasil Pembagian : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(MatrikstHasil[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
