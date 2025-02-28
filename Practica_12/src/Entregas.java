import javax.swing.*;

public class Entregas {

    private String NumeroGuia;
    private String Estado;


    public Entregas(String numeroGuia) {
        NumeroGuia = numeroGuia;
        Estado = "Pendiente";
    }


    public void actualizarEstado() {
        String[] opciones = {"En tránsito", "Entregado"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el nuevo estado", "Actualizar Estado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion != -1) {
            Estado = opciones[seleccion];
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + Estado);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un estado.");
        }
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Número de Guía: " + NumeroGuia + "\nEstado: " + Estado);
    }

    public static Entregas crearEntrega() {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía");
        return new Entregas(numeroGuia);
    }


    public String getNumeroGuia() {
        return NumeroGuia;
    }

    public String getEstado() {
        return Estado;
    }

}
