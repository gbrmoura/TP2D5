/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        ICar celta = (ICar) FactoryGenerate.Build("CAR").Build("CELTA");
        System.out.println("carro : " + celta.getNome()); 
    }
    
}
