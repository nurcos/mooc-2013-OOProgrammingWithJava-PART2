
import java.util.HashSet;
import java.util.Set;

public class Number {
    private Set<String> phoneList;
    
    public Number(){
        this.phoneList = new HashSet<String>();
    }
    
    public Set<String> getphoneList(){
        return this.phoneList;
    }
    
    public void addNumber(String number){
        this.phoneList.add(number);
    }
    
    
}
