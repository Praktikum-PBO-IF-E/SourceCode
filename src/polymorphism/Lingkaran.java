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
public class Lingkaran extends BangunDatar{
    int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    double luas(){
        return Math.PI*jariJari*jariJari;
    }
    
    @Override
    double keliling(){
        return Math.PI*2*jariJari;
    }
    
    
}
