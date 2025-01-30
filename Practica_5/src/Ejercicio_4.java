import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo para la altura de la piramide: ");
        int altura = scanner.nextInt();

        if ( altura <= 0){
            System.out.print("La altura que ingresaste no es entero");
        }  else {
            for ( int i = 0; i <= altura; i++){
                for ( int j =0; j<=i; j++){
                    System.out.print(j + "");
                }
                System.out.println();
            }
        }
    }
}
