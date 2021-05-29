
import Enums.TypeIngredient;
import Enums.TypePizza;
import Factorys.FactoryIngredient;
import Factorys.FactoryPizza;
import Interface.IOrder;
import Interface.IPizza;
import Models.Address;
import Models.Client;
import Models.FiscalDay;
import Models.OrderPizza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args){

            // the day begins
        FiscalDay dayOne = FiscalDay.Build();

        IOrder<OrderPizza, IPizza> firstOrder = OrderPizza.Build()
                .setClient(Client.Build()
                        .setFirstname("Gabriel")
                        .setLastname("Alves de Moura")
                        .setCpf("415.381.932-9")
                        .setAddress(Address.Build()
                            .setRoad("Venus de Louro")
                            .setNumber("78")
                            .setDistrict("Parque Tiete")))
                .setItem(FactoryPizza.Build(TypePizza.Peperoni)
                    .setIngredientes(FactoryIngredient.Build(TypeIngredient.Onion)
                        .setAmaount(10))
                    .setIngredientes(FactoryIngredient.Build(TypeIngredient.Tomato)
                        .setAmaount(12))
                    .setValue(37.50))
                .setItem(FactoryPizza.Build(TypePizza.Portuguese)
                    .setIngredientes(FactoryIngredient.Build(TypeIngredient.Tomato)
                        .setAmaount(5))
                    .setIngredientes(FactoryIngredient.Build(TypeIngredient.Onion)
                        .setAmaount(2))
                    .setValue(50.90));

        dayOne.setOrders(firstOrder);

        System.out.println("----------------------------------------------------");
        System.out.println("Day : " + dayOne.getDate());
        System.out.println("----------------------------------------------------\n");
        
        for(var order: dayOne.getOrders()) {
            System.out.println("----------------------------------------------------");
            System.out.println("Day of Order : " + order.getDate());
            System.out.println("Client : " + order.getClient().getFullName());
            System.out.println("With Addres : " + order.getClient().getAddress().getAddress());
            System.out.println("----------------------------------------------------\n");
            
            System.out.println("----------------------------------------------------");
            System.out.println("Value Total : " + order.getTotalValue());
            System.out.println("----------------------------------------------------\n");
        }
    }   
}
