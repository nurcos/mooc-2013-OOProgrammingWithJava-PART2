package moving.domain;

import java.util.ArrayList;

public class Box implements Thing{
    private int maximumCapacity;
    private ArrayList<Thing> contents;
    
    public Box (int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.contents = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if (thing.getVolume() + this.getVolume() <= this.maximumCapacity){
            contents.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : contents){
            volume += thing.getVolume();
        }
        return volume;
    }
}
