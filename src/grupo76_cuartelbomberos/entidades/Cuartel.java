package grupo76_cuartelbomberos.entidades;

public class Cuartel {

    private int codCuartel;
    private String nombreCuartel;
    private String direccion;
    private double coord_X;
    private double coord_Y;
    private String telefono;
    private String email;

    public Cuartel() {
    }

    public Cuartel(String nombreCuartel, String direccion, double coord_X, double coord_Y, String telefono, String email) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.email = email;
    }

    public Cuartel(int codCuartel, String nombreCuartel, String direccion, double coord_X, double coord_Y, String telefono, String email) {
        this.codCuartel = codCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "codCuartel=" + codCuartel + ", nombreCuartel=" + nombreCuartel
                + ", direccion=" + direccion + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y
                + ", telefono=" + telefono + ", email=" + email;
    }

}
