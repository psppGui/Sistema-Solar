package astros;

import java.awt.Color;
import java.awt.Graphics;

public class Sol {
<<<<<<< HEAD
    public static int xSol=400,ySol=400;

    public Sol(){ }
    
    public void render(Graphics graphic){
        graphic.setColor(Color.yellow);
        graphic.fillOval(xSol,ySol, 120,120);

        //----> Ative isso para visualizar as rotas de todas os planetas!
        /*  graphic.setColor(Color.white); 
        int centroX = xSol + 60;
        int centroY = ySol + 60;
        int[] raios = {120, 160, 200, 280, 300, 400, 440, 460};
        for (int raio : raios) {
            graphic.drawOval(centroX - raio, centroY - raio,raio * 2, raio * 2);
        }*/
    }
    public void logic(){}
}
=======
    public static int xSol=400,ySol=250;

    public Sol(){

    }


    public void render(Graphics graphic){
        graphic.setColor(Color.yellow);
        graphic.fillOval(xSol,ySol, 120,120);
    }
    public void logic(){}
}
>>>>>>> 41a9a2fed7a92c1f065026d26ef333c573db8c67
