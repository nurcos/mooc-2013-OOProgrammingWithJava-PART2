package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        if(name == null || name.isEmpty() || name.length() > 40 || age < 0 || age > 120){
            throw new IllegalArgumentException("The name cannot be empty or more than 40 characters long.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
