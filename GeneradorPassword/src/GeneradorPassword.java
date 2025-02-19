import javax.swing.JOptionPane;
import java.util.Random;

public class GeneradorPassword {

    private int longitud = 8;
    private boolean incluirMayusculas = false;
    private boolean incluirCaracteresEspeciales = false;

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public void setIncluirCaracteresEspeciales(boolean incluirCaracteresEspeciales) {
        this.incluirCaracteresEspeciales = incluirCaracteresEspeciales;
    }

    public GeneradorPassword() {
    }

    public String generarPassword() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (incluirMayusculas) {
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (incluirCaracteresEspeciales) {
            caracteres += "ñÑ!@#$%^&*()_+=-`~[]\\{}|;':\",./<>?";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public String comprobarFortaleza(String password) {
        int fortaleza = 0;
        if (password.length() >= 8) {
            fortaleza++;
        }
        if (password.matches(".*[A-Z].*")) {
            fortaleza++;
        }
        if (password.matches(".!$%&//()?¡<>")) {
            fortaleza++;
        }

        if (fortaleza == 0) {
            return "Débil";
        } else if (fortaleza == 1) {
            return "Media";
        } else {
            return "Fuerte";
        }
    }
}


