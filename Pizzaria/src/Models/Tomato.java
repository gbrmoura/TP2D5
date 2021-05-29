/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interface.IIngredient;

/**
 *
 * @author Gabriel
 */
public class Tomato implements IIngredient {
    
    private int amount; 
    
    private Tomato() {
        // Empty creator
    } 
    
    public static IIngredient Build(){
        return new Tomato();
    }
    
    @Override
    public String getName(){
        return "Tomato";
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public IIngredient setAmaount(int amount) {
        this.amount = amount;
        return this;
    }
    
}
