package com.psp.ejercicio2;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread dalmata = new Thread(new Dalmata(i));
            dalmata.start();
        }

    }
}