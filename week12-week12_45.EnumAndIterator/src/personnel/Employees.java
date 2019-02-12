package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> people;
    
    public Employees(){
        this.people = new ArrayList<Person>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public void add(List<Person> persons){
        for(Person newPerson : persons){
            this.people.add(newPerson);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
