package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

<<<<<<< HEAD
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
=======
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
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67
    }
}
