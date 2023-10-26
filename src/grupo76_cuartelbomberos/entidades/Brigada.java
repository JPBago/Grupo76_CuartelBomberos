package grupo76_cuartelbomberos.entidades;

public class Brigada {

    private int codBrigada;
    private String nombreBrigada;
    private Especialidad especialidad;
    private boolean libre;
    private Cuartel codCuartel;

    public Brigada() {
    }

    public Brigada(String nombreBrigada, Especialidad especialidad, boolean libre, Cuartel codCuartel) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad, boolean libre, Cuartel codCuartel) {
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
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
       + ", especialidad=" + especialidad.name() + ", libre=" + libre + ", codCuartel=" + codCuartel.getCodCuartel();
    }
    public String identificarBrigada(){
    return codBrigada+" - "+nombreBrigada;
}

}
