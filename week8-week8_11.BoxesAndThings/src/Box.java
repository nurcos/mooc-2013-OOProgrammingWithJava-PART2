import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored thing){
        if(this.weight() + thing.weight() < this.maxWeight)
            this.things.add(thing);
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored thing : this.things){
            weight += thing.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";
    }
}
