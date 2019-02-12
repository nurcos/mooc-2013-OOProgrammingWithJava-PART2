import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> translations;
    
    public Dictionary(){
        this.translations = new HashMap<String, String>();
    }
    
    public String translate(String word){
        return this.translations.get(word);
    }
    
    public void add(String word, String translation){
        this.translations.put(word, translation);
    }
    
    public int amountOfWords(){
        int amountOfWords = 0;
        
        for(String word : this.translations.keySet()){
            amountOfWords++;
        }
        
        return amountOfWords;
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for (String key : translations.keySet()){
            list.add(key + " = " + translations.get(key));
        }
        return list;
    }
}
