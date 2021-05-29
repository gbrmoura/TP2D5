/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;
import java.util.List;
import Interface.IOrder;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class FiscalDay {
    private Date date;
    private List<IOrder<?,?>> orders;
    
    private FiscalDay() {
        orders = new ArrayList<>();
        date = new Date();
    }
    
    public static FiscalDay Build() {
        return new FiscalDay();
    }

    public Date getDate() {
        return date;
    }

    public List<IOrder<?, ?>> getOrders() {
        return orders;
    }

    public FiscalDay setOrders(IOrder<?,?> order) {
        this.orders.add(order);
        return this;
    }
    
    
}
