import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Ejercicion_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        while (true) {

            System.out.println("Elige la operación que quieres realizar: ");
            System.out.println("1.Operación de   Farenheit a Grados");
            System.out.println("2.Operación de G° Farenheit a Centrigraods  ");
            System.out.println("3.Operación de G° Kelvin a centigrados");
            System.out.println("Opción: ");
            opcion= scanner.nextInt();

            if (opcion == 4){
                System.out.println("Ingresa la temperatura correcta");
                break;

            }
            if (opcion >=1 && opcion  <=3){
                double temperatura;
                System.out.println("Ingrese la temperatura: ");
                temperatura = scanner.nextDouble();

                double resultado = 0;

                switch (opcion){
                    case 1:
                      resultado=( temperatura - 32 * 5 / 9);
                      System.out.println(temperatura + "Farenheit a " + resultado + "Grados ");

                      break;
                    case 2:
                        resultado=( temperatura * 9 / 5) + 32;
                        System.out.println(temperatura + " G. Farenheit a " + resultado + "Centigrados");

                        break;

                    case 3:
                        resultado=( temperatura + 273.15);
                        System.out.println( temperatura + "G. kelvin a" + resultado + "Centigrados");
                        break;
                }


            } else {

                System.out.println("Opcion invalida Intente de nuevo.");

                scanner.close();
            }
        }
    }
}