package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
    private String owner;
    private List<Cow> cows;
    private Barn barn;

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.cows = new ArrayList<Cow>();
        this.barn = barn;
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : this.cows){
            cow.liveHour();
        }
    }
    
    public void addCow(Cow cow){
        cows.add(cow);
    }
    
    public void manageCows(){
        for (Cow cow : this.cows){
            barn.takeCareOf(cow);
        }
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
    
    
    @Override
    public String toString(){
        String farm = "Farm owner: " + this.owner + "\nBarn bulk tank: " + this.barn.getBulkTank().toString() + "\n";
        
        if(cows.isEmpty()){
            farm += "No cows.";
        }
        else{
            farm += "Animals: \n";
            for(Cow cow : this.cows){
                farm += "        " + cow.toString() + "\n";
            }
        }
        
        return farm;
    }
}
