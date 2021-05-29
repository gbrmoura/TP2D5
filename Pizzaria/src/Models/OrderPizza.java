/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interface.IOrder;
import Interface.IPizza;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class OrderPizza implements IOrder<OrderPizza, IPizza> {
    
    private Client client;
    private Date date;
    private List<IPizza> items;
    
    private OrderPizza(){
        items = new ArrayList<IPizza>();
        date = new Date();
    }
    
    public static IOrder<OrderPizza, IPizza> Build() {
        return new  OrderPizza();
    }

    @Override
    public OrderPizza setClient(Client client) {
        this.client = client;
        return this;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public OrderPizza setItem(IPizza item) {
        items.add(item);
        return this;
    }

    @Override
    public IPizza getItem(int index) {
        return items.get(index);
    }

    @Override
    public List<IPizza> getItems() {
        return items;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public double getTotalValue() {
        double total = 0;
        for(IPizza item : items) {
            total += item.getValue();
        }
        return total;
    }
    
}
