package com.cice;


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        }
        catch (NumberFormatException e) {
            System.out.println("El dato introducido no es un número.");
        }
        System.out.println("Introduce el nombre del fichero:  ");
        File archivo = new File (sc.next());
        try {
            sc = new Scanner (archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            sc.close();
        }
        catch(IOException e) {
        System.out.println("El fichero no se encuentra en la ruta indicada.");
        }
        String[] linea; //posible ArrayIndexOutOfBoundsException

       /* try{
            BufferedReader fich = new BufferedReader(new FileReader(nombreFich));
            int contadorL = 0;
            String linea;

            while((linea = fich.readLine()) != null) {
                contadorL++;
            }
        }
        catch (ArrayIndexOutOfBoundsException obj){
        System.out.println("Indice fuera de límites.");
        }*/

    }
}
