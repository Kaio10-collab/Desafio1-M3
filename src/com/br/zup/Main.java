package com.br.zup;

/**
 * @version 0.1
 * @author kaio.moraes
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("JOGO CAÇA NÍQUEL");
        Sistema maquina = new Sistema();
        System.out.println(maquina);

        int pontuacao = Sorteio.calcularPontuacao(maquina);

        System.out.println("Você fez " + pontuacao + " Pontos");
    }
}