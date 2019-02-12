package farmsimulator;

public class MilkingRobot {
    private BulkTank bk;
       
    public BulkTank getBulkTank() {
        return this.bk;
    }
    
    public void setBulkTank(BulkTank tank){
        this.bk = tank;
    }
    
    public void milk(Milkable milkable){
        if (this.bk == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        this.bk.addToTank(milkable.milk());
        
    }
    
    
}
