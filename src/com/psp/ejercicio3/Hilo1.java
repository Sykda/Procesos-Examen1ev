package com.psp.ejercicio3;

public class Hilo1 implements Runnable {

    int n;

    Primos p1 = new Primos(1, 4000000);

    @Override
    public void run() {

        p1.calcular();
        n = p1.cuantos();
        System.out.println("Numero de primos menores de 1 a 4000000: " + n );
    }

    public int getN() {
        return n;
    }

}