public abstract class Empleado {
    protected String nombre;
    protected double Salario;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularsalario();
}
