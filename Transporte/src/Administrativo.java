import javax.swing.*;

public class Administrativo  extends Empleado{

    private String departamento;

    public Administrativo (String nombre, int id, double salario, String departamento){
        super(nombre, id, salario);
        this.departamento= departamento;
    }

    @Override
    public void mostrarinfo(){
        String info= "nombre: " + nombre + "\nid: " + id + "\nSalario: " + salario + "\ndepartamento: " + departamento;
        JOptionPane.showMessageDialog(null, info, "Informacion del Administrativo",JOptionPane.INFORMATION_MESSAGE);
    }
}
