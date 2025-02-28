import javax.swing.*;

public class Gears5 {

    private String nombre;
    private int Salud;
    private String armaPrincipal;
    private String armaSecundaria;
    private String armaTerciaria;
    private String armaCuartenaria;

    public Gears5(String nombre, int salud, String armaPrincipal, String armaSecundaria, String armaTerciaria, String armaCuartenaria) {
        this.nombre = nombre;
        Salud = salud;
        this.armaPrincipal = armaPrincipal;
        this.armaSecundaria = armaSecundaria;
        this.armaTerciaria = armaTerciaria;
        this.armaCuartenaria = armaCuartenaria;
    }

    public void mostrarinfo() {

        JOptionPane.showInputDialog("");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(String armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public String getArmaTerciaria() {
        return armaTerciaria;
    }

    public void setArmaTerciaria(String armaTerciaria) {
        this.armaTerciaria = armaTerciaria;
    }

    public String getArmaCuartenaria() {
        return armaCuartenaria;
    }

    public void setArmaCuartenaria(String armaCuartenaria) {
        this.armaCuartenaria = armaCuartenaria;
    }

}
