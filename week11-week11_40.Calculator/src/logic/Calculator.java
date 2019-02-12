package logic;

public class Calculator {
    private int total;
    
    public Calculator(){
        this.total = 0;
    }
    
    public void plus(int amount){
        total += amount;
    }
    
    public void subtract(int amount){
        total -= amount;
    }
    
    public void reset(){
        this.total = 0;
    }
    
    public int getTotal(){
        return total;
    }
}
