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
public abstract class BangunRuang {
    private String warna;
    
    String getWarna(){
        return warna;
    }
    void setWarna(String value){
        warna= value;
    }
    
    abstract int getLuasPermukaan();
    
    abstract int getVolume();
    
    abstract void ubahWarna();
}
