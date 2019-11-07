/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandanyakamu;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program umur
 *
 * @author Moch Rizki Maulana N
 */
public class TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        Age ag=new Age(2019);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(input.nextInt());
        
        System.out.println("===== Hasil Perhitungan Umur");
        System.out.println("Tahun Lahir Anda : "+ag.getYearBirth());
        System.out.println("Hari Ini Tahun : "+ag.getYearNow());
        System.out.println("Umur Kamu Sampai Hari Ini Adalah "+ag.hitungUmur()+" Tahun");
        System.out.println("Tandanya Kamu "+ag.tandanyaKamu(ag.hitungUmur()));
        
        
    }
    
}
