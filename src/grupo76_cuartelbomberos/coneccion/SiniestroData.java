
package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class SiniestroData {
   private Connection con = null;

    public SiniestroData() {
        con = coneccionData.Conectar();
    }
   
   public int guardarSiniestro(Siniestro sin) {
       int codSiniestro=0; 
       
       String sql = "INSERT INTO siniestro (tipo, fechaSinietro, coord_X, coord_Y, detalles, codBrigada)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, sin.getTipo().name());
            ps.setDate(2, Date.valueOf(sin.getFechaSinietro()));
            ps.setDouble(3, sin.getCoord_X());
            ps.setDouble(4, sin.getCoord_Y());
            ps.setString(5, sin.getDetalles());
            ps.setInt(6, sin.getBrigada().getCodBrigada());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                sin.setCodSiniestro(rs.getInt("insert_id"));
                codSiniestro=rs.getInt("insert_id");
                JOptionPane.showMessageDialog(null, "Bombero agregado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!\n" + ex.getMessage());
        }
        
        return codSiniestro;
    }
}
