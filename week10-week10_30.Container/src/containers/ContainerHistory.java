package containers;

import java.util.ArrayList;

public class ContainerHistory{
    private ArrayList<Double> list;
    
    public ContainerHistory(){
        list = new ArrayList<Double>();
    }
    
    public void add(double situation){
        list.add(situation);
    }
    
    public void reset(){
        list.clear();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public double maxValue(){
        double largest = 0;
        for(double number : list){
            if(number > largest){
                largest = number;
            }
        }
        return largest;
    }
    
    public double minValue(){
        if(list.isEmpty()){
            return 0;
        }
        double smallest = list.get(0);
        for(double number : list){
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    
    public double average(){
        double sum = 0;
        double amount = 0;
        
        for(double number : list){
            sum += number;
            amount++;
        }
        
        return sum / amount;
    }
    
    public double greatestFluctuation(){
        if(list.size() < 2){
            return 0;
        }
        
        double largest = list.get(0) - list.get(1);
        
        for(int i = 0; i < list.size()-1; i++){
            double change = list.get(i) - list.get(i+1);
            
            if(largest < 0){
                largest = largest * -1;
            }
            if(change < 0){
                change = change * -1;
            }
            
            if(largest < change){
                largest = change;
            }
        }
        
        return largest;
    }
    
    public double variance(){
        double squaredNumber = 0;
        double variance = 0;
        double amount = 0;
        for(double number : list){
            amount++;
            squaredNumber = number - average();
            squaredNumber *= squaredNumber;
            variance += squaredNumber;
        }
        
        variance /= amount - 1;
        
        return variance;
    }
}
