import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> list;
    
    public Changer(){
        this.list = new ArrayList<Change>();
    }   
    
    public void addChange(Change change){
        list.add(change);
    }
    
    public String change (String characterString){
        String word = characterString;
        
        for(Change each : list){
            word = each.change(word);
        }
        return word;
    }
}
