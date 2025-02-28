import javax.swing.*;

public class Vehiculo {
    private String placa;
    private String  modelo;
    private int CapacidadDeCarga;
    private GestionDeConductores Conductor;



    public Vehiculo(String placa, String modelo, int capacidadDeCarga) {
        this.placa = placa;
        this.modelo = modelo;
        CapacidadDeCarga = capacidadDeCarga;
    }

    public void asignarConductor() {
        if (Conductor != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha asignado un conductor para este vehículo");
            return;
        }
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Conductor: ");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del Conductor: ");

        if (nombre != null && licencia != null && identificacion != null) {
            Conductor = new GestionDeConductores(nombre, licencia, identificacion);
            JOptionPane.showMessageDialog(null, "El conductor ha sido asignado al vehículo correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo asignar el conductor. Por favor, ingrese los campos correctamente");
        }
    }

    public void mostrarVehiculo() {
        JOptionPane.showMessageDialog(null, "Placa: " + placa + "\nModelo: " + modelo + "\nCapacidad de Carga: " + CapacidadDeCarga);
        if (Conductor != null) {
            JOptionPane.showMessageDialog(null, "Conductor: " + Conductor.getIdentificiación());
        }
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadDeCarga() {
        return CapacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        CapacidadDeCarga = capacidadDeCarga;
    }

    public GestionDeConductores getConductor() {
        return Conductor;
    }


}
