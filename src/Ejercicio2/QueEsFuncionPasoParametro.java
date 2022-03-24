package Ejercicio2;

import java.util.Scanner;

public class QueEsFuncionPasoParametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int n1= sc.nextInt();

        System.out.print("Ingrese numero 2: ");
        int n2= sc.nextInt();

        sumar( n1,n2 );

    }

    public static void sumar (int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("El resultado es "+resultado);
    }
}
