package Ejercicio1;

import javax.swing.*;

public class Main {

    //Un Metodo
    public static int sumaDeNumeros( int numero){
        int suma=0;
        for (int i = numero-1; i>0; i--){
            if( numero%i == 0){
                suma+= i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
        {

            int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero A: "));
            int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero B: "));


            if ((sumaDeNumeros(numeroA) == numeroB) && (sumaDeNumeros(numeroB) == numeroA)) {
                JOptionPane.showMessageDialog(null, "Los numeros son amigos");
            }else{
                JOptionPane.showMessageDialog(null, "no son amigos:(");
            }

        }
    }
}