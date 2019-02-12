public class Plane {
    private String name;
    private int capacity;
    
    public Plane(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    public String getPlaneName(){
        return this.name;
    }
    
    public int getPlaneCapcity(){
        return this.capacity;
    }
    
    public String toString(){
        return this.name + " ("+ this.capacity + " ppl)";
    }
}
