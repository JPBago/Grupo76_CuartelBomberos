package grupo76_cuartelbomberos.entidades;

import java.time.LocalDate;

public class Bomberos {

    private int codBombero;
    private int DNI;
    private String nombreApe;
    private String grupoSang;
    private LocalDate fechaNac;
    private String celular;
    private Brigada Brigada;
    private boolean activo;

    public Bomberos() {
    }

    public Bomberos(int DNI, String nombreApe, String grupoSang, LocalDate fechaNac, String celular, Brigada codBrigada, boolean activo) {
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.Brigada = codBrigada;
        this.activo = activo;
    }

    public Bomberos(int codBombero, int DNI, String nombreApe, String grupoSang, LocalDate fechaNac, String celular, Brigada codBrigada, boolean activo) {
        this.codBombero = codBombero;
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.Brigada = codBrigada;
        this.activo = activo;
    }

    public int getCodBombero() {
        return codBombero;
    }

    public void setCodBombero(int codBombero) {
        this.codBombero = codBombero;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public String getGrupoSang() {
        return grupoSang;
    }

    public void setGrupoSang(String grupoSang) {
        this.grupoSang = grupoSang;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Brigada getBrigada() {
        return Brigada;
    }

    public void setBrigada(Brigada Brigada) {
        this.Brigada = Brigada;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString() {
        return "codBombero=" + codBombero + ", DNI=" + DNI + ", nombreApe=" + nombreApe
                + ", grupoSang=" + grupoSang + ", fechaNac=" + fechaNac + ", celular="
                + celular + ", codBrigada=" + Brigada.getCodBrigada() + " , estado = " + activo;
    }

}
