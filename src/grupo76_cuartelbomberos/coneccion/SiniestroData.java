package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con = null;

    public SiniestroData() {
        con = coneccionData.Conectar();
    }

    public int guardarSiniestro(Siniestro sin) {
        int codSiniestro = 0;

        String sql = "INSERT INTO siniestro (tipo, fechaSinietro, coord_X, coord_Y, detalles, codBrigada)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, sin.getTipo().name());
            ps.setObject(2, sin.getFechaSinietro());
            ps.setDouble(3, sin.getCoord_X());
            ps.setDouble(4, sin.getCoord_Y());
            ps.setString(5, sin.getDetalles());
            ps.setInt(6, sin.getBrigada().getCodBrigada());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                sin.setCodSiniestro(rs.getInt("insert_id"));
                codSiniestro = rs.getInt("insert_id");
                JOptionPane.showMessageDialog(null, "Incidente cargado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!\n" + ex.getMessage());
        }

        return codSiniestro;
    }

    public ArrayList<String[]> listarCuarteslesXEsp(String especialidad) {
        ArrayList<String[]> DatosXEsp = new ArrayList<>();

        String sql = "SELECT b.codBrigada, b.nombreBrig, c.nombreCuartel, c.codCuartel FROM bridaga b JOIN cuartel c "
                + "ON (b.codCuartel = c.codCuartel) WHERE especialidad = ? AND b.libre = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] datos = new String[4];
                datos[0] = rs.getInt("codBrigada") + "";
                datos[1] = rs.getString("nombreBrig");
                datos[2] = rs.getString("nombreCuartel");
                datos[3] = rs.getInt("codCuartel") + "";
                DatosXEsp.add(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SiniestroData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return DatosXEsp;
    }
}
