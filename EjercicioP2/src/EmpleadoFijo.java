public class EmpleadoFijo extends Empleado {

    private double SalarioMensual;

    public EmpleadoFijo(String nombre, double SalarioMensual){
        super(nombre);
        this.SalarioMensual = SalarioMensual;
    }

    @Override
    public double calcularsalario() {
        return SalarioMensual;
    }
}
