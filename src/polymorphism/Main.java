/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Lab Informatika
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        
        lingkaran.luas();
        
        BangunDatar lingkaran2 = new Lingkaran(7);
        BangunDatar persegi2 = new Persegi(3,5);
        BangunDatar segitiga2 = new Segitiga(4,10);
        
//        System.out.println("Luas lingkaran : " + lingkaran2.luas());
//        System.out.println("Luas persegi : " + persegi2.luas(3,5));
//        System.out.println("Luas segitiga : " + segitiga2.luas());
        
        //Abstract
        
        Kubus kubus = new Kubus(2,"Biru");
        Balok balok = new Balok(1,2,3);
        System.out.println("Luas Permukaan = "+kubus.getLuasPermukaan());
        System.out.println("Luas Permukaan = "+balok.getLuasPermukaan());
        
    }
}
