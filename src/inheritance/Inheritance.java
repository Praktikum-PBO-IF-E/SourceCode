/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zombie zombie = new Zombie("Verdugo", 100, 30);
        
        zombie.berjalan();
        
        Burung burung = new Burung("bird", 120, 50);
        burung.berjalan();
        burung.terbang();
        
        System.out.print("Nama burung : ");
        burung.nama = input.next();
        
        burung.berjalan();
    }
}
