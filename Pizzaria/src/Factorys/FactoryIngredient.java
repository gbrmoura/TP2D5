/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Interface.IIngredient;
import Enums.TypeIngredient;
import Models.Onion;
import Models.Tomato;

/**
 *
 * @author Gabriel
 */
public class FactoryIngredient {
    
    private FactoryIngredient(){
        //Empty creator
    }
    
    public static IIngredient Build(TypeIngredient type){
        switch(type){
            case Onion:
                return Onion.Build();
            case Tomato:
                return Tomato.Build();
            default:
                throw new Error("Error while tryng to create ingredient!");
        }
    }
    
}
