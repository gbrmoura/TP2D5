/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        
        IClass classOne = Factory.Build(TypeMethod.TypeOne);
        IClass classTwo = Factory.Build(TypeMethod.TypeTwo);
        
        System.out.println("Value of the class one : " + classOne.getValue());
        System.out.println("Value of the class two : " + classTwo.getValue());       
    }
    
}
