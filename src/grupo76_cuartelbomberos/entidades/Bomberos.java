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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
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
                + celular + ", codBrigada=" + codBrigada.getCodBrigada() + " , estado = " + activo;
    }

}
