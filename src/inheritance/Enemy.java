/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lab Informatika
 */
public class Enemy {
    String nama;
    int nyawa, serangan;

    public Enemy(String nama, int nyawa, int serangan) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.serangan = serangan;
    }
    
    void berjalan(){
        System.out.println(nama + " mendekat");
    }
    
    void menyerang(){
        System.out.println("Serang sebesar" + serangan);
    } 
    
}
