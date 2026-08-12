package astros;

import java.awt.Color;
import java.awt.Graphics;

public class Sol {
    public static int xSol=400,ySol=250;

    public Sol(){

    }


    public void render(Graphics graphic){
        graphic.setColor(Color.yellow);
        graphic.fillOval(xSol,ySol, 120,120);
    }
    public void logic(){}
}
