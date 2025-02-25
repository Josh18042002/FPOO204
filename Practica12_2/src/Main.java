import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) {
            GeneratorPassword generador = new GeneratorPassword();
            String longitudStr = JOptionPane.showInputDialog("Ingrese la longitud del password (8 por defecto):");
            if (longitudStr != null && !longitudStr.isEmpty()) {
                try {
                    int longitud = Integer.parseInt(longitudStr);
                    generador.setLongitud(longitud);
                } catch (NumberFormatException var8) {
                    JOptionPane.showMessageDialog((Component)null, "Longitud inválida, se usará la longitud por defecto (8).");
                }
            }

            int incluirMayusculasOpcion = JOptionPane.showConfirmDialog((Component)null, "¿Incluir mayúsculas?", "Opciones", 0);
            generador.setIncluirMayusculas(incluirMayusculasOpcion == 0);
            int incluirEspecialesOpcion = JOptionPane.showConfirmDialog((Component)null, "¿Incluir caracteres especiales?", "Opciones", 0);
            generador.isIncluirCaracteresEspeciales(incluirEspecialesOpcion == 0);
            String passwordGenerado = generador.generarPassword();
            String fortaleza = generador.comprobarFortaleza(passwordGenerado);
            String mensaje = "Password generado: " + passwordGenerado + "\nFortaleza: " + fortaleza;
            JOptionPane.showMessageDialog((Component)null, mensaje, "Resultados", 1);
        }
    }