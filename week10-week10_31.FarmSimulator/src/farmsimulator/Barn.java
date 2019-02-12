package farmsimulator;

import java.util.Collection;
import java.util.LinkedList;

public class Barn {
    private MilkingRobot milkingRobot;
    private BulkTank bk;
    
    public Barn(BulkTank bulktank){
        this.bk = bulktank;
    }
    
    public BulkTank getBulkTank(){
        return this.bk;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(this.bk);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Milking robot not installed");
        }
        this.milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Milking robot not installed.");
        }
        for(Cow cow : cows){
            this.milkingRobot.milk(cow);
        }
    }
    
    public String toString(){
        return this.bk.toString();
    }

}
