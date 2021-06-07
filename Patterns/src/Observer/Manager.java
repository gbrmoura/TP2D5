/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Manager implements IObservable {
    
    private List<IObserver> users = new ArrayList<>();
    
    @Override
    public void addObserver(IObserver o) {
        this.users.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        this.users.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (IObserver user : users) {
            user.Update();
        }
    }
    
}
