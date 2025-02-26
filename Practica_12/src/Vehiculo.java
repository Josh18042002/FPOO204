public class Vehiculo {

    private String placa;
    private int modelo;
    private double CapacidadDeCarga;


    public Vehiculo(String placa, int modelo, double capacidadDeCarga) {
        this.placa = placa;
        this.modelo = modelo;
        CapacidadDeCarga = capacidadDeCarga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadDeCarga() {
        return CapacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        CapacidadDeCarga = capacidadDeCarga;
    }
}
