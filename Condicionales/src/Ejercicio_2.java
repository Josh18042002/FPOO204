import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}