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
public class FactoryGenerate {

    public static IAbstractFactory<?> Build(String type){
        switch(type){
            case "CAR":
                return new FactoryCar();
            default:
                throw new Error("Error while trying to create a factory!");
        }
    }
}
