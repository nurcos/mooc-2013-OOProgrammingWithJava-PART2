import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private final int MAX_WEIGHT;
    private int amountOfSuitcases;
    private int totalWeight;
    
    public Container(int maxWeight){
        this.suitcases = new ArrayList<Suitcase>();
        this.MAX_WEIGHT = maxWeight;
        this.amountOfSuitcases = 0;
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalWeight <= this.MAX_WEIGHT){
        suitcases.add(suitcase);
        amountOfSuitcases++;
        this.totalWeight += suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return this.amountOfSuitcases + " suitcases (" + this.totalWeight + " kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }
}
