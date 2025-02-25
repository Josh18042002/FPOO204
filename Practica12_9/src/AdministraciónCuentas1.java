import javax.swing.*;
public class AdministraciónCuentas1 {
    private String numeroCuenta;
    private String Titular;
    private int Edad;
    private static double Saldo;

    //Constructor
    public AdministraciónCuentas1(String numeroCuenta, String titular, int edad, double saldo) {
        this.numeroCuenta = numeroCuenta;
        Titular = titular;
        Edad = edad;
        Saldo = saldo;
    }

    public boolean retirarEfectivo (double Cantidad) {

        if (Cantidad <= Saldo){
            Saldo -= Cantidad;
            return true;
        } else {
            JOptionPane.showInputDialog("Fondos Insuficientes ");
        }

        return false;
    }

    public boolean depositarotraCuenta(double Cantidad){
        if (retirarEfectivo(Cantidad)){
            AdministraciónCuentas1.ingresarEfectivo(Cantidad);
            return true ;
        } else{
            JOptionPane.showInputDialog("Error al ingresar los numeros , vuelvalo intentar ");
        }
        return false;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Getter y Setters
    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public static double getSaldo() {
        return Saldo;
    }

    public static void setSaldo(double saldo) {
        Saldo = saldo;
    }
    public  double consultarSaldo (){
        return Saldo;
    }

    public static void ingresarEfectivo(double Cantidad) {
        Saldo += Cantidad;
    }
}

