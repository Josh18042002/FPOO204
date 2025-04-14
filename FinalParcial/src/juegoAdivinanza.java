import java.util.Scanner;
import java.util.Random;

public class juegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intento;
        int intentosRealizados = 0;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Intenta adivinarlo...");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            intentosRealizados++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentosRealizados + " intentos.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }
}
