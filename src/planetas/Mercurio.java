package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Mercurio {
    private int x=360,y=250;
    private double velocidade=0.02;
    private double angulo=0;
    private int raio=120;

    public Mercurio(){
        
    }

    public void render(Graphics graphic){
        graphic.setColor(Color.red);
        graphic.fillOval(x, y, 40, 40);
    }
    
    public void logic(){
        angulo += velocidade;
        int centroX = Sol.xSol + 60;
        int centroY = Sol.ySol + 60;
        x = (int)(centroX + raio * Math.cos(angulo));
        y = (int)(centroY + raio * Math.sin(angulo));
    }
}
