import javax.swing.*;

public class Perro extends Mascotas{
    private String Tamaño;

    public Perro(String nombre, int Edad, String Raza, String Tamaño){
        super(nombre,Edad,Raza);
        this.Tamaño = Tamaño;
    }

    @Override
    public void mostrarinfo() {
        JOptionPane.showInputDialog("nombre: " + nombre + "\nEdad: " + Edad + "\nRaza: " + Raza + "\nTamaño: " + Tamaño);
        return;
    }
}
