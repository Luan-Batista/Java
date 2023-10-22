package oo.heranca;

public class jogador {
    int x;
    int y;
    int vida;
    boolean andar(Direcao direcao)
    {
        switch(direcao)
        {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

    boolean atacar(jogador playerOponente)
    {
        int deltaX = Math.abs(x - playerOponente.x);
        int deltaY = Math.abs(y - playerOponente.y);

        if(deltaY == 1 && deltaX == 0)
            playerOponente.vida -= 10;
        else if(deltaY == 0 && deltaX == 1)
            playerOponente.vida -= 10;
        else
            System.out.println("impossivel atacar o jogador! Ande mais casas para realizar tal feito");
        return true;
    }
}
