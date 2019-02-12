import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start(){
        System.out.println("Statements: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println();
        String answer = "";
        
        while(!answer.equals("quit")){
            System.out.print("Statement: ");
            answer = reader.nextLine();
            
            if(answer.equals("add")){
                add();
            }
            else if(answer.equals("translate")){
                translate();
            }
            else if(!answer.equals("quit")){
                System.out.println("Unknown Statement");
                System.out.println();
            }
        }
        System.out.println("Cheers!");
    }
    
    public void add(){
        String finnish;
        String translation;
        
        System.out.print("In Finnish: ");
        finnish = reader.nextLine();
        
        System.out.print("Translation: ");
        translation = reader.nextLine();
        System.out.println();
        
        this.dict.add(finnish, translation);
    }
    
    public void translate(){
        String answer;
        String translation;
        
        System.out.print("Give a word: ");
        answer = reader.nextLine();
        translation = dict.translate(answer);
        
        System.out.print("Translation: ");
        System.out.println(translation);
        System.out.println();
        
    }
}
