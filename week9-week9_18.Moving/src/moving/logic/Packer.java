package moving.logic;

import java.util.*;
import moving.domain.*;

public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> list = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);
        list.add(box);
        
        for(Thing thing : things){
            if(box.addThing(thing) == false){
                box = new Box(this.boxesVolume);
                box.addThing(thing);
                list.add(box);
            }
        }

        return list;
    }
}
