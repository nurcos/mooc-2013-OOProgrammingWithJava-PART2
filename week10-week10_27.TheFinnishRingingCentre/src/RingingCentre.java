
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> map;
    
    public RingingCentre(){
        map = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(map.containsKey(bird)){
            List<String> list = map.get(bird);
            list.add(place);
        }
        else{
            List<String> list = new ArrayList<String>();
            list.add(place);
            map.put(bird, list);
        }
    }
    
    public void observations(Bird bird){
        
        if(!map.containsKey(bird)){
            System.out.println(bird.toString() + " observations: 0");
            return;
        }
        
        List<String> list = map.get(bird);
        int size = list.size();
        System.out.println(bird.toString() + " observations: " + size);
        for(String place : list){
            System.out.println(place);
        }
    }
    
}
