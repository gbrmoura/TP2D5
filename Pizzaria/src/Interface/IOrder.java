/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.Client;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabriel
 * @param <X> - Type of Order
 * @param <Y> - Type of Itens
 */

public interface IOrder<X,Y> {
    public X setClient(Client client);
    public Client getClient();
    public X setItem(Y item);
    public Y getItem(int index);
    public List<Y> getItems();
    public Date getDate();
    public double getTotalValue();
}
