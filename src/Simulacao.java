import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;


//Import dos astros e planetas
import astros.Lua;
import astros.Sol;
import planetas.Marte;
import planetas.Mercurio;
import planetas.Terra;
import planetas.Venus;
import planetas.Jupiter;
import planetas.Saturno;
import planetas.Urano;
import planetas.Netuno;

//Import da UI
import ui.UI;

public class Simulacao extends Canvas implements Runnable{
    private JFrame frame;
    private int ALTURA=1500, LARGURA=1000;

    private Thread thread;
    private boolean loopSimulacao=true;

    //Astros
    private Sol sol;
    private Lua lua;

    //Planetas
    private Mercurio mercurio;
    private Venus venus;
    private Terra terra;
    private Marte marte;
    private Jupiter jupiter;
    private Saturno saturno;
    private Urano urano;
    private Netuno netuno;

    //UI do sistema:
    private UI ui;

    private BufferedImage image;

    public Simulacao(){
        this.setPreferredSize(new Dimension(ALTURA,LARGURA));
        image=new BufferedImage(ALTURA,LARGURA, BufferedImage.TYPE_INT_RGB);
        this.janela();
        sol=new Sol();
        lua=new Lua();
        mercurio=new Mercurio();
        venus=new Venus();
        terra=new Terra();
        marte=new Marte();
        jupiter=new Jupiter();
        saturno=new Saturno();
        urano=new Urano();
        netuno=new Netuno();
        ui=new UI();
    }

    public void janela(){
        frame=new JFrame("Sistema solar:");
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(0,0);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void render(){
        BufferStrategy buffer=this.getBufferStrategy();
        if(buffer==null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics graphic=image.getGraphics();
        graphic.setColor(Color.BLACK);
        graphic.fillRect(0,0, ALTURA,LARGURA);

        sol.render(graphic);
        lua.render(graphic);
        venus.render(graphic);
        mercurio.render(graphic);
        terra.render(graphic);
        marte.render(graphic);
        jupiter.render(graphic);
        saturno.render(graphic);
        urano.render(graphic);
        netuno.render(graphic);
        ui.render(graphic);

        
        graphic=buffer.getDrawGraphics();
        graphic.drawImage(image, 0,0,ALTURA,LARGURA, null);
        buffer.show();

    }
    public void logic(){
        sol.logic();
        lua.logic();
        mercurio.logic();
        venus.logic();
        terra.logic();
        marte.logic();
        jupiter.logic();
        saturno.logic();
        urano.logic();
        netuno.logic();
        ui.logic();
    }

    @Override
    public void run(){
        while (loopSimulacao) {
            logic();
            render();
            try {
                Thread.sleep(1000/60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Simulacao jogo=new Simulacao();
        new Thread(jogo).start();
    }
}
