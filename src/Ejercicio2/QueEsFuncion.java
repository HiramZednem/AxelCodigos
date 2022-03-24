package Ejercicio2;

import java.util.Scanner;

public class QueEsFuncion {
    //funcion Main - metodo main
    public static void main(String[] args) {


        funcionSaludar( "Hiram" );
        funcionSaludar( "Axel" );
        funcionSaludar( "Max" );
        funcionSaludar( "Abi" );

        Scanner scanner = new Scanner(System.in);

    }

    //funcion saludar
    public static void funcionSaludar (        String nombre      ){ //su main
        System.out.println("Hola mundo!" + nombre);
    }

}
