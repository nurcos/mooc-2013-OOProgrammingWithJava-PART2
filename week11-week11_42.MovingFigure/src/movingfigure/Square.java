package movingfigure;

import java.awt.Graphics;

public class Square extends Figure {

    private int diameter;

    public Square(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(x, y, diameter, diameter);
    }
    
}
