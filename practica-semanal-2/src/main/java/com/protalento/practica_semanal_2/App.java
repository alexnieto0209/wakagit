package com.protalento.practica_semanal_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner calendario=new Scanner(System.in);
        String orden=calendario.next();
        
        String dia_inicial=orden.substring(0, 1);
        String mes_inicial=orden.substring(3, 4);
        String ano_inicial=orden.substring(6, 9);
        
        int dio=Integer.parseInt(dia_inicial);
        int mio=Integer.parseInt(mes_inicial);
        int aio=Integer.parseInt(ano_inicial);
        
        
        
        
      
        
    }
}
