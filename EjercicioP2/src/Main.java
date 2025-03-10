import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoFijo("Joshua", 300));
        empleados.add(new EmpleadoPorHoras("Erick", 150,15));

        double SalarioTotal =0;
        for (Empleado empleado: empleados){
            SalarioTotal += empleado.calcularsalario();
        }
        System.out.println("El salario total del empleado es " + SalarioTotal);
    }

}