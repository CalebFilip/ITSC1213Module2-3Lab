
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author filip
 */
public class Module3Test {
    
    public static void main(String[] args){
        FastFoodKitchen kitchen = new FastFoodKitchen();
        
        /**int orderPosition = kitchen.findOrderSeq(3);
        System.out.println("Using sequential search >> order position is "
                   + orderPosition);             
                 */
        kitchen.insertionSort();
        ArrayList<Order> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for (Order order : sortedOrders) {
            orderSize = order.getNumCheeseburgers() + order.getNumHamburgers()
                    + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum()+ " has " + orderSize
                    + " burgers.");
        }
        
        var orderPosition = kitchen.findOrderBin(2);
        System.out.println("Using binary search >> order position is " 
                + orderPosition);
    }
    
}
