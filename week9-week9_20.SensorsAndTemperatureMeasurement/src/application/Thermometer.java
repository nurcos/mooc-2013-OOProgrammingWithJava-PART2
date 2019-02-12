package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn;
    
    public Thermometer(){
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        if(this.isOn == true){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (isOn()){
            Random random = new Random();
            int number = random.nextInt(60)-30;
            return number;
        }
        else{
            throw new IllegalStateException ("Thermometer is off");
        }
    }
    
}
