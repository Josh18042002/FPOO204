//Primero importamos el escaner
import java.util.Scanner;

public class main2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce El numero de horas trabajadas:");
                  int horasTrabajadas = scanner.nextInt();


        System.out.print("Introduce el costo por hora");
                  double costePorHora = scanner.nextDouble();

                  double pagaTotal = horasTrabajadas  + costePorHora;
                      System.out.print("La paga total es: " + pagaTotal );

    }

}
