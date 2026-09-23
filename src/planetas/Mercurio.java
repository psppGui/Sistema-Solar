package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Mercurio extends Configuracoes_Planetas {
    private int x=360,y=250;
    private double velocidade=0.01;
    private double angulo=0;
    private int raio=120;

    public Mercurio(){ }

    public void render(Graphics graphic){
        graphic.setColor(Color.red);
        graphic.fillOval(x, y, 40, 40);
    }
    
    public void logic(){
        this.orbita_planeta();
    }

    @Override 
    public void orbita_planeta(){
        angulo += velocidade;
        int centroX_planeta = Sol.xSol + 60;
        int centroY_planeta = Sol.ySol + 60;
        x = (int)(centroX_planeta + raio * Math.cos(angulo));
        y = (int)(centroY_planeta + raio * Math.sin(angulo));
    }
}
