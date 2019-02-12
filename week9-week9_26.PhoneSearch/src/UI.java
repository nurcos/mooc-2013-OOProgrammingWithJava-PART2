import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UI {
    private Scanner reader;
    private List<Person> phonebook;
    
    public UI(){
        this.reader = new Scanner(System.in);
        this.phonebook = new ArrayList<Person>();
    }
    
    public void start(){
        
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println("1 add a number");
        System.out.println("2 search for a number");
        System.out.println("3 search for a person by phone number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal information");
        System.out.println("6 delete personal information");
        System.out.println("7 filtered listing");
        System.out.println("x quit");
        System.out.println();
        
        String command = "0";
        
        while(!command.equals("x")){
            System.out.print("command: ");
            command = reader.nextLine();
            
            if(command.equals("1")){
                addNumber();
            }
            else if(command.equals("2")){
                searchNumberByName();
            }
            else if(command.equals("3")){
                searchNameByNumber();
            }
            else if(command.equals("4")){
                addAddress();
            }
            else if(command.equals("5")){
                searchPersonalInfo();
            }
            else if(command.equals("6")){
                deletePersonalInfo();
            }
            else if(command.equals("7")){
                filteredListing();
            }
            System.out.println();
        }
        
    }
    
    public void addNumber() { //1
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameIs(name)) {
                person.addNumber(number);
                return;
            }
        }

        this.phonebook.add(new Person(name, number));
    }
    
    public void searchNumberByName() { //2
        System.out.print("whose number: ");
        String name = reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.searchNumberByNameIsTrue(name)) {
                for (String number : person.getNumbers()) {
                    System.out.println(" " + number);
                }
                return;
            }
        }

        System.out.println("  not found");
    }
    
    public void searchNameByNumber(){ //3
        System.out.print("number: ");
        String number = reader.nextLine();
        
        for(Person person : this.phonebook){
            if(person.getNumbers().contains(number)){
                System.out.println(person.getName());
                return;
            }
        }
        System.out.println("  not found");
    }
    
    public void addAddress(){ //4
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        
        for(Person person : this.phonebook){
            if(person.nameIs(name)){
                person.addAddress(new Address(street, city));
                return;
            }
        }
        this.phonebook.add(new Person(name, street, city));
        
    }
    
    public void searchPersonalInfo(){ //5
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        for(Person person : this.phonebook){
            if(person.nameIs(name)){
                System.out.println("  " + person.getAddress());
                System.out.println("  phone numbers: ");
                if(!person.getNumbers().isEmpty()){
                    for(String number : person.getNumbers()){
                        System.out.println("   " + number);
                    }
                }
                else if(person.getNumbers().isEmpty()){
                    System.out.println("    phone number not found");
                }
                return;
            }
        }
        System.out.println("  not found");
    }
    
    public void deletePersonalInfo(){ //6
        System.out.print("whose information: ");
        String name = reader.nextLine();
        
        for(Person person : this.phonebook){
            if(person.nameIs(name)){
                this.phonebook.remove(person);
                break;
            }
        }
    }
    
    public void filteredListing(){ //7
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        Collections.sort(this.phonebook);
        boolean isInList = false;
        
        for(Person person : this.phonebook){
            if(person.containsKeyword(keyword)){
                System.out.println();
                System.out.println("  " + person.getName());
                System.out.println("    " + person.getAddress());
                System.out.println("    phone numbers: ");
                for(String number : person.getNumbers()){
                    System.out.println("      " + number);
                }
                isInList = true;
            }
        }
        if(!isInList){
            System.out.println("    keyword not found");
        }
        
        
        //filteredSearch3
    }
}
