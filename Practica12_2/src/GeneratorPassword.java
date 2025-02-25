import java.util.Random;

public class GeneratorPassword {

    private int longitud ;
    private boolean incluirMayusculas ;
    private boolean incluirCaracteresEspeciales ;


    //Constructor
    public GeneratorPassword(int longitud, boolean incluirMayusculas, boolean incluirCaracteresEspeciales) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirCaracteresEspeciales = incluirCaracteresEspeciales;
    }

    public GeneratorPassword() {
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


    //Getters y Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirCaracteresEspeciales(boolean b) {
        return incluirCaracteresEspeciales;
    }
}
