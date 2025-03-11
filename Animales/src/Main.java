import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Mascotas> mascotas = new ArrayList<>();
    public static void main(String[] args) {

        while (true){
            int opcion = JOptionPane.showOptionDialog(null,"¿Que desea hacer","Menu de opciones",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, new String[]{"Agregar Mascota","Listar Mascotas","Salir"},"Agregar Mascotas");

            switch (opcion){
                case 0:
                    agregarMascotas();
                    break;

                case 1:
                    listarMascotas();
                    break;

                case 2:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showInputDialog("Opcion invalida");
            }
        }

    }

    public static void agregarMascotas() {
        int tipoMascota = JOptionPane.showOptionDialog(null, "¿Que tipo de mascota es ?", "Tipo demascota", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Perro", "Gato"}, "Perro");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));
        String Raza = JOptionPane.showInputDialog("Ingrese la Raza de la mascota: ");

        switch (tipoMascota) {
            case 0:
                String Tamaño = JOptionPane.showInputDialog("Ingrese el tamaño de la mascota (Pequeño,Mediano o Grande");
                mascotas.add(new Perro(nombre, Edad, Raza, Tamaño));
                break;

            case 1:
                String Color = JOptionPane.showInputDialog("Ingrese el Color del gato");
                mascotas.add(new Gato(nombre,Edad, Raza, Color));
                break;
        }
    }

    private static void listarMascotas(){
        if (mascotas.isEmpty()){
            JOptionPane.showInputDialog(null,"No hay mascotas registrada");
            return;
        }

        for (Mascotas mascota: mascotas){
            mascota.mostrarinfo();
       }
    }
}