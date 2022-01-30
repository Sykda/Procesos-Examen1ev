package com.psp.ejercicio3;

public class Hilo2 implements Runnable {

    int x = 0;
    int y = 0;
    int n;

    Primos p1 = new Primos(4000000, 8000000);

    @Override
    public void run() {

        p1.calcular();
        n = p1.cuantos();
    }

    public int getN() {
        return n;
    }

}