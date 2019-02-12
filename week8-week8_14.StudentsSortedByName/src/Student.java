public class Student implements java.lang.Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student student){
        if(student.getName().compareToIgnoreCase(this.getName()) == 0){
            return 0;
        }
        else if(student.getName().compareToIgnoreCase(this.getName()) > 0){
            return -1;
        }
        else{
            return 1;
        }
    }

}
