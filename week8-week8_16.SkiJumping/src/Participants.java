import java.util.ArrayList;

public class Participants {
    private ArrayList<Participant> list;
    
    public Participants(){
        this.list = new ArrayList<Participant>();
    }
    
    public void add(Participant p){
        this.list.add(p);
    }
    
}
