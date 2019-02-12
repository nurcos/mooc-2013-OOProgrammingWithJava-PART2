package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection w = new WordInspection(file);
        
        System.out.println(w.wordCount());
        
        System.out.println(w.wordsContainingZ());
        
        System.out.println(w.wordsEndingInL());
        
        System.out.println(w.palindromes());
        
        System.out.println(w.wordsWhichContainAllVowels());

    }
}
