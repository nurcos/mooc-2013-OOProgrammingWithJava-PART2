package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {
    
    public PersonalBoard(int width, int height){
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random r = new Random();
        
        for(int i = 0; i < super.getWidth(); i++){
            for(int j = 0; j < super.getHeight(); j++){
                if(r.nextDouble() < d){
                    turnToLiving(i,j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        boolean[][] board = super.getBoard();
        if(insideTheBoard(x, y) && board[x][y] == true){
            return true;
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        boolean[][] board = this.getBoard();
        if(insideTheBoard(x, y)){
            board[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        boolean[][] board = this.getBoard();
        if(insideTheBoard(x, y)){
            board[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int amount = 0;
        
            for(int i = x-1; i <= x+1; i++){
                for(int j = y-1; j <= y+1; j++){
                    if(isAlive(i,j)){
                        amount++;
                    }
                }
            }
        
        if(isAlive(x, y)){
            amount--;
        }
        
        return amount;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        
        if(livingNeighbours < 2 || livingNeighbours > 3){
            turnToDead(x,y);
        }
        else if(livingNeighbours == 3){
            turnToLiving(x,y);
        }
    }
    
    
    public boolean insideTheBoard(int x, int y) {
    if (x < 0 || y < 0 || x >= super.getWidth() || y >= super.getHeight()) { 
        return false;
    }
        
    return true;
    }
}
