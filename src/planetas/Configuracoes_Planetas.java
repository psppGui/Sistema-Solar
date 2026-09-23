package planetas;

import astros.Sol;

public abstract class Configuracoes_Planetas {
    private int x,y;
    private double velocidade;
    private double angulo;
    private int raio;

    /*Jogar esse método void dentro do lógic de todos os planetas, aí eu só passa as informações
    da classe de cada planeta.
    No orbita_planeta eu passo um @Override para sobre escrever o método!
    */
    public void orbita_planeta(){}
}

