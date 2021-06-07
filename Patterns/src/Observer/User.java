/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Gabriel
 */
public class User implements IObserver {
    
    private final IObservable manager;
    
    public User(IObservable o) {
        this.manager = o;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update() {
        System.out.println("user was notfiyed.");
    }
    
}
