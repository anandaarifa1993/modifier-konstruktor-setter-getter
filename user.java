/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konstruktor;

/**
 *
 * @author User
 */
public class user {
    
    private String username;
    private String password;
    public user(String username,String password){
        this.username = username;
        this.password = password;
    
    }
    public void setusername(String username){
        this.username = username;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public String getusername(){
        return this.username;
    }
    public String getpassword(){
        return this.password;
    }
}


