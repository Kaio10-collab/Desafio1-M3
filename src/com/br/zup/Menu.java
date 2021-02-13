package com.br.zup;

/**
 * entrada e saída de dados no terminal.
 * @author kaio.moraes
 */

public class Menu {

    public static void iniciar() {

        System.out.println("JOGO CAÇA NÍQUEL");
        Sistema maquina = new Sistema();
        System.out.println(maquina);

        int pontuacao = Sorteio.calcularPontuacao(maquina);

        System.out.println("Você fez " + pontuacao + " Pontos");
    }
}