import javax.swing.*;

public class Conductor extends Empleado{

    private String licencia;

    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarinfo(){
        String info= "nombre: " + nombre + "\nid: " + id + "\nsalario: " + salario + "\nlicencia: " + licencia;
        JOptionPane.showMessageDialog(null, info, "Informacion de Conductor ",JOptionPane.INFORMATION_MESSAGE);
    }
}