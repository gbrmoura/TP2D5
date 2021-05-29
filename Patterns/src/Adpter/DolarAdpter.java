
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
public class DolarAdpter implements IMoneyAdapter {

    private IMoney money;
    
    public DolarAdpter(IMoney money) {
        this.money = money;
    }
    
    @Override
    public double getValue() {
        return ConvertValueToDolar();
    }
    
    private double ConvertValueToDolar(){
        return (money.getValue() * 5.23);
    }
    
}
