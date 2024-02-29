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
public class Persegi extends BangunDatar{
    int panjang;
    int lebar;

    public Persegi(int panjang) {
        this.panjang = panjang;
    }

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    double luas(){
        return panjang*panjang;
    }
    
    @Override
    double luas(int panjang, int lebar){
        return panjang*lebar;
    }
    
    @Override
    double keliling(){
        return panjang*4;
    }
    
    
}
