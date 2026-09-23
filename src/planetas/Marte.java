package planetas;

import java.awt.Color;
import java.awt.Graphics;
import astros.Sol;

<<<<<<< HEAD
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
=======
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
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67
    }
}
