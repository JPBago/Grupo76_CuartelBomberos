package grupo76_cuartelbomberos.entidades;

import java.time.LocalDateTime;



public class Siniestro {

    private int codSiniestro;
    private Especialidad tipo;
    private LocalDateTime fechaSinietro;
    private double coord_X;
    private double coord_Y;
    private String detalles;
    private LocalDateTime fechaResoluc;
    private int puntuacion;
    private Brigada Brigada;

    public Siniestro() {
    }

    public Siniestro(Especialidad tipo, LocalDateTime fechaSinietro, double coord_X, double coord_Y, String detalles, LocalDateTime fechaResoluc, int puntuacion, Brigada codBrigada) {
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.puntuacion = puntuacion;
        this.Brigada = codBrigada;
    }

    public Siniestro(int cod_siniestro, Especialidad tipo, LocalDateTime fechaSinietro, double coord_X, double coord_Y, String detalles, LocalDateTime fechaResoluc, int puntuacion, Brigada codBrigada) {
        this.codSiniestro = cod_siniestro;
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.puntuacion = puntuacion;
        this.Brigada = codBrigada;
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public Especialidad getTipo() {
        return tipo;
    }

    public void setTipo(Especialidad tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaSinietro() {
        return fechaSinietro;
    }

    public void setFechaSinietro(LocalDateTime fechaSinietro) {
        this.fechaSinietro = fechaSinietro;
    }

    public double getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(double coord_X) {
        this.coord_X = coord_X;
    }

    public double getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(double coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFechaResoluc() {
        return fechaResoluc;
    }

    public void setFechaResoluc(LocalDateTime fechaResoluc) {
        this.fechaResoluc = fechaResoluc;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return Brigada;
    }

    public void setBrigada(Brigada Brigada) {
        this.Brigada = Brigada;
    }

    @Override
    public String toString() {
        return "Siniestro Nº " + codSiniestro + ", tipo=" + tipo.name()
                + ", fechaSinietro=" + fechaSinietro + ", detalles=" + detalles
                + ", fechaResoluc=" + fechaResoluc + ", puntuacion=" + puntuacion
                + ", codBrigada=" + Brigada.getCodBrigada();
    }

}
