import javax.swing.*;


public class Gato  extends Mascotas{
    private String Color;

    public Gato(String nombre, int Edad, String Raza, String Color){
        super(nombre,Edad,Raza);
        this.Color = Color;
    }

    @Override
    public void mostrarinfo() {
        JOptionPane.showInputDialog("nombre: " + nombre + "\nEdad: " + Edad + "\nRaza: " + Raza + "\nColor: " + Color);
        return;
    }
}
