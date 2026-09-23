package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

public class Netuno extends Configuracoes_Planetas {
    private int x=360+180,y=400;
    private double velocidade=0.0007;
    private double angulo=-1.1;
    private int raio=460;

    public Netuno(){ }

    public void render(Graphics graphic){
        graphic.setColor(Color.red);
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
