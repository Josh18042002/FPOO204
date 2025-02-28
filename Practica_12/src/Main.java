import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Vehiculo vehiculo = null;
        Envios envio = null;
        Entregas entrega = null;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Crear Vehículo", "Crear Envío", "Crear Entrega", "Salir"}, "Crear Vehículo");

            switch (opcion) {
                case 0:
                    vehiculo = crearVehiculo();
                    break;
                case 1:
                    envio = Envios.crearEnvio();
                    break;
                case 2:
                    entrega = Entregas.crearEntrega();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }

            if (vehiculo != null) {
                int opcionVehiculo = JOptionPane.showOptionDialog(null, "¿Qué desea hacer con el vehículo?", "Opciones Vehículo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Asignar Conductor", "Ver Detalles", "Volver al Menú"}, "Asignar Conductor");
                if (opcionVehiculo == 0) {
                    vehiculo.asignarConductor();
                } else if (opcionVehiculo == 1) {
                    vehiculo.mostrarVehiculo();
                }
            }

            if (envio != null) {
                int opcionEnvio = JOptionPane.showOptionDialog(null, "¿Qué desea hacer con el envío?", "Opciones Envío", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Ver Detalles", "Volver al Menú"}, "Ver Detalles");
                if (opcionEnvio == 0) {
                    envio.mostrarDetalles();
                }
            }

            if (entrega != null) {
                int opcionEntrega = JOptionPane.showOptionDialog(null, "¿Qué desea hacer con la entrega?", "Opciones Entrega", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Actualizar Estado", "Ver Detalles", "Volver al Menú"}, "Actualizar Estado");
                if (opcionEntrega == 0) {
                    entrega.actualizarEstado();
                } else if (opcionEntrega == 1) {
                    entrega.mostrarDetalles();
                }
            }
        } while (opcion != 3);
    }

    public static Vehiculo crearVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehículo"));
        int capacidadDeCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo"));
        return new Vehiculo(placa, modelo, capacidadDeCarga);
    }
}