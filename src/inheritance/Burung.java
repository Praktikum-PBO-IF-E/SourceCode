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
public class Burung extends Enemy{
    public Burung(String nama, int nyawa, int serangan) {
        super(nama, nyawa, serangan);
    }
    
    void terbang(){
        System.out.println("musuh terbang");
    }
}
