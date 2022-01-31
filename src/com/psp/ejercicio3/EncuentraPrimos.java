package com.psp.ejercicio3;

import java.util.Date;

public class EncuentraPrimos {

	public static void main(String[] args) throws InterruptedException {

		long t0 = (new Date()).getTime();

		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();

		Thread hilo1 = new Thread(h1);
		Thread hilo2 = new Thread(h2);

		hilo1.start();
		hilo2.start();

		hilo1.join();
		hilo2.join();

		long t1 = (new Date()).getTime();
		long time = t1 - t0;

		int n = h1.getN() + h1.getN();

		System.out.println("Numero de primos menores que 8000000: " + n + " calculado en " + time + " milisegundos");

	}

}
