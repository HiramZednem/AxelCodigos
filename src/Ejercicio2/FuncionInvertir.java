package Ejercicio2;

public class FuncionInvertir {
    public static void main(String[] args) {
        String numero = "12345";
        String numeroInvertido="";

        for (int i=numero.length()-1; i >= 0; i--){
            numeroInvertido += numero.charAt(i);
        }
        System.out.println(numeroInvertido);
    }
}
