import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {

            String menu =
                    "Menu prinicipal\n" +
                    "1.- Asignar Conductor\n" +
                    "2.- Crear Envios\n" +
                    "3.- Actualizar Estado\n" +
                    "4.- Salir del menu";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion){

                case 1:
                    Vehiculo.AsignarConductor();
                    break;

                case 2:
                    Envios.crearEnvio();
                    break;

                case 3:
                    Entregas.actualizarEstado();
                    break;
            }

        }while (opcion !=4);
    }
}