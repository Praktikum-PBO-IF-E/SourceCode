/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User pbo = new User("pbo", "12345");

        String username, password;

        System.out.print("Masukkan username : ");
        username = input.next();
        System.out.print("Masukkan password : ");
        password = input.next();
        
        if(pbo.login(username, password)){
            System.out.println("Berhasil login");
        }else{
            System.out.println("Gagal Login");
        }
    }
}
