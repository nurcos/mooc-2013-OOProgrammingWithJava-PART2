import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Participant implements java.lang.Comparable<Participant>{
    private String name;
    private int points;
    private int lastJumpLength;
    private ArrayList<Integer> jumpLengths;
    private ArrayList<Integer> lastJumpJudge;
    
    public Participant(String name){
        this.name = name;
        this.points = 0;
        this.lastJumpLength = 0;
        this.jumpLengths = new ArrayList<Integer>();
        this.lastJumpJudge = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public int getLastJumpLength(){
        return this.lastJumpLength;
    }
    
    public ArrayList<Integer> getLastJumpJudge(){
        return this.lastJumpJudge;
    }
    
    public String getJumpLengths(){
        String jumps = "";
        for(int jump : this.jumpLengths){
            jumps += jump + " m, ";
        }
        return jumps.substring(0, jumps.length()-2); //return string minus last section from string
        
    }
    
    public void jump(){
        Random random = new Random();
        int jump = random.nextInt(60) + 61;
        this.lastJumpLength = jump;
        this.jumpLengths.add(jump);
        
        ArrayList<Integer> votes = new ArrayList<Integer>();
        this.lastJumpJudge.clear(); //clear the last judge scores so they dont get recorded
        for(int i = 0; i < 5; i++){
            int judgeScore = (random.nextInt(10)+11);
            votes.add(judgeScore);
            this.lastJumpJudge.add(judgeScore);
        }

        Collections.sort(votes);
        votes.remove(4);
        votes.remove(0);
                
        int voteTotal = 0;
        
        for(int vote : votes){
            voteTotal += vote;
        }
        
        
        this.points += this.lastJumpLength + voteTotal;
        
    }
    
    @Override
    public String toString(){
        return name + " (" + this.points + " points)";
    }

    @Override
    public int compareTo(Participant p) {
        return p.getPoints() - this.getPoints();
    }
}
