package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> words;
    
    public PersonalMultipleEntryDictionary(){
        this.words = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!this.words.containsKey(word)){
            this.words.put(word, new HashSet<String>());
        }
        
         words.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        
        if(words.containsKey(word)){
            return this.words.get(word);
        }
        
        return null;
    }

    @Override
    public void remove(String word) {
        words.remove(word);
    }
    
}
