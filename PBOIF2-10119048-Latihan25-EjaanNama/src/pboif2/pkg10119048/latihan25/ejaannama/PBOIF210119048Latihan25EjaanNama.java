/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nama;
        
        System.out.print("Masukan nama depan anda untuk dieja : ");
        nama = input.next();
        
        System.out.println("Ejaan untuk " + "" + nama + "" + " adalah");
        String kata[] = nama.split("|");
        for (int i=0;i<kata.length;i++){
            System.out.println("Huruf Ke-" + (i+1) + " " + ": " + kata[i]);
        }
    }
    
}
