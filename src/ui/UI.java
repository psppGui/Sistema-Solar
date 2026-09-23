package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class UI {
    public void UI(){ }

    public void logic(){}

    public void render(Graphics graphic){
        graphic.setColor(Color.white);
        graphic.setFont(new Font("Arial", 20,20));
        graphic.drawString("SIMULAÇÃO GRÁFICA 2D DO SISTEMA SOLAR", 50, 50);
        graphic.drawString("AUTOR:GUILHERME", 50, 90);

        graphic.drawString("QUANTIDADE DE PLANETAS:7", 1000, 50);
        graphic.drawString("VOLTAS PLANETAS:", 1000, 80);
        graphic.drawString("MERCÚRIO:", 1000, 130);
        graphic.drawString("VÊNUS:", 1000, 160);
        graphic.drawString("TERRA:", 1000, 190);
        graphic.drawString("MARTE:", 1000, 220);
        graphic.drawString("JÚPITER:", 1000,250);
        graphic.drawString("SATURNO:", 1000, 280);
        graphic.drawString("URANO:", 1000, 310);
        graphic.drawString("NETUNO:", 1000, 340);
    }
}
