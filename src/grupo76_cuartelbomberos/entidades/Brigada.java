package grupo76_cuartelbomberos.entidades;

public class Brigada {

    private int codBrigada;
    private String nombreBrigada;
    private String especialidad;
    private boolean libre;
    private Cuartel codCuartel;

    public Brigada() {
    }

    public Brigada(String nombreBrigada, String especialidad, boolean libre, Cuartel codCuartel) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public Brigada(int codBrigada, String nombreBrigada, String especialidad, boolean libre, Cuartel codCuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Cuartel getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(Cuartel codCuartel) {
        this.codCuartel = codCuartel;
    }

    @Override
    public String toString() {
        return "codBrigada=" + codBrigada + ", nombreBrigada=" + nombreBrigada 
        + ", especialidad=" + especialidad + ", libre=" + libre + ", codCuartel=" + codCuartel.getCodCuartel();
    }

}
