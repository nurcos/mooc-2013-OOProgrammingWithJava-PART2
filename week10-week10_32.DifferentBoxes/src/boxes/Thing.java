package boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        this.weight = weight;
        if(this.weight < 0){
            throw new IllegalArgumentException("The weight cannot be below 0");
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public int hashCode(){
        return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        Thing thing = (Thing)obj;
        if (this.name == thing.name) {
            return true;
        }
        if (thing == null) {
            return false;
        }
        if (getClass() != thing.getClass()) {
            return false;
        }
        return false;
    }

}
