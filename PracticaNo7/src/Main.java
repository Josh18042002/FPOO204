import javax.swing.*;

public class Main {
    public static void main(String[] args){
        AdministraciónCuenta cuenta = new AdministraciónCuenta("4834181809", "Joshua Moises Cervantes Arredondo", 22, 1000.00);

        int Opción = 0;

        do {
            Opción = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu de Opciones : \n" +
                    "1. Consultar saldo: \n" +
                    "2. Ingresar Efectivo: \n" +
                    "3. Retirar Efectivo: \n" +
                    "4. Depositar a otra Cuenta: \n" +
                    "Ingrese una opción:  "));

            switch (Opción){

                case 1:
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + cuenta.consultarSaldo());
                    break;

                case 2:
                    double ingreso = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto desea Ingresar la cantidad ? "));
                    AdministraciónCuenta.ingresarEfectivo(ingreso);
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso , su nuevo saldo es de: " + AdministraciónCuenta.getSaldo());
                    break;

                case 3:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto desea Retirar: $"));
                    if (cuenta.retirarEfectivo(retiro));
                    JOptionPane.showMessageDialog(null, "Retiro exitoso, su nuevo saldo es de: " + AdministraciónCuenta.getSaldo());
                    break;

                case 4:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto deseas Depostar? "));
                    if (cuenta.depositarotraCuenta(deposito));
                    JOptionPane.showMessageDialog(null, "Deposito exitoso, su nuevo saldo es de: " + AdministraciónCuenta.getSaldo());
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por estar con nosotros tenga linda tarde. ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción invalida. ");

            }
        } while ( Opción !=5);
    }
}