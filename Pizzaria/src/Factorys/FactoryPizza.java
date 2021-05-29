/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Enums.TypePizza;
import Interface.IPizza;
import Models.Peperoni;
import Models.Portuguese;

/**
 *
 * @author Gabriel
 */
public class FactoryPizza {
    
    private FactoryPizza(){
        //Empty creator
    }
    
    public static IPizza Build(TypePizza type){
        switch(type){
            case Peperoni:
                return Peperoni.Build();
            case Portuguese:
                return Portuguese.Build();
            default:
                throw new Error("Error while tryng to create Pizza!");
        }
    }
}
