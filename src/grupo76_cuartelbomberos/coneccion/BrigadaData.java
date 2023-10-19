package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bangho
 */
public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {
        con = coneccionData.Conectar();
    }

    public void NuevaBrigada(Brigada brig) {

        String sql = "INSERT INTO bridaga(nombreBrig, especialidad, libre, codCuartel)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brig.getNombreBrigada());
            ps.setString(2, brig.getEspecialidad().name());
            ps.setBoolean(3, brig.isLibre());
            ps.setInt(4, brig.getCodCuartel().getCodCuartel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            JOptionPane.showMessageDialog(null, "Cuartel agregado correctamente");
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel !!\n" + ex.getMessage());
        }
    }

    public void ModificarBrigada(Brigada brig) {
        String sql = "UPDATE bridaga SET nombreBrig=?,especialidad=?,libre=?,codCuartel=? WHERE codBrigada=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brig.getNombreBrigada());
            ps.setString(2, brig.getEspecialidad().name());
            ps.setBoolean(3, brig.isLibre());
            ps.setInt(4, brig.getCodCuartel().getCodCuartel());

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "La Brigada  ha sido Actualizado exitosamente . ");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada.\n" + ex.getMessage());
        }
    }

    public Brigada buscarBrigadaNom(String nom){
        Brigada brig = null;
        Cuartel cuar = null;
        String sql ="SELECT * FROM bridaga WHERE nombreBrig =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brig = new Brigada();
                brig.setCodBrigada(rs.getInt("codBrigada"));
                brig.setNombreBrigada(rs.getString("nombreBrig"));
                brig.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                cuar = new Cuartel();
                cuar.setCodCuartel(rs.getInt("codCuartel"));
                brig.setCodCuartel(cuar);
                brig.setLibre(rs.getBoolean("libre"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay brigada con el nombre" + nom, "ERROR", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA TABLA BRIGADA", "ERROR CRITICO", 2);
        }
        return brig;
    }
    
    public Brigada buscargarBrigada(int cod) {
        Brigada brig = null;
        Cuartel cuar = null;
        String sql = "SELECT * FROM bridaga WHERE codBrigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brig = new Brigada();
                brig.setCodBrigada(rs.getInt("codBrigada"));
                brig.setNombreBrigada(rs.getString("nombreBrig"));
                brig.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                cuar = new Cuartel();
                cuar.setCodCuartel(rs.getInt("codCuartel"));
                brig.setCodCuartel(cuar);
                brig.setLibre(rs.getBoolean("libre"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay brigada con el código" + cod, "ERROR", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR A LA TRABLA BRIGADA", "ERROR CRITICO", 2);
        }

        return brig;
    }

    public void eliminaBrigada(int codBrigada) {
        String sql = "UPDATE bombero SET activo=0 WHERE codBrigada=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            int uno = ps.executeUpdate();
            if (uno == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó la Brigada Correctamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la Tabla Brigada\n" + ex.getMessage());
        }
    }

    public void ocuparBrigada(int cod) {
        String sql = "UPDATE bridaga SET libre=? WHERE codBrigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, cod);

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "La Brigada " + cod + "  ha sido ocupada");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada.\n" + ex.getMessage());
        }
    }

    public void liberarBrigada(int cod) {
        String sql = "UPDATE bridaga SET libre=? WHERE codBrigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, cod);

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "La Brigada " + cod + "  ha sido liberada");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada.\n" + ex.getMessage());
        }
    }
}
