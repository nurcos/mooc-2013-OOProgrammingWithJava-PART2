package dungeon;

import java.util.Random;

public class Vampire {
    private int x;
    private int y;
    private int length;
    private int height;
    
    public Vampire(int length, int height){
        this.length = length;
        this.height = height;
        
        while(this.x == 0 && this.y == 0){
            this.x = new Random().nextInt(this.length);
            this.y = new Random().nextInt(this.height);
        }
    }

    public void move() {
        int move = new Random().nextInt(3);
        
        if(move == 0){
            this.x += 1;
        }
        else if(move == 1){
            this.x -= 1;
        }
        else if(move == 2){
            this.y += 1;
        }
        else if(move == 3){
            this.y -= 1;
        }
        
        if(this.getX() < 0){
                this.setX(0);
            }
            else if(this.getX() > this.length-1){
                this.setX(this.length-1);
            }
            else if(this.getY() < 0){
                this.setY(0);
            }
            else if(this.getY() > this.length-1){
                this.setY(this.length-1);
            }
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public boolean isInPositionOf(Vampire vampire){
        if(this.x == vampire.getX() && this.y == vampire.getY()){
            return true;
        }
        return false;
    }
    
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "v " + this.x + " " + this.y;
    }
    
    
}
