package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Saturno extends Configuracoes_Planetas {
    private int x=360+180,y=400;
    private double velocidade=0.0015;
    private double angulo=-0.6;
    private int raio=400;

    public Saturno(){ }

    public void render(Graphics graphic){
        graphic.setColor(Color.orange);
        graphic.fillOval(x, y, 45,45);
    }

    public void logic(){
        this.orbita_planeta();
    }

    @Override 
    public void orbita_planeta(){
        angulo+=velocidade;
        int centroX_planeta=Sol.xSol+60;
        int centroY_planeta=Sol.ySol+60;
        x=(int)(centroX_planeta + raio * Math.cos(angulo));
        y=(int)(centroY_planeta + raio * Math.sin(angulo));
    }
}
