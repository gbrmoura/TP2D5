/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adpter;

/**
 *
 * @author Gabriel
 */
public class Main {   
    public static void main(String[] args){
        /**
        * Adpter para adptar dinheiro
        */
    
        IMoney real = new Real()
            .setValue(13.4);
    
        IMoneyAdapter dolar = new DolarAdpter(real);
    
        System.out.println("the value of "+real.getValue()+" real");
        System.out.println("represents "+dolar.getValue()+" on dolar");
    }
}
