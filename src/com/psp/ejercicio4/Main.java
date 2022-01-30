
package com.psp.ejercicio4;


public class Main 
{
    private static BandejaGalletas bandeja;
    private static Thread cocineroGalletas;
    private static Thread [] comeGalletas;
    private static final int PITUFOSCOMEGALLETAS = 3;
    
 
    public static void main(String[] args) 
    {
        bandeja = new BandejaGalletas();
        cocineroGalletas = new Thread(new CocineroGalletas(bandeja, "PAPA PITUFO"));
        comeGalletas = new Thread[PITUFOSCOMEGALLETAS];
        
        String[] nombres = {  "GRU��N",  "T�MIDO", "BONACH�N" };

        int contador =0;
        for (String nomb : nombres) {
        	  comeGalletas[contador] = new Thread(new ComeGalletas(bandeja, nomb));
              comeGalletas[contador].start();
              contador++;
        	 }
        
        cocineroGalletas.start();
    }
    
}
