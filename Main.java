/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konstruktor;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        user nama = new user("nanamin","ryu");
        

        nama.setusername("nanamin");
        nama.setpassword("ryu");
        System.out.println("Username : "+nama.getusername());
        System.out.println("Password : "+nama.getpassword());
    }
}
  