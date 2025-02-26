public class GestionDeConductores {

    private String Nombre;
    private String identificiación;
    private String Licencia;

    public GestionDeConductores(String nombre, String identificiación, String licencia) {
        Nombre = nombre;
        this.identificiación = identificiación;
        Licencia = licencia;
    }

    public String getIdentificiación() {
        return identificiación;
    }

    public String getLicencia() {
        return Licencia;
    }

}
