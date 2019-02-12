package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> list;
    
    public Group(){
        list = new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable movable : list){
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String string = "";
        for(Movable movable : list){
            string += movable.toString() + "\n";
        }
        return string;
    }
    
    public void addToGroup(Movable movable){
        list.add(movable);
    }
    
}
