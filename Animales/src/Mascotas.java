import javax.swing.*;

public class Mascotas {
    protected String nombre;
    protected int Edad;
    protected  String Raza;

    public Mascotas(String nombre, int Edad, String raza){
        this.nombre = nombre;
        this.Edad = Edad;
        this.Raza = Raza;
    }

    public void mostrarinfo(){
        JOptionPane.showInputDialog("nombre: " + nombre + "\nEdad: " + Edad + "\nRaza: " + Raza);
        return;
    }
}