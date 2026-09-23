package planetas;

import java.awt.Color;
import java.awt.Graphics;

import astros.Sol;

<<<<<<< HEAD
public class Mercurio extends Configuracoes_Planetas {
    private int x=360,y=250;
    private double velocidade=0.01;
    private double angulo=0;
    private int raio=120;

    public Mercurio(){ }
=======
public class Mercurio {
    private int x=360,y=250;
    private double velocidade=0.02;
    private double angulo=0;
    private int raio=120;

    public Mercurio(){
        
    }
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67

    public void render(Graphics graphic){
        graphic.setColor(Color.red);
        graphic.fillOval(x, y, 40, 40);
    }
    
    public void logic(){
<<<<<<< HEAD
        this.orbita_planeta();
    }

    @Override 
    public void orbita_planeta(){
        angulo += velocidade;
        int centroX_planeta = Sol.xSol + 60;
        int centroY_planeta = Sol.ySol + 60;
        x = (int)(centroX_planeta + raio * Math.cos(angulo));
        y = (int)(centroY_planeta + raio * Math.sin(angulo));
=======
        angulo += velocidade;
        int centroX = Sol.xSol + 60;
        int centroY = Sol.ySol + 60;
        x = (int)(centroX + raio * Math.cos(angulo));
        y = (int)(centroY + raio * Math.sin(angulo));
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67
    }
}
