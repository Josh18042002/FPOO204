public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double TarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double TarifaPorHora){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.TarifaPorHora = TarifaPorHora;
    }

    @Override
    public double calcularsalario() {
        return horasTrabajadas * TarifaPorHora;
    }
}
