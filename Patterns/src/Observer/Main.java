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
public class Main {
    
    public static void main(String[] args){
        
       IObservable obs =  new Manager();
       
       IObserver user = new User(obs);
       
       obs.addObserver(user);
       obs.notifyObserver();
        
    }
    
}
