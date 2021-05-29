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
public class DecoratorValueTwo extends Decorator {

    public DecoratorValueTwo(IDecorator decorator) {
        super(decorator);
    }

    public String Value() {
        return "adding new value";
    }

    @Override
    public String Decorate() {
        return super.Decorate() + this.Value();
    }

}
