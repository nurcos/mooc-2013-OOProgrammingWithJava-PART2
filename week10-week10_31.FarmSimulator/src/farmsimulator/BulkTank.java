package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this();
        this.capacity = capacity;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - volume;
    }
    
    public void addToTank(double amount){
        if(amount < 0){
            return;
        }
        if(this.volume + amount <= this.capacity){
            this.volume += amount;
        }
        else if(this.volume + amount > this.capacity){
            this.volume = this.capacity;
        }
    }
    
    public double getFromTank(double amount){
        if(amount < 0){
            return 0;
        }
        
        this.volume -= amount;
        
        if(this.volume < 0){
            this.volume = 0;
        }
            
        return amount;
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
