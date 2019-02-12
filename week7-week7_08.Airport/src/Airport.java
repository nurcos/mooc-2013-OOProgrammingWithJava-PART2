import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Airport {
    private ArrayList<Plane> planes;
    private ArrayList<String> flights;
    
    public Airport(){
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<String>();
    }
    
    public void addPlane(String planeName, int planeCapacity){
        Plane plane = new Plane(planeName, planeCapacity);
        planes.add(plane);
    }
    
    public void addFlight(String planeName, String departure, String destination){
        
        for(Plane plane : this.planes){
            if(plane.getPlaneName().equals(planeName)){
                flights.add(plane + " (" + departure + "-" + destination + ")");
            }
        }
    }
    
    public void printPlanes(){
        for(Plane plane : this.planes){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        Collections.sort(this.flights);
        for(String flight : this.flights){
            System.out.println(flight);
        }
    }
    
    public void printInfo(String search){
        for(Plane plane : this.planes){
            if(search.equals(plane.getPlaneName())){
                System.out.println(plane);
            }
        }
    }
    
}
