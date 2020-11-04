/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game1tebakangka;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pratiwiajs
 */
public class Tebak1 {
    
    //membuatAtribut//
    int komputer; int jawab;
    
    void nebakRandom() {
        Random randomAngka = new Random();
        this.komputer = randomAngka.nextInt(101);
    }
    
    //membuatMethod//
    void jawabTebakan(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan Tebakan Anda : ");
            this.jawab = input.nextInt();
            if (jawab > komputer) {
                System.out.println("Hehehe... Bilangan Tebakan Anda Terlalu Besar :(");               
                }else if (jawab < komputer){
                    System.out.println("Hehehe... Bilangan Tebakan Anda Terlalu Kecil :("); 
                }else {
                    System.out.println("Yayyyyyyy... Selamat Bilangan Tebakan Anda BENAR !!!");
                }
        } while (jawab != komputer);
    }
    
}
