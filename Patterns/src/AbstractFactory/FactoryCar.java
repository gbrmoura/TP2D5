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
public class FactoryCar implements IAbstractFactory<ICar> {
    
    public FactoryCar(){
        //Empty creator
    }
    
    public ICar Build(String type){
        switch(type){
            case "CELTA":
                return new CeltaPreto();
            default:
               throw new Error("error while trying to create a car!");
        }
    }
    
}
