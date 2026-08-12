import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

//Import dos astros e planetas
import astros.Sol;
import astros.Lua;
import planetas.Venus;
import planetas.Mercurio;
import planetas.Terra;
import planetas.Marte;

public class main extends Canvas implements Runnable{
    private JFrame frame;
    private int ALTURA=900, LARGURA=600;

    private Thread thread;
    private boolean loopSimulacao=true;

    private Sol sol;
    private Lua lua;
    private Mercurio venus;
    private Venus mercurio;
    private Terra terra;
    private Marte marte;

    private BufferedImage image;

    public main(){
        this.setPreferredSize(new Dimension(ALTURA,LARGURA));
        image=new BufferedImage(ALTURA,LARGURA, BufferedImage.TYPE_INT_RGB);
        this.janela();
        sol=new Sol();
        lua=new Lua();
        venus=new Mercurio();
        mercurio=new Venus();
        terra=new Terra();
        marte=new Marte();
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
        main jogo=new main();
        new Thread(jogo).start();
    }
}
