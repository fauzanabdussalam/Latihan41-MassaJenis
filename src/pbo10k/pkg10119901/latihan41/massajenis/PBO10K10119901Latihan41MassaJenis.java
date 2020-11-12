/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan41.massajenis;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan perhitungan Volume dan Massa Jenis Kubus
 *
 */

public class PBO10K10119901Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus k         = new Kubus();
        Scanner scanner = new Scanner(System.in);
    
        int sisi, massa, volume;
        
        System.out.println("=======Massa Jenis Kubus=======");
        System.out.print("Sisi \t : ");
        sisi = scanner.nextInt();
        k.setSisi(sisi);
        
        System.out.print("Massa \t : ");
        massa = scanner.nextInt();
        k.setMassa(massa);
        
        System.out.println();
        
        volume = k.hitungVolume(k.getSisi());
        
        System.out.println("=======Hasil Perhitungan=======");
        System.out.println("Volume \t\t : " + volume);
        System.out.println("Massa Jenis \t : " + k.hitungMassaJenis(k.getMassa(), volume));
    }
    
}
