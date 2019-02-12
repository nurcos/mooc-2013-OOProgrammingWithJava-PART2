import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UserInterface {
    private Scanner reader;
    private ArrayList<Participant> participants;
    private int roundNumber;
    
    public UserInterface(){
        reader = new Scanner(System.in);
        participants = new ArrayList<Participant>();
        roundNumber = 1;
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String answer = " ";
            
        while(true){
            System.out.print("  Participant name: ");
            answer = reader.nextLine();
            if(answer.equals("")){
                break;
            }
            participants.add(new Participant(answer));
        }
        
        System.out.println();
        System.out.println("The tournament begins!");
        
        System.out.println();
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            answer = reader.nextLine();
            if(!answer.equals("jump")){
                break;
            }
            printRoundResults();
        }
        
        System.out.println();
        System.out.println("Thanks!");
        
        printFinalResults();
    }
    
    public void printRoundResults(){
        System.out.println();
        System.out.println("Round " + roundNumber);
                        
            printJumpOrder();
            
            System.out.println("Results of round " + roundNumber);
            
            for(Participant p : participants){
                p.jump();
                System.out.println("  " +  p.getName());
                System.out.println("    length: " + p.getLastJumpLength());
                System.out.println("    judge votes: " + p.getLastJumpJudge());
            }
            roundNumber++;
            System.out.println();
    }
    
    public void printJumpOrder(){
        Collections.sort(participants);
        Collections.reverse(participants);
        System.out.println();
        System.out.println("Jumping order:");
        int i = 1;
        for(Participant p : participants){
            System.out.print("  " + i + ". ");
            i++;
            System.out.println(p.toString());
        }
        System.out.println();
        
    }
    
    public void printFinalResults(){
        Collections.sort(participants);
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        
        int position = 1;
        for(Participant p : participants){
            System.out.print(position);
            position++;
            System.out.println("           " + p.toString());
            System.out.println("            jump lengths: " + p.getJumpLengths());
        }
        
        System.out.println();
        
    }
    
}
