package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };
    private double capacity;
    private double amount;
    private String name;
    
    public Cow(){
        this.capacity = new Random().nextInt(26) + 15;
        this.name = NAMES[new Random().nextInt(NAMES.length)];
    }
    
    public Cow(String name){
        this();
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    @Override
    public String toString(){
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.capacity);
    }

    @Override
    public double milk() {
        double milk = this.amount;
        this.amount = 0;
        return milk;
    }

    @Override
    public void liveHour() {
        this.amount += (new Random().nextInt(13) + 8) * 0.1;
        
        if (this.amount > this.capacity) {
            this.amount = this.capacity;
        }
    }
}
