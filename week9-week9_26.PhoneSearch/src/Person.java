
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person implements Comparable<Person> {
    private String name;
    private Map<String, Number> nameToNumber;
    private Map<String, String> numberToName;
    private Map<String, Address> nameToAddress;
    
    public Person(String name, String number){
        this.name = name;
        this.nameToNumber = new HashMap<String, Number>();
        this.numberToName = new HashMap<String, String>();
        this.nameToAddress = new HashMap<String, Address>();
        
        this.nameToNumber.put(name, new Number());
        this.nameToNumber.get(name).addNumber(number);
        this.numberToName.put(number, name);
    }
    
    public Person(String name, String street, String city){
        this.name = name;
        this.nameToNumber = new HashMap<String, Number>();
        this.numberToName = new HashMap<String, String>();
        this.nameToAddress = new HashMap<String, Address>();
        
        this.nameToNumber.put(name, new Number());
        this.nameToAddress.put(name, new Address(street, city));
    }

    public void addNumber(String number){
        if (this.nameToNumber.get(this.name) != null) {
            this.nameToNumber.get(this.name).addNumber(number);
        } else {
            this.nameToNumber.put(this.name, new Number());
            this.nameToNumber.get(this.name).addNumber(number);
        }
        
        this.numberToName.put(number, this.name);
    }

    public Set<String> getNumbers() {
        return this.nameToNumber.get(this.name).getphoneList();
    }
    
    public String getName(){
        return this.name;
    }

    boolean searchNameByNumberIsTrue(String name) {
        if (this.numberToName.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nameIs(String name) {
        if (this.name.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchNumberByNameIsTrue(String name) {
        if (this.nameToNumber.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

    public void addAddress(Address address) {
        this.nameToAddress.put(this.name, address);
    }

    public Address getAddress() {
        if(this.nameToAddress.get(this.name) == null){
            return new Address();
        }
        else{
            return this.nameToAddress.get(this.name);
        }
    }

    public boolean containsKeyword(String keyword) {
        if(this.name.contains(keyword) || this.getAddress().toString().contains(keyword)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareToIgnoreCase(o.getName());
    }
}
