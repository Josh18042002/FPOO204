import javax.swing.*;

public class Envios {

    private int CodigoEnvio;
    private String Destino;
    private double peso;


    public Envios(int codigoEnvio, String destino, double peso) {
        CodigoEnvio = codigoEnvio;
        Destino = destino;
        this.peso = peso;
    }


    public static void crearEnvios() {
        int CodigoEnvio= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el codigo de envio:  "));
        String Destino = String.valueOf(JOptionPane.showInputDialog("Ahora de favor ingrese su Destino: "));
        double agregarPeso = Double.valueOf(JOptionPane.showInputDialog("Desea agregar peso del envio SI o No;"));
        if (){
            double Peso =Double.parseDouble(JOptionPane.showInputDialog("Por favor ahora ingrese el peso:  "));;
        }

    }


    public int getCodigoEnvio() {
        return CodigoEnvio;
    }

    public void setCodigoEnvio(int codigoEnvio) {
        CodigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
