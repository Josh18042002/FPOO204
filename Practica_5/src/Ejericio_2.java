import java.util.Scanner;

public class Ejericio_2 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el numero entero positivo: ");
        int numeroEntero = scanner.nextInt();

        if (numeroEntero <= 0){
            System.out.print("No es un numero positivo");
        } else {
            System.out.print("Numeros impares "+ numeroEntero + " hasta 1 :");
        }
        for (int i = numeroEntero; i >= 1; i--){
            if( 1 % 2 != 0){
                System.out.print(i);
                if ( i > 1){
                    System.out.print(" ,");
                }
            }
        }
        scanner.close();
    }
}
