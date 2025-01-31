import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;

        System.out.println("Introduce las operaciones (D para depósito, R para retiro).");
        System.out.println("Una línea vacía indica que ha finalizado la bitácora.");

        while (true) {
            String operacion = scanner.nextLine().trim(); // Leer la operación


            if (operacion.isEmpty()) {
                break;
            }


            String[] partes = operacion.split(" ");
            if (partes.length != 2) {
                System.out.println("Formato incorrecto. Usa 'D <cantidad>' o 'R <cantidad>'.");
                continue;
            }

            String tipoOperacion = partes[0];
            double cantidad;

            try {
                cantidad = Double.parseDouble(partes[1]); // Convertir la cantidad a número
            } catch (NumberFormatException e) {
                System.out.println("Cantidad inválida. Por favor, introduce un número.");
                continue;
            }


            if (tipoOperacion.equalsIgnoreCase("D")) {
                if (cantidad > 0) {
                    saldo += cantidad;
                    System.out.println("Depósito: " + cantidad + " | Saldo actual: " + saldo);
                } else {
                    System.out.println("La cantidad a depositar debe ser mayor que cero.");
                }
            } else if (tipoOperacion.equalsIgnoreCase("R")) {
                if (cantidad > 0 && cantidad <= saldo) {
                    saldo -= cantidad;
                    System.out.println("Retiro: " + cantidad + " | Saldo actual: " + saldo);
                } else if (cantidad > saldo) {
                    System.out.println("Fondos insuficientes para realizar el retiro.");
                } else {
                    System.out.println("La cantidad a retirar debe ser mayor que cero.");
                }
            } else {
                System.out.println("Tipo de operación no reconocido. Usa 'D' para depósito o 'R' para retiro.");
            }
        }


        System.out.println("Saldo final: " + saldo);

    }
}
