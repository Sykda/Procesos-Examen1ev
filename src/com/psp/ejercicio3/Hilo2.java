package com.psp.ejercicio3;

public class Hilo2 implements Runnable {

    int n;

    Primos p1 = new Primos(4000000, 8000000);

    @Override
    public void run() {

        p1.calcular();
        n = p1.cuantos();
        System.out.println("Numero de primos menores de 4000000 a 8000000: " + n );
    }

    public int getN() {
        return n;
    }

}