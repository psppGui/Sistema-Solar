package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Venus extends Configuracoes_Planetas {
    private int x=400,y=120, raio=160;
    private double angulo=-0.6;
    private double velocidade=0.01;

    public Venus(){ }

    public void render(Graphics graphic){
        graphic.setColor(Color.darkGray);
        graphic.fillOval(x,y,30,30);
    }

    public void logic(){
        this.orbita_planeta();
    }

    @Override 
    public void orbita_planeta(){
        angulo+=velocidade;
        int centroX_planeta=Sol.xSol+60;
        int centroY_planeta=Sol.ySol+60;
        x = (int)(centroX_planeta + raio * Math.cos(angulo));
        y = (int)(centroY_planeta + raio * Math.sin(angulo));
    }
}
