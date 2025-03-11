import java.util.concurrent.locks.Condition;

public class Conductores {
    private String nombre;
    private String licencia;
    private String identificacion;

    public Conductores(String nombre, String licencia, String identificacion){
        this.nombre = nombre;
        this.licencia = licencia;
        this.identificacion = identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getIdentificacion() {
        return identificacion;
    }





}
