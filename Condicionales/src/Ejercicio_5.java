import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = realizarOperacion(num1, num2, operador);

        if (Double.isNaN(resultado)) {
            System.out.println("Error: Operador no válido o división por cero.");
        } else {
            System.out.println("El resultado de la operación es: " + resultado);
        }

        scanner.close();
    }

    public static double realizarOperacion(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Indica error al dividir por cero
                }
            default:
                return Double.NaN; // Indica error en el operador
        }
    }
}
