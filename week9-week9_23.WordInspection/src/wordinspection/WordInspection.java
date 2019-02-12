package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection{
    private File file;
    private Scanner reader;
    
    public WordInspection(File file) throws FileNotFoundException{
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        reader = new Scanner(file, "UTF-8");
        int wordCount = 0;
        while(reader.hasNextLine()){
            wordCount++;
            reader.nextLine();
        }
        return wordCount;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.contains("z")){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.endsWith("l")){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            
            String wordBack = "";
            for(int i = word.length()-1; i >= 0; i--){
                wordBack += word.charAt(i);
            }
            
            if(word.equals(wordBack)){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String[] vowels = {"a" , "e" , "i" , "o" , "u" , "y" , "ä" , "ö"};
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            
            int i;
            for(i = 1; i <= vowels.length; i++){
                
                if(!word.contains(vowels[i-1])){
                    break;
                }
                if(i == vowels.length){ //check if word has been parsed for all vowels
                    list.add(word);
                }
                
            }
                
        }
        return list;
    }
}
