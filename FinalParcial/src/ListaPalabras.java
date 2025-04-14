import java.util.Scanner;
import java.util.Arrays;

public class ListaPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[6];


        System.out.println("Introduce 6 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }
        String[] palabrasOriginal = Arrays.copyOf(palabras, palabras.length);
        Arrays.sort(palabras);

        System.out.println("\nLista original:");
        for (String palabra : palabrasOriginal) {
            System.out.println(palabra);
        }

        System.out.println("\nLista ordenada alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}

