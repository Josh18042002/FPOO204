import javax.swing.*;

public class Envios {

    private String CodigoEnvio;
    private String Destino;
    private double Peso;



    public Envios(String codigoEnvio, String destino) {
        CodigoEnvio = codigoEnvio;
        Destino = destino;
        Peso = 0;
    }




    public Envios(String codigoEnvio, String destino, double peso) {
        CodigoEnvio = codigoEnvio;
        Destino = destino;
        Peso = Peso;
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Código de Envío: " + CodigoEnvio + "\nDestino: " + Destino + "\nPeso: " + Peso + " kg");
    }

    public static Envios crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío");
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar el peso del envío?", "Opción", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso estimado del envío"));
            return new Envios(codigoEnvio, destino, peso);
        } else {
            return new Envios(codigoEnvio, destino);
        }

    }
}
