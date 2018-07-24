package com.cice;


import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    private static final String ruta="ficheroparametros.txt";

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int i=0;
        int a=0;

        try {
            a = Integer.parseInt(sc.next());
            System.out.println("Ha introducido el número:  " + a);
        } catch (NumberFormatException e) {
            System.out.println("El dato introducido no es un número.");
        }

        try (
           BufferedReader br=new BufferedReader(new FileReader(ruta));
           Scanner scan=new Scanner(reader);
           while (scan.hasNextInt()) {
            System.out.println(scan.nextLine());
            }
        }
        catch(IOException e) {
        System.out.println("error de e/s");
        }

        /*try {
            while (i<parametros.length) {
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Introduzca el parámetro " + (i + 1) + " : ");
                String parametro = b.readLine();
                parametros[i] = String.valueOf(parametro);
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error.No se encuentra parametro en esta posición");
        }
        System.out.println(parametros.length);*/
        /*try{
        m_array[10]=100; //posible ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException obj){
        System.out.println(“La posición indicada del array no existe”);
        }*/

    }
}
