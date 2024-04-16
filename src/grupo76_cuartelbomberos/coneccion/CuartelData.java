package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = coneccionData.Conectar();
    }

    public int guardarCuartel(Cuartel cuar) {
        String sql = "INSERT INTO cuartel (nombreCuartel, direccion, coord_X, coord_Y, telefono, email) VALUES (?,?,?,?,?,?)";
        int ID = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuar.getNombreCuartel());
            ps.setString(2, cuar.getDireccion());
            ps.setDouble(3, cuar.getCoord_X());
            ps.setDouble(4, cuar.getCoord_Y());
            ps.setString(5, cuar.getTelefono());
            ps.setString(6, cuar.getEmail());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ID = rs.getInt("insert_id");
                JOptionPane.showMessageDialog(null, "Cuartel agregado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar Cuartel nuevo:\n" + ex.getMessage());
        }
        return ID;
    }

    public void modificarCuartel(Cuartel cuartel) {
        String sql = "UPDATE cuartel SET nombreCuartel = ?, direccion = ?, coord_X = ?, coord_Y = ?, telefono = ?, email = ?  WHERE  codCuartel = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setDouble(3, cuartel.getCoord_X());
            ps.setDouble(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getEmail());
            ps.setInt(7, cuartel.getCodCuartel());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                System.out.println("El cuartel con ese ID no existe");

            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla cuartel \"" + ex.getMessage());

        }
    }

    public void eliminarCuartel(int codCuartel) {
        String sql = "DELETE FROM cuartel WHERE codCuartel = ?";
        Cuartel cuartel = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Cuartel borrado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
    }

    public Cuartel buscarCuartel(int cod) {
        Cuartel cuar = null;
        String sql = "SELECT * FROM cuartel WHERE codCuartel=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuar = new Cuartel();
                cuar.setCodCuartel(rs.getInt("codCuartel"));
                cuar.setNombreCuartel(rs.getString("nombreCuartel"));
                cuar.setDireccion(rs.getString("direccion"));
                cuar.setCoord_X(rs.getDouble("coord_X"));
                cuar.setCoord_Y(rs.getDouble("coord_Y"));
                cuar.setTelefono(rs.getString("telefono"));
                cuar.setEmail(rs.getString("email"));
                JOptionPane.showMessageDialog(null, "Busqueda por ID exitosa !!");
            } else {
                JOptionPane.showMessageDialog(null, " ID ERRONEA.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE BOMBEROS");
        }
        return cuar;
    }

    public Cuartel buscarCuartel(String nom) {
        Cuartel cuar = null;
        String sql = "SELECT * FROM cuartel WHERE nombreCuartel=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuar = new Cuartel();
                cuar.setCodCuartel(rs.getInt("codCuartel"));
                cuar.setNombreCuartel(rs.getString("nombreCuartel"));
                cuar.setDireccion(rs.getString("direccion"));
                cuar.setCoord_X(rs.getDouble("coord_X"));
                cuar.setCoord_Y(rs.getDouble("coord_Y"));
                cuar.setTelefono(rs.getString("telefono"));
                cuar.setEmail(rs.getString("email"));
                JOptionPane.showMessageDialog(null, "Busqueda por Nombre exitosa !!");
            } else {
                JOptionPane.showMessageDialog(null, "Nombre ERRONEO.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE BOMBEROS");
        }
        return cuar;
    }

    public Cuartel buscarCuartel(int cod, String nom) {
        Cuartel cuar = null;
        String sql = "SELECT * FROM cuartel WHERE codCuartel=? AND nombreCuartel=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setString(2, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuar = new Cuartel();
                cuar.setCodCuartel(rs.getInt("codCuartel"));
                cuar.setNombreCuartel(rs.getString("nombreCuartel"));
                cuar.setDireccion(rs.getString("direccion"));
                cuar.setCoord_X(rs.getDouble("coord_X"));
                cuar.setCoord_Y(rs.getDouble("coord_Y"));
                cuar.setTelefono(rs.getString("telefono"));
                cuar.setEmail(rs.getString("email"));
                JOptionPane.showMessageDialog(null, "Busqueda por ID y Nombre exitosa !!");
            } else {
                JOptionPane.showMessageDialog(null, "Combinación de ID y Nombre ERRONEA.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE BOMBEROS");
        }
        return cuar;
    }

    public List<Cuartel> listarCuartel() {
        ArrayList<Cuartel> listCuarteles = new ArrayList<>();
        Cuartel cuartel = null;
        String sql = "Select * FROM cuartel";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getDouble("coord_X"));
                cuartel.setCoord_Y(rs.getDouble("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setEmail(rs.getString("email"));

                listCuarteles.add(cuartel);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intenter ingresar a la tabla Cuartel");
        }

        return listCuarteles;
    }
}
