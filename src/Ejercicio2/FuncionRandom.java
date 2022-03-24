package Ejercicio2;

import java.util.Random;

public class FuncionRandom {/*
}
    public static void main(String[] args) {

        Random random = new Random();


        int value = random.nextInt(max + min) + min;
        System.out.println(value);
    }

*/


    public static void main(String[] args) {

        Random random = new Random();

for (int i=0; i<=10; i++) {
    int value = (int) (Math.random()*(90-80)) + 80;
    System.out.println(value);
}
    }
}







