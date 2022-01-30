
package com.psp.ejercicio4;


public class BandejaGalletas {
    private int numeroGalletas;
    private boolean bandejaLlena = Boolean.FALSE;

    public synchronized int getGalletas() {
        while (!bandejaLlena) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Contenedor: Error en get -> " + e.getMessage());
            }
        }
        bandejaLlena = Boolean.FALSE;
        notify();
        return numeroGalletas;
    }

    public synchronized void putGalletas(int value) {
        while (bandejaLlena) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Contenedor: Error en put -> " + e.getMessage());
            }
        }
        numeroGalletas = value;
        bandejaLlena = Boolean.TRUE;
        notify();
        
    }
}
