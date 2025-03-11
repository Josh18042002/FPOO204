import javax.swing.*;

public class Entregas {
    private String noGuia;
    private static String estado;

     public Entregas(String noGuia, String estado){
         this.noGuia = noGuia;
         this.estado = "pendiente";
     }

     public static void actualizarEstado(){
         if (estado.equals("Entregado")){
             JOptionPane.showInputDialog(null, " Ya fue entregado tu paquete");
             return;
         }

         String nuevo = JOptionPane.showInputDialog("Estado actual: " + estado + "\nNuevo estado  ( En transito o Entregado");

         if (nuevo != null){
             if(nuevo.equalsIgnoreCase("En Transito ")){
                 estado = "En Transito";
             } else {
                 if (nuevo.equalsIgnoreCase("En Entregado")){
                     estado = "Entregado";
                 }
             }
         }
     }
}
