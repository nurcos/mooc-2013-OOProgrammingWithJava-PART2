
public class Bird{

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        
        Bird bird = (Bird) object;
        if(this.latinName == bird.latinName && this.ringingYear == bird.ringingYear){
            return true;
        }
        
        return false;
    }
    
    public int hashCode() {
        if (this.latinName == null) {
            return 7;
        }

        return this.ringingYear + this.latinName.hashCode();
    }
}


