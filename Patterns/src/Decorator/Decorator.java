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
public class Decorator implements IDecorator {
	
    private final IDecorator decorator;

    public Decorator(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String Decorate() {
        return decorator.Decorate();
    }

}
