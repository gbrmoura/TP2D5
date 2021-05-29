/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interface.IIngredient;
import Interface.IPizza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Portuguese implements IPizza{
    
    private double value;
    private List<IIngredient> ingredients;
    
    private Portuguese(){
        ingredients = new ArrayList<IIngredient>();
    }
    
    public static IPizza Build(){
        return new Portuguese();
    }

    @Override
    public String getName() {
        return "Portuguese";
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
