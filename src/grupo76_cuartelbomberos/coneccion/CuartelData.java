package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.Cuartel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = coneccionData.Conectar();
    }

    public void guardarCuartel(Cuartel cuar) {
        String sql = "INSERT INTO cuartel (nombreCuartel, direccion, coord_X, coord_Y, telefono, email) VALUES (?,?,?,?,?,?)";
        
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
                cuar.setCodCuartel(rs.getInt("insert_cod"));
                JOptionPane.showMessageDialog(null, "Bombero agregado correctamente.");
            }
            rs.close();
            ps.close();        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Cuartel nuevo:\n"+ex.getMessage());
        }
    }
}
