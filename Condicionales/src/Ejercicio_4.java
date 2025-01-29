import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena '" + cadena + "' es un palíndromo.");
        } else {
            System.out.println("La cadena '" + cadena + "' no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String cadena) {
        // Elimina espacios y convierte a minúsculas para comparar
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        // Compara la cadena con su reverso
        String reverso = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(reverso);
    }
}
