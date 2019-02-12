import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private File file;
    
    public Printer(String fileName) throws FileNotFoundException{
        this.file = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        
        Scanner reader = new Scanner(this.file);
        if(word.equals("")){
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        else{
            while(reader.hasNext()){
                String line = reader.nextLine();
                if(line.contains(word)){
                    System.out.println(line);
                }
            }
        }

        
        //Scanner reader = new Scanner(this.file);
        //while(reader.hasNext()){
        //    String line = reader.nextLine();
        //    if(word.equals("")){
        //        System.out.println(line);
        //    }
        //}
        
        //reader = new Scanner(this.file);
        //while(reader.hasNext()){
        //    String line = reader.nextLine();
        //    if(line.contains(word)){
        //        System.out.println(line);
        //    }
        //}
    }
    
    
}
