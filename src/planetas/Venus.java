package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Venus {
    private int posicaoX=400,posicaoY=120, raio=180;
    private double angulo=0;
    private double velocidade=0.01;

    public Venus(){

    }

    public void render(Graphics graphic){
        graphic.setColor(Color.darkGray);
        graphic.fillOval(posicaoX,posicaoY,30,30);
    }

    public void logic(){
        angulo+=velocidade;
        int centroX=Sol.xSol+60;
        int centroY=Sol.ySol+60;
        posicaoX = (int)(centroX + raio * Math.cos(angulo))+20;
        posicaoY = (int)(centroY + raio * Math.sin(angulo))+20;
    }
}
