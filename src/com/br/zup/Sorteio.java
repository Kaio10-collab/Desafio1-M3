package com.br.zup;

/**
 * Classe para definir a pontuação do jogo.
 */

public class Sorteio {

    public static int calcularPontuacao(Sistema maquina) {
        return calcularPontuacao(maquina.getJogada());
    }

    public static int calcularPontuacao(Pecas[] slots) {

        int pontuacao = 0;
        for (Pecas slot : slots) {
            pontuacao += slot.getOpcao().ponto;
        }
        if (Bonus(slots)) {
            pontuacao = pontuacao *100;
            System.out.println("Parabéns você ganhou um bônus.");
        }
        return pontuacao;
    }

    private static boolean Bonus(Pecas[] slots) {
        int controle = 0;
        for (Pecas slot : slots) {
            if (slot.getOpcao() == slots[0].getOpcao()) {
                controle++;
            }
        }
        if (controle == slots.length) {
            return true;
        }
        return false;
    }
}