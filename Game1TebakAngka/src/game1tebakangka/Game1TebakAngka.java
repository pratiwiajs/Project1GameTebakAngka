/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game1tebakangka;

/**
 *
 * @author pratiwiajs
 */
public class Game1TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Haiii... Saya Pratiwi Cantiqs, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak yaaa!!!");
        Tebak1 T1 = new Tebak1();
        T1.nebakRandom();
        T1.jawabTebakan();
    }
}
