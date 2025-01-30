public class Ejercicio_3 {
    public static void main (String args[]){

        for ( int i = 1; i< 10; i++){
            System.out.print("Tabla de multiplicar del " + i + ":");
            for ( int j = 1; j<10; j++){
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }
    }
}
