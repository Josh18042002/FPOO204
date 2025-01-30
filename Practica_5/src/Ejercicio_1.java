import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un numero entero positivo: ");
          int numeroEntero = scanner.nextInt();

          if ( numeroEntero <= 0){
              System.out.print("No es un numero entero");
          } else if (numeroEntero >=0) {
              System.out.print("Números impares desde 1 hasta "+ numeroEntero + ": ");
          }
          for ( int i= 1; i<= numeroEntero; i++){
              if (i % 2 != 0){
                  System.out.print(i);
                  if (i < numeroEntero - 1){
                      System.out.print(" ,");
                  }
              }
          }
          scanner.close();
    }
}
