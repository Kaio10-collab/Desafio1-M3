package com.br.zup;

import java.util.Arrays;

/**
 * Sistema que vai gerar o sorteio do caça níquel.
 * @author kaio.moraes
 */

public class Sistema {

    private Pecas[] slots;

    public Sistema() {
        this.slots = new Pecas[3];
        for (int x=0; x <this.slots.length; x++) {
            this.slots[x] = new Pecas();
        }
    }
    public Pecas[] getSlots() {
        return slots;
    }

    public String toString() {
        String modelo = Arrays.toString(slots);
        return modelo;
    }
}