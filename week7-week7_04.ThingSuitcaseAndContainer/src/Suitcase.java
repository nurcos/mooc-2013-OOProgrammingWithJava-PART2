import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private final int MAX_WEIGHT;
    
    public Suitcase(int maxWeight){
        this.things = new ArrayList<Thing>();
        this.MAX_WEIGHT = maxWeight;
    }
    
    public void addThing(Thing thing){
        if(this.totalWeight() + thing.getWeight() <= this.MAX_WEIGHT){
            things.add(thing);
        }
    }
    
    public String toString(){
        int amountOfThings = 0;
        int totalWeight = 0;
        
        for(Thing thing : this.things){
            amountOfThings++;
            totalWeight += thing.getWeight();
        }
        
        if(amountOfThings == 0){
            return amountOfThings + " empty (" + totalWeight + " kg)";
        }
        else if(amountOfThings == 1){
            return amountOfThings + " thing (" + totalWeight + " kg)";
        }
        else{
            return amountOfThings + " things (" + totalWeight + " kg)";
        }
    }
    
    public void printThings(){
        for(Thing thing : this.things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Thing thing : this.things){
            totalWeight += thing.getWeight();
        }
        
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if(this.things.isEmpty()){
            return null;
        }
        
        Thing heaviestThing = this.things.get(0);
        for(Thing thing : this.things){
            if(thing.getWeight() > heaviestThing.getWeight()){
                heaviestThing = thing;
            }
        }
        
        return heaviestThing;
    }
}
