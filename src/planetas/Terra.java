package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;
public class Terra {
    private int posicaoxTerra=360,posicaoYTerra=250;
    private double velocidade=0.009;
    private double angulo=0;
    private int raio=200;
    public Terra(){

    }

    public void logic(){
        angulo+=velocidade;
        int centroX=Sol.xSol+60;
        int centroY=Sol.ySol+60;
        posicaoxTerra = (int)(centroX + raio * Math.cos(angulo))+30;
        posicaoYTerra = (int)(centroY + raio * Math.sin(angulo))+30;
    }
    public void render(Graphics graphic){
        graphic.setColor(Color.green);
        graphic.fillOval(posicaoxTerra, posicaoYTerra, 43,45);
    }
}
