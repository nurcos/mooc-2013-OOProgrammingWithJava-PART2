package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(this.width/2, this.height/2, Direction.DOWN);
        this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
        
        while (worm.runsInto(apple)) {
            this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
        }

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        this.worm.move();
        
        if (worm.runsInto(apple)) {
            worm.grow();
            while (worm.runsInto(apple)) {
                setApple(new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height)));
            }
        }
        
        for(Piece piece : this.worm.getPieces()){
            if(piece.getX() > width-1 || piece.getY() > height-1 || piece.getX() < 0+1 || piece.getY() < 0+1){
                this.continues = false;
            }
        }
        
        if(this.worm.runsIntoItself()){
            this.continues = false;
        }
        
        updatable.update();
        setDelay(1000 / this.worm.getLength());

    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }

}
