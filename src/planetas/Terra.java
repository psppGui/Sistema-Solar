package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;
<<<<<<< HEAD
public class Terra extends Configuracoes_Planetas {
    private int x=360,y=250;
    private double velocidade=0.009;
    private double angulo=0;
    private int raio=200;
    public Terra(){ }

    public void logic(){
        this.orbita_planeta();
    }
    public void render(Graphics graphic){
        graphic.setColor(Color.green);
        graphic.fillOval(x, y, 43,45);
    }
    @Override 
    public void orbita_planeta(){
        angulo+=velocidade;
        int centroX_planeta=Sol.xSol+60;
        int centroY_planeta=Sol.ySol+60;
        x=(int)(centroX_planeta + raio * Math.cos(angulo));
        y=(int)(centroY_planeta + raio * Math.sin(angulo));
=======
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
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67
    }
}
