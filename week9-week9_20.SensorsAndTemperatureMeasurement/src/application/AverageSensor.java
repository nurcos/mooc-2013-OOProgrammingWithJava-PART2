package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : this.sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : this.sensors){
            if(!sensor.isOn()){
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : this.sensors){
            if(sensor.isOn()){
                sensor.off();
            }
        }
    }

    @Override
    public int measure() {
        int measurement = 0;
        int howMany = 0;
        for(Sensor sensor : this.sensors){
            if(sensor.isOn()){
                measurement += sensor.measure();
                howMany++;
            }
            else{
                throw new IllegalStateException ("one of the sensors were off");
            }
        }
        int averageMeasurement = measurement / howMany;
        this.readings.add(averageMeasurement);
        return averageMeasurement;
    }
    
}
