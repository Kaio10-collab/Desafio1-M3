package com.br.zup;

/**
 * Definição dos símbolos do jogo.
 * @author kaio.moraes
 */

public enum Simbolos {

    BANANA (10),
    MORANGO (20),
    ESTRELA (40);

    public int ponto;

    Simbolos(int i) {
        this.ponto = i;
    }
}