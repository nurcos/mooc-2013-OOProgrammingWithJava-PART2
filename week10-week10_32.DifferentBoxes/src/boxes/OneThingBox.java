package boxes;

import java.util.*;

public class OneThingBox extends Box {
    private List<Thing> box;
    
    public OneThingBox(){
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(box.isEmpty()){
            box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing thingInBox : box){
            if (thingInBox.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
}
