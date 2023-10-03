package grupo76_cuartelbomberos.entidades;

import java.time.LocalDate;



public class Siniestro {

    private int cod_siniestro;
    private String tipo;
    private LocalDate fechaSinietro;
    private double coord_X;
    private double coord_Y;
    private String detalles;
    private LocalDate fechaResoluc;
    private int puntuacion;
    private int codBrigada;

    public Siniestro() {
    }

    public Siniestro(String tipo, LocalDate fechaSinietro, double coord_X, double coord_Y, String detalles, LocalDate fechaResoluc, int puntuacion, int codBrigada) {
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public Siniestro(int cod_siniestro, String tipo, LocalDate fechaSinietro, double coord_X, double coord_Y, String detalles, LocalDate fechaResoluc, int puntuacion, int codBrigada) {
        this.cod_siniestro = cod_siniestro;
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public int getCod_siniestro() {
        return cod_siniestro;
    }

    public void setCod_siniestro(int cod_siniestro) {
        this.cod_siniestro = cod_siniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSinietro() {
        return fechaSinietro;
    }

    public void setFechaSinietro(LocalDate fechaSinietro) {
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

    public LocalDate getFechaResoluc() {
        return fechaResoluc;
    }

    public void setFechaResoluc(LocalDate fechaResoluc) {
        this.fechaResoluc = fechaResoluc;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "Siniestro Nº " + cod_siniestro + ", tipo=" + tipo
                + ", fechaSinietro=" + fechaSinietro + ", detalles=" + detalles
                + ", fechaResoluc=" + fechaResoluc + ", puntuacion=" + puntuacion
                + ", codBrigada=" + codBrigada;
    }

}
