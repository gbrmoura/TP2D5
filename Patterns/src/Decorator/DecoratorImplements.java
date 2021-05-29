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
public class DecoratorImplements implements IDecorator {
	
    public DecoratorImplements() {
        // Empty creator
    }

    @Override
    public String Decorate() {
        return "First Value ";
    }
}

