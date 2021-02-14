package com.br.zup;

import java.util.Arrays;

/**
 * Sistema que vai gerar o sorteio do caça níquel.
 *
 */

public class Sistema {

    private Pecas[] jogada;

    public Sistema() {
        this.jogada = new Pecas[3];
        for (int x = 0; x <this.jogada.length; x++) {
            this.jogada[x] = new Pecas();
        }
    }
    public Pecas[] getJogada() {
        return jogada;
    }

    public String toString() {
        String modelo = Arrays.toString(jogada);
        return modelo;
    }
}