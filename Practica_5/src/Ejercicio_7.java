import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el número de asteriscos para la base del árbol: ");
        int base = scanner.nextInt();


        if (base <= 0) {
            System.out.println("Por favor, introduzca un número mayor que 0.");
        } else {
            int altura = (base / 2) + 1;

            int i = 1;


            while (i <= altura) {

                int espacios = altura - i;


                int j = 0;
                while (j < espacios) {
                    System.out.print(" ");
                    j++;
                }


                int asteriscos = (2 * i) - 1;
                j = 0;
                while (j < asteriscos) {
                    System.out.print("*");
                    j++;
                }


                System.out.println();
                i++; /
            }
        }

    }
    }
