package com.psp.ejercicio4;


public class ComeGalletas implements Runnable
{
    private final BandejaGalletas bandejaGalletas;
    private final String id;


    public ComeGalletas(BandejaGalletas bandejaGalletas, String id) 
    {
        this.bandejaGalletas = bandejaGalletas;
        this.id = id;
    }

    public void run() 
    {
        while(Boolean.TRUE)
        {
        	System.out.println("El consumidor " + id + " consume: " + bandejaGalletas.getGalletas());
        }
    }
}
