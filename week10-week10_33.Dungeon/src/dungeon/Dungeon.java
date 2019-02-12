package dungeon;

import java.util.*;

public class Dungeon {
    private int length;
    private int height;
    private int vampiresAmount;
    private int moves;
    private boolean vampiresMove;
    private List<Vampire> vampires;
    private Player player;
    private Scanner keyboard;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampiresAmount = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.vampires = new ArrayList<Vampire>();
        this.player = new Player(this.height, this.length);
        this.keyboard =  new Scanner(System.in);
        
        
        for(int i = 0; i < vampires; i++){
            Vampire vampire = new Vampire(this.length, this.height);
            this.vampires.add(vampire);
        }
    }
    
    public void run(){
        while(moves > 0 && vampiresAmount > 0){
            printDungeon();
            allMove();
        }
        
        
        if(vampiresAmount <= 0){
            System.out.println("YOU WIN");
        }
        else{
            System.out.println("YOU LOSE");
            
        }
    }
    
    void printMoves(){
        System.out.println(this.moves);
        System.out.println();
    }
    
    public void printPositions(){
        System.out.println(player);
        for(Vampire vampire : this.vampires){
            System.out.println(vampire);
        }
        System.out.println();
    }
    
    void printDungeon(){
        printMoves();
        printPositions();
        for(int i = 0; i < this.height; i++){
            for (int j = 0; j < this.length; j++){
                outerLoop:
                while (true) {
                    if(j == player.getX() && i == player.getY()){
                        System.out.print("@");
                        break;
                    }
                    for (Vampire vampire : this.vampires) {
                        if (j == vampire.getX() && i == vampire.getY()) {
                            System.out.print("v");
                            break outerLoop;
                        }
                    }
                        System.out.print(".");
                        break;
                }
            }
        
            
            System.out.println();
        } 
        
    }
    
    void allMove(){
        String entry = keyboard.nextLine();
        for(int i = 0; i < entry.length(); i++){
            String move = "";
            move += entry.charAt(i);
            move = move.toLowerCase();
            playerMoves(move);
            vampiresMove();
        }
        this.moves--;
        
    }
    
    void playerMoves(String move){
        player.move(move);
        checkOverlap();
    }
    
    void vampiresMove(){
        
        if(vampiresMove == false){
            return;
        }
        
        List<Vampire> backupVampires = new ArrayList<Vampire>(this.vampires);
        
        for(Vampire vampire : this.vampires){
            vampire.move();
            for(Vampire compared : this.vampires){
                while(vampire.getX()== compared.getX() && vampire.getY() == compared.getY()){
                    this.vampires = backupVampires;
                    break;
                }
            }
        }
        checkOverlap();
    }
    
    void checkOverlap(){
        List<Vampire> toBeRemoved = new ArrayList<Vampire>();
        
        for(Vampire vampire : vampires){
            if(player.getX() == vampire.getX() && player.getY() == vampire.getY()){
                toBeRemoved.add(vampire);
                vampiresAmount --;
            }
        }
        vampires.removeAll(toBeRemoved);
    }
    
}
