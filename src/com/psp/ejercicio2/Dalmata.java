package com.psp.ejercicio2;

public class Dalmata implements Runnable {

    int dalmata = (int) Math.floor(Math.random() * (1 - 10 + 1) + 1);

    int id = 0;

    public Dalmata(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        if (dalmata % 2 == 0) {
            System.out.println("El dalmata " + id + " ha escapado.");
        } else {
            System.out.println("Cruella ha cogido al dalmata: " + id);
        }

    }

}
