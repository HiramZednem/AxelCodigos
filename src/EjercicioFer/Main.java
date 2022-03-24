package EjercicioFer;

public class Main {
    public static void main(String[] args) {
        //String texto = "Fernando Daniel";

        //System.out.println(texto);

        //System.out.println( texto.charAt(3) );
        //System.out.println( texto.indexOf("n") );

        String nombre = "F E R N A N D O"; //Eliminariamos la posicion 4
        String nombreTrabajo ="";
        System.out.println(nombre);
        for (int i= 0; i<nombre.length() - 1; i++){
            if (i!=4){
                nombreTrabajo += nombre.charAt(i);
            }
        }

        System.out.println(nombreTrabajo);

    }
}
