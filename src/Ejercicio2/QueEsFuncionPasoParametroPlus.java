package Ejercicio2;

import java.util.Scanner;

public class QueEsFuncionPasoParametroPlus {
    public static void main(String[] args) {

        int n1 = recibirDatos();
        int n2 = recibirDatos();


        sumar(n1,n2);

    }

    public static void sumar (int numero1, int numero2){ // No retorna nada
        int resultado = numero1 + numero2;
        System.out.println("El resultado es "+resultado);
    }


    public static int recibirDatos(){ // TIpo de dato ||boolean ||int || float ||
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero : ");
        int numero= sc.nextInt();
        return numero;

    }
}
