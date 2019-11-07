/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg46.tandanyakamu;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menampilkan status umur dari umur yang
 * diinputkan user
 */
public class PBO210118060LatihanKe46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static int yearNow , umur;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        
        umur = age.hitungUmur();
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + yearNow);
        System.out.println("Umur kamu sampai hari ini adalah " + umur + " tahun");
        System.out.println("Tandanya Kamu "+ age.tandanyaKamu(age.hitungUmur())); 
    }
    
}
