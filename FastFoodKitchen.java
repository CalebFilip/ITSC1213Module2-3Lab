import java.util.ArrayList;


public class FastFoodKitchen {
    
    private ArrayList<Order> orderList = new ArrayList<>();
    private static int nextOrderNum = 1;
    
    public FastFoodKitchen(){
    Order order1 = new Order(3, 5, 4, 10, true, nextOrderNum);
    incrementNextOrderNum();
    orderList.add(order1);
    Order order2 = new Order(0, 0, 3, 3, false, nextOrderNum);
    incrementNextOrderNum();
    orderList.add(order2);
    Order order3 = new Order(1, 1, 0, 2, false, nextOrderNum);
    incrementNextOrderNum();
    orderList.add(order3);
    } 
    
    
    public static int getNextOrderNum(){
        return nextOrderNum;
    }
    
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
       Order newOrder = new Order(ham, cheese, veggie, soda, toGo, getNextOrderNum());
       orderList.add(newOrder);
       incrementNextOrderNum();
       return newOrder.getOrderNum();
    }
   
    public boolean cancelLastOrder(){
        if (nextOrderNum < 1){
            orderList.remove(orderList.size() - 1);
        
            nextOrderNum--;          
        
            return true;
        }
        else{
            return false;}
    }
    
    public int getNumOrdersPending(){
        return orderList.size();
    }
    
    public boolean isOrderDone(int orderID){
        for (Order order : orderList){
            if (order.getOrderNum() == orderID){
                return false;
            }
        
        }
        return false;
    }
    
    public boolean cancelOrder(int orderID){
        for (Order order : orderList){
            if (order.getOrderNum() == orderID){
                orderList.remove(order);
                return true;
            }
        }
        return false;
    }
    
    public int findOrderSeq(int orderID){
       for (int j = 0; j < orderList.size(); j++){
            if (orderList.get(j).getOrderNum() == orderID){
                return j;  
            }
        }            
        return -1;
    }
    
    public ArrayList<Order> getOrderList(){
        return orderList;
    }
    public void selectionSort() {
    int n = orderList.size();

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
      
        int orderSize = orderList.get(i).getNumHamburgers()
                + orderList.get(i).getNumCheeseburgers()
                + orderList.get(i).getNumVeggieburgers();
        
        for (int j = i + 1; j < n; j++) {            
            int nextTotalBurgers = orderList.get(j).getNumHamburgers()
                    + orderList.get(j).getNumCheeseburgers()
                    + orderList.get(j).getNumVeggieburgers();    
            if (nextTotalBurgers < orderSize) {
                minIndex = j;
                orderSize = nextTotalBurgers;
            }
        }
        Order temp = orderList.get(i);
        orderList.set(i, orderList.get(minIndex));
        orderList.set(minIndex, temp);
    }
}

    public void insertionSort() {
            int n = orderList.size();

            for (int i = 1; i < n; i++) {
                Order currentOrder = orderList.get(i);
                int j = i - 1;

                while (j >= 0 && currentOrder.getOrderNum() < orderList.get(j).getOrderNum()) {
                    orderList.set(j + 1, orderList.get(j));
                    j--;
                }

                orderList.set(j + 1, currentOrder);
            }
        }
    
    public int findOrderBin(int orderID) {
    int left = 0;
    int right = orderList.size() - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        int midOrderID = orderList.get(mid).getOrderNum();

        if (midOrderID == orderID) {
            return mid;
        } else if (midOrderID < orderID) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1; 
}


}



