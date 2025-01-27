//Primero importamos el escaner
import java.util.Scanner;

/*public class main2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce El numero de horas trabajadas:");
                  int horasTrabajadas = scanner.nextInt();


        System.out.print("Introduce el costo por hora");
                  double costePorHora = scanner.nextDouble();

                  double pagaTotal = horasTrabajadas  + costePorHora;
                      System.out.print("La paga total es: " + pagaTotal );

    }

}*/

/*public class main2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");

        String nombreCompleto = scanner.nextLine();

        System.out.print("Nombre en minusculas: " + nombreCompleto.toLowerCase());
        System.out.print("Nombre en mayusculas: " + nombreCompleto.toUpperCase());

        String[] partesNombre = nombreCompleto.split(" ");
        StringBuilder nombreCapitalizado = new StringBuilder();


        for (String parte : partesNombre) {
            if (parte.length() > 0) {
                nombreCapitalizado.append(Character.toUpperCase(parte.charAt(0)))
                        .append(parte.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        System.out.println("Nombre capitalizado: " + nombreCapitalizado.toString().trim());

    }
}*/

public class main2 {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Introduce un numero Entero: ");

        int x = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= x; i++) {
            suma += i;
        }


        System.out.println("La suma de todos los enteros desde 1 hasta " + x + " es: " + suma);
    }
}


