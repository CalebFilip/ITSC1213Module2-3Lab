
/**
 *
 * @author filip
 */
public class Order {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;
    
    public Order(int Ham, int Cheese, int Veg, int Soda, boolean toGo, int num){
        numHamburgers = Ham;
        numCheeseburgers = Cheese;
        numVeggieburgers = Veg;
        numSodas = Soda;
        orderToGo = toGo;
        orderNum = num;  
    }
    
    
    
    
    public int getNumHamburgers(){
        return numHamburgers;
    }

    public void setNumHamburgers(int amount){
        if (amount < 0){
            System.out.println("Error. Cannot Accept Negative Amount.");
        }
        else{
           numHamburgers = amount; 
        }
    }
    
    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }

    public void setNumCheeseburgers(int amount){
        if (amount < 0){
            System.out.println("Error. Cannot Accept Negative Amount.");
        }
        else{
           numCheeseburgers = amount;
        }
    }
    
    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }

    public void setNumVeggieburgers(int amount){
        if (amount < 0){
            System.out.println("Error. Cannot Accept Negative Amount.");
        }
        else{
           numVeggieburgers = amount; 
        }
    }
    
    public int getNumSodas(){
        return numSodas;
    }

    public void setNumSodas(int amount){
        if (amount < 0){
            System.out.println("Error. Cannot Accept Negative Amount.");
        }
        else{
           numSodas = amount; 
        }
    }
        
    public boolean isOrderToGo(){
        return orderToGo;
    }
        
    public void setOrderToGo(boolean toGo){
        orderToGo = toGo;
    }
    
    public int getOrderNum(){
        return orderNum;
    }
        
    public void setOrderNum(int numberOfOrder){
        orderNum = numberOfOrder;
    }
    
}
