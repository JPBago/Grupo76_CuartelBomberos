package grupo76_cuartelbomberos.entidades;

import java.util.Date;

public class Bomberos {

    private int codBombero;
    private int DNI;
    private String nombreApe;
    private String grupoSang;
    private Date fechaNac; 
    private int celular;
    private int codBrigada;

    public Bomberos() {
    }

    public Bomberos(int DNI, String nombreApe, String grupoSang, Date fechaNac, int celular, int codBrigada) {
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
    }

    public Bomberos(int codBombero, int DNI, String nombreApe, String grupoSang, Date fechaNac, int celular, int codBrigada) {
        this.codBombero = codBombero;
        this.DNI = DNI;
        this.nombreApe = nombreApe;
        this.grupoSang = grupoSang;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "codBombero=" + codBombero + ", DNI=" + DNI + ", nombreApe=" + nombreApe + ", grupoSang=" + grupoSang + ", fechaNac=" + fechaNac + ", celular=" + celular + ", codBrigada=" + codBrigada;
    }
    
    
}
