import javax.swing.*;

public class Envios {
    private int codigoEnvio;
    private String destino;
    private double peso;

    public Envios (int codigoEnvio, String destino, double peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }

    public Envios(int codigoEnvio, String destino){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public static void crearEnvio(){
        int CodigoEnvio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del envio"));
        String destino = String.valueOf(JOptionPane.showInputDialog("Ahora de favor ingrese el destino"));
        String respuestapeso = String.valueOf(JOptionPane.showInputDialog("Desea agregar peso para su envio"));
        if (respuestapeso.equalsIgnoreCase("Si")){
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ahora por favor ingrese el peso del envio"));
        } else if (respuestapeso.equalsIgnoreCase("No")) {
            String respuestano= String.valueOf(JOptionPane.showInputDialog("Hasta ahora todo bien con su pedido"));
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
