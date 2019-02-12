
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    private ArrayList<Figure> figures;

    public CompoundFigure() {
        this.figures = new ArrayList<Figure>();
    }
    
    public void add(Figure f){
        figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure figure : this.figures){
            figure.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy){
        for(Figure figure : this.figures){
            figure.move(dx, dy);
        }
    }
    
}
