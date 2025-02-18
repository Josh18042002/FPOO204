import javax.swing.*;

public class AdministraciónCuenta {

    String numeroCuenta;
    String Titular;
    int Edad;
    static double Saldo;

    public AdministraciónCuenta(String numeroCuenta, String Titular, int Edad, double Saldo){
        this.numeroCuenta = numeroCuenta;
        this.Titular = Titular;
        this.Edad = Edad;
        this.Saldo = Saldo;

    }

    public  double consultarSaldo (){
       return Saldo;
    }

    public static void ingresarEfectivo(double Cantidad){
        Saldo += Cantidad;
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
            AdministraciónCuenta.ingresarEfectivo(Cantidad);
            return true ;
        } else{
            JOptionPane.showInputDialog("Error al ingresar los numeros , vuelvalo intentar ");
        }
        return false;
    }

    public String getTitular(){
        return Titular;
    }

    public int getEdad() {
        return Edad;
    }

    public static double getSaldo() {
        return Saldo;
    }
}
