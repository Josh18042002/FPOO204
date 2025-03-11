import javax.swing.*;

public class Vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private static Conductores conductor;

    public Vehiculo(String placa, String modelo, double capacidadCarga){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    public static void AsignarConductor() {
        if (conductor != null) {
            JOptionPane.showInputDialog("Este vehiculo ya esta asignado a otro conductor");
            return;
        }
        String nombreConductor = JOptionPane.showInputDialog("Ingrese el nombre del conductor: ");
        String licenciaConductor = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");
        String identificacionConductor = JOptionPane.showInputDialog("Ingrese la identificacion del conductor: ");

        Conductores connductorNuevo = new Conductores(nombreConductor, licenciaConductor, identificacionConductor);
        conductor = connductorNuevo;

        JOptionPane.showInputDialog(null, "El conductor ha sido asignado correctamente");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


}
