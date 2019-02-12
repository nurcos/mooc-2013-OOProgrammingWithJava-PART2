package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure figure;
    
    public KeyboardListener(Component c, Figure f){
        this.component = c;
        this.figure = f;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            figure.move(-1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            figure.move(1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            figure.move(0, -1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            figure.move(0 , 1);
        }
        
        component.repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
