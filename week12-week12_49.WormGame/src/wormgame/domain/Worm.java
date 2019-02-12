package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import wormgame.Direction;

public class Worm {

    private Direction direction;
    private boolean grow;
    private List<Piece> pieces;
    private int X;
    private int Y;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.X = originalX;
        this.Y = originalY;
        this.direction = originalDirection;
        this.grow = false;
        this.pieces = new ArrayList<Piece>();
        
        this.pieces.add(new Piece(this.X, this.Y));
    }
    
    public Direction getDirection(){
        return this.direction;
    }
    
    public void setDirection(Direction d){
        this.direction = d;
    }
    
    public int getLength(){
        return this.pieces.size();
    }
    
    public List<Piece> getPieces(){
        return this.pieces;
    }
    
    public void move(){
        int newX = pieces.get(pieces.size() - 1).getX();
        int newY = pieces.get(pieces.size() - 1).getY();
        
        if (direction == Direction.UP) {
            newY--;
        } else if (direction == Direction.DOWN) {
            newY++;
        } else if (direction == Direction.LEFT) {
            newX--;
        } else if (direction == Direction.RIGHT) {
            newX++;
        }
        
        if(this.pieces.size() > 2 && !grow){
                this.pieces.remove(0);
        }
        
        if(grow = true){
            grow = false;
        }
        
        this.pieces.add(new Piece(newX, newY));
    }
    
    public void grow(){
        grow = true;
    }
    
    public boolean runsInto(Piece piece){
        for(Piece piece2 : this.pieces){
            if(piece.getX() == piece2.getX() && piece.getY() == piece2.getY()){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean runsIntoItself(){      
        for(int i = 0; i < this.pieces.size(); i++){
            for (int j = i+1; j < this.pieces.size(); j++){
                if(this.pieces.get(i).getX() == this.pieces.get(j).getX() && this.pieces.get(i).getY() == this.pieces.get(j).getY()){
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
