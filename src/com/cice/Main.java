package com.cice;


import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {

    public static void main(String[] args) {
	// write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);
        int numero=0;
        int i=0;
        try {
            System.out.println("Introduzca un número: ");
            numero = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException ex){
            System.out.println("El dato introducido no es numérico.");
        }
        String[] parametros=new String[numero];
       /* try{
            while (i<parametros.length){
                //numero
                System.out.println("Introduzca el parámetro "+ (i+1)+ " : ");
                parametros[i]= String.valueOf(numero);
            }
        }
        catch (){

        }*/
    }
}
