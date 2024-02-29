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
public class Robot extends Enemy{
    public Robot(String nama, int nyawa, int serangan) {
        super(nama, nyawa, serangan);
    }
    
    void teleport(){
        System.out.println("berpindah tempat");
    }
}
