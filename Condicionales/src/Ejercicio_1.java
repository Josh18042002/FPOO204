import java.util.Scanner;

public class Ejercicio_1 {
    public static void  main(String args []) {
        Scanner scanner = new Scanner(System.in);

        // Almacenar la contraseña en una variable
        String contraseñaGuardada = "MisPumas5";

        // Solicitar al usuario que introduzca la contraseña
        System.out.print("Introduce la contraseña: ");
        String contraseñaUsuario = scanner.nextLine();

        // Comparar las contraseñas ignorando mayúsculas y minúsculas
        if (contraseñaGuardada.equalsIgnoreCase(contraseñaUsuario)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
