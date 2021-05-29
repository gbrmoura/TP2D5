/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {

        IDecorator firstClass = new DecoratorImplements();

        System.out.println("this value represents the first value of decorator");
        System.out.println("value - " + firstClass.Decorate() + "\n");

        IDecorator secondClass = new DecoratorValueTwo(firstClass);

        System.out.println("this value represents the second value of decorator");
        System.out.println("value - " + secondClass.Decorate() + "\n");

    }
}
