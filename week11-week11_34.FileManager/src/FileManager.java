
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        while(reader.hasNextLine()){
            list.add(reader.nextLine());
        }
        
        reader.close();
        
        return list;
    }

    public void save(String file, String text) throws IOException {
        File currentFile = new File(file);
        FileWriter writer = new FileWriter(currentFile);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        File currentFile = new File(file);
        FileWriter writer = new FileWriter(currentFile);
        for(String text : texts){
            writer.write(text + "\n");
        }
        writer.close();
    }
}
