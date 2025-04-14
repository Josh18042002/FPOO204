import javax.swing.JOptionPane;

public class ConversorArabigoRomano {

    public static void main(String[] args) {
        String[] opciones = {"Arábigo a Romano", "Romano a Arábigo"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción:",
                "Conversor de Números", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        if (seleccion == 0) {
            convertirArabigoARomano();
        } else if (seleccion == 1) {
            convertirRomanoAArabigo();
        } else {
            JOptionPane.showMessageDialog(null, "Opción cancelada.");
        }
    }

    public static void convertirArabigoARomano() {
        String input = JOptionPane.showInputDialog("Introduce un número entre 1 y 50:");

        try {
            int numero = Integer.parseInt(input);

            if (numero <= 0 || numero > 50) {
                JOptionPane.showMessageDialog(null, "Número inválido. Debe ser entre 1 y 50.");
                return;
            }

            String romano = Utilidades.convertirArabigoARomano(numero);
            JOptionPane.showMessageDialog(null, "Número romano: " + romano);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Debes introducir un número entero.");
        }
    }

    public static void convertirRomanoAArabigo() {
        String input = JOptionPane.showInputDialog("Introduce un número romano válido (I a L):").toUpperCase();

        if (!Utilidades.validarRomano(input)) {
            JOptionPane.showMessageDialog(null, "Número romano inválido.");
            return;
        }

        int numero = Utilidades.convertirRomanoAArabigo(input);
        if (numero <= 0 || numero > 50) {
            JOptionPane.showMessageDialog(null, "El número romano debe representar un valor entre 1 y 50.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Número arábigo: " + numero);
    }
}

class Utilidades {

    private static final String[] ROMANOS = {
            "N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L"
    };

    public static String convertirArabigoARomano(int numero) {
        return ROMANOS[numero];
    }

    public static int convertirRomanoAArabigo(String romano) {
        for (int i = 1; i < ROMANOS.length; i++) {
            if (ROMANOS[i].equals(romano)) {
                return i;
            }
        }
        return -1; // No válido
    }

    public static boolean validarRomano(String romano) {
        for (int i = 1; i < ROMANOS.length; i++) {
            if (ROMANOS[i].equals(romano)) {
                return true;
            }
        }
        return false;
    }
}
