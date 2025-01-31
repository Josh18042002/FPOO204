import java.util.Scanner;

public class Ejercicio_5 {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase= scanner.nextLine();

        System.out.print("Introduce una letra: ");
        String letra= scanner.nextLine();

        if (letra.length() !=1){
            System.out.print("Por favor , vuelve intentar solo una letra ");
        } else {
            int contador = 0;
            for ( int i= 0; i< frase.length(); i++) {
                if (frase.charAt(i) == letra.charAt(0)) {
                    contador++;
                }

            }
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        }
    }
}
