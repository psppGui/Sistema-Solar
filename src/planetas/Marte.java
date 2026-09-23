package planetas;

import java.awt.Color;
import java.awt.Graphics;
import astros.Sol;

public class Marte extends Configuracoes_Planetas{
    int x=360+60,y=300+50;
    int raio=280;
    double angulo=-0.5;
    double velocidade=0.006;

    public Marte(){ }

    public void logic(){
        this.orbita_planeta();
    }
    public void render(Graphics graphic){
        graphic.setColor(Color.pink);
        graphic.fillOval(x, y, 33,35);
    }

    @Override 
    public void orbita_planeta(){
        angulo+=velocidade;
        int centroX_planeta=Sol.xSol+60;
        int centroY_planeta=Sol.ySol+60;
        x = (int)(centroX_planeta + raio * Math.cos(angulo))+30;
        y = (int)(centroY_planeta + raio * Math.sin(angulo))+30;
    }
}
