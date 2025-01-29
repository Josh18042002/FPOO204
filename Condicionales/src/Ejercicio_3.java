import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String args []){
        Scanner scanner= new Scanner(System.in);

        // Preguntar al usuario la edad del cliente
        System.out.print("Por favor, ingresa la edad del cliente: ");
        int edad = scanner.nextInt();

        // Variable para almacenar el precio de la entrada
        int precio;

        // Calcular el precio según la edad
        if(edad <=4)

        {
            precio = 0; // Entrada gratis
            System.out.println("El cliente entra gratis.");
        } else if(edad >=4&&edad <=18)

        {
            precio = 110; // Precio para menores de 18 años
            System.out.println("El precio de la entrada es: $" + precio);
        } else

        {
            precio = 190; // Precio para mayores de 18 años
            System.out.println("El precio de la entrada es: $" + precio);
        }


    }

}
