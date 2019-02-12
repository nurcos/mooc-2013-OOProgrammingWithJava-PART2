package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        

        File file = new File("src/testfile.txt");
        Analysis tester = new Analysis(file);
        System.out.println(tester.lines());
        
        System.out.println(tester.characters());
    }
}
