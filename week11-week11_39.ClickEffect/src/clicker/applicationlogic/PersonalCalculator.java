package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {
    private int sum;
    
    public PersonalCalculator(){
        this.sum = 0;
    }

    @Override
    public int giveValue() {
        return sum;
    }

    @Override
    public void increase() {
        sum++;
    }
    
}
