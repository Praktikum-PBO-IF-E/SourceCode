/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.models;

/**
 *
 * @author Lab Informatika
 */
public class Orang {
    private String nama;
    private String agama;
    private String jenisKelamin;
    private String hobi;

    public Orang(String nama, String agama, String jenisKelamin, String hobi) {
        this.nama = nama;
        this.agama = agama;
        this.jenisKelamin = jenisKelamin;
        this.hobi = hobi;
    }
    
    public String getNama() {
        return nama;
    }

    public String getAgama() {
        return agama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getHobi() {
        return hobi;
    }
    
    
    public String toFile(){
        String result="";
        result += this.nama + "\n";
        result += this.agama+ "\n";
        result += this.jenisKelamin+ "\n";
        return result;
    }
    
}
