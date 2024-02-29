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
public class Kubus extends BangunRuang {

    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    public Kubus(int sisi,String warna) {
        this.sisi = sisi;
        super.setWarna(warna);
        System.out.println("Kubus "+super.getWarna()+" Terinstansiasi");
        
    }
    
    @Override
    int getLuasPermukaan() {
        return 6*sisi;
    }

    @Override
    int getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void ubahWarna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
