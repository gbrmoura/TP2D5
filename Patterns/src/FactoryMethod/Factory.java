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
public class Factory {
    
    private Factory(){
    
    }
    
    public static IClass Build(TypeMethod type) {
        switch (type) {
            case TypeOne : { 
                return new ClassOne();
            }
            case TypeTwo : {
                return new ClassTwo();
            }
            default : 
                throw new Error("Error was caught!");
        }
    }
    
    
}
