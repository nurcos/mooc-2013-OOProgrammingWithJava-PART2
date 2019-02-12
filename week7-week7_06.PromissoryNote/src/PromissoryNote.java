import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> map;
    
    public PromissoryNote(){
        map = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        this.map.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.map.containsKey(whose)){
            return this.map.get(whose);
        }
        return 0;
    }
}
