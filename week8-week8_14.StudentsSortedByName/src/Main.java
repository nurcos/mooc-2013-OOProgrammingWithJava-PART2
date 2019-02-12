import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        Student first = new Student("bbb");
        Student second = new Student("aaa");
        Student third = new Student("ccc");
        Student fourth = new Student("aaa");
        System.out.println(first.compareTo(second));
        System.out.println(second.compareTo(third));
        System.out.println(first.compareTo(third));
        
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
    }
}
