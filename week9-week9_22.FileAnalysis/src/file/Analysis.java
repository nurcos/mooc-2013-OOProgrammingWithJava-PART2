package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private File file;    
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int lines = 0;
        
        while(reader.hasNextLine()){
            lines++;
            reader.nextLine();
        }
        reader.close();
        return lines;
    }
    
    public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int characters = 0;
        String line = "";
        
        while(reader.hasNext()){
            line += reader.nextLine();
            line += "\n";
        }
        
        
        
        for (int i = 0; i < line.length(); i++){
                characters++;
        }
        
        reader.close();
        return characters;
    }
    
}
