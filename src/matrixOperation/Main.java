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
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        penjumlahan p = new penjumlahan();
        pengurangan q = new pengurangan();
        perkalian r = new perkalian();
        pembagian s = new pembagian();

        int pilih;

        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.print("pilih operasi : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                p.tambah();
                break;
            case 2:
                q.kurang();
                break;
            case 3:
                r.kali();
                break;
            case 4:
                s.bagi();
                break;

        }

    }
}
