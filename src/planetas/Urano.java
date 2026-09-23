package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Urano extends Configuracoes_Planetas {
        private int x=360+120,y=300+80;
    private double velocidade=0.001;
    private double angulo=-0.9;
    private int raio=440;

    public Urano(){ }

    public void logic(){
        this.orbita_planeta();
    }

    public void render(Graphics graphic){
        graphic.setColor(Color.cyan);
        graphic.fillOval(x, y, 50,50);
    }

    @Override 
    public void orbita_planeta(){
        angulo+=velocidade;
        int centroX_planeta=Sol.xSol+60;
        int centroY_planeta=Sol.ySol+60;
        x=(int)(centroX_planeta + raio * Math.cos(angulo));
        y=(int)(centroY_planeta + raio * Math.sin(angulo));
    }
    /*int posicaoXmarte=360+60,posicaoYmarte=300+50;
    int raio=280;
    double angulo=-0.5;
    double velocidade=0.006;
     */
}
