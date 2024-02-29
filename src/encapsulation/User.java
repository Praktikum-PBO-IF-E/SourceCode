/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Lab Informatika
 */
public class User {
    private String username; //set get
    private String password; //set

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
