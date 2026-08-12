package planetas;

import java.awt.Color;
import java.awt.Graphics;
import astros.Sol;

public class Marte {
    int posicaoXmarte=300,posicaoYmarte;
    int raio=210;
    int angulo=0;
    double velocidade=0.01;

    public Marte(){

    }

    public void logic(){
        angulo+=velocidade;
        int centroX=Sol.xSol+60;
        int centroY=Sol.ySol+60;
        posicaoXmarte = (int)(centroX + raio * Math.cos(angulo))+30;
        posicaoYmarte = (int)(centroY + raio * Math.sin(angulo))+30;
    }
    public void render(Graphics graphic){
        graphic.setColor(Color.DARK_GRAY);
        graphic.fillOval(posicaoXmarte, posicaoYmarte, 10,10);
    }
}
