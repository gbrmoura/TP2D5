/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interface.IPizza;
import Interface.IIngredient;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author Gabriel
 */
public class Peperoni implements IPizza {
    
    private double value;
    private List<IIngredient> ingredients;
    
    private Peperoni(){
        ingredients = new ArrayList<IIngredient>();
    }
    
    public static IPizza Build(){
        return new Peperoni();
    }

    @Override
    public String getName() {
        return "Peperoni";
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public IPizza setValue(double value) {
        this.value = value;
        return this;
    }

    @Override
    public IPizza setIngredientes(IIngredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    @Override
    public List<IIngredient> getIngredients() {
        return ingredients;
    }
}
