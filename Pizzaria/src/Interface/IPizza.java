/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public interface IPizza {
    public String getName();
    public double getValue();
    public IPizza setValue(double value);
    public IPizza setIngredientes(IIngredient ingredient);
    public List<IIngredient> getIngredients();
}
