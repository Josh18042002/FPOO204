import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Introduce 8 numeros: ");
        for (int i= 0; i < numeros.length; i++){
            System.out.println("Numeros " + (i + 1) + ":");
            int numero= scanner.nextInt();

            if(numero % 2 == 0){
                System.out.println("El numero " + numero + "es par.");
            }else {
                System.out.println("El numero " + numero + "es impar");
            }
        }
    }
}
