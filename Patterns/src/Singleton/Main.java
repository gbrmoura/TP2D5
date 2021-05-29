/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("The value of the memory is the same");
        System.out.println("Position of the object : " + instanceOne);
        System.out.println("Position of the object : " + instanceTwo);
    }   
}
