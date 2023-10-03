package grupo76_cuartelbomberos.entidades;

import java.time.LocalDate;

public class Bomberos {

    private int codBombero;
    private int DNI;
    private String nombreApe;
    private String grupoSang;
    private LocalDate fechaNac;
    private int celular;
    private Brigada codBrigada;
    private boolean activo;

    public Bomberos() {
    }

    public Bomberos(int DNI, String nombreApe, String grupoSang, LocalDate fechaNac, int celular, Brigada codBrigada, boolean activo) {
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.activo = activo;
    }

    public Bomberos(int codBombero, int DNI, String nombreApe, String grupoSang, LocalDate fechaNac, int celular, Brigada codBrigada, boolean activo) {
        this.codBombero = codBombero;
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.activo = activo;
    }


    @Override
    public String toString() {
        return "codBombero=" + codBombero + ", DNI=" + DNI + ", nombreApe=" + nombreApe
                + ", grupoSang=" + grupoSang + ", fechaNac=" + fechaNac + ", celular="
                + celular + ", codBrigada=" + codBrigada.getCodBrigada() + " , estado = " + activo;
    }

}
