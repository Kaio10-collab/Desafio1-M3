package com.br.zup;

/**
 * Definir onde pega os símbolos.
 */

import java.util.Random;

public class Pecas {

    private Simbolos opcao;

    public Pecas(){

        int frutas = Simbolos.values().length;
        int numerAleatorio = new Random().nextInt(frutas);
        this.opcao = Simbolos.values()[numerAleatorio];
    }

    public Simbolos getOpcao() {
        return opcao;
    }

    public String toString() {
        String modelo = "Simbolo " + opcao + " " + opcao.ponto;
        return modelo;
    }
}