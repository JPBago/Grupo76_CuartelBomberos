package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!");
        }

        return codSiniestro;
    }
    
    public void actualizarSiniestro(Siniestro sin){
        String sql = "UPDATE siniestro SET fechaResoluc=?,puntuacion=? "
                + "WHERE cod_siniestro=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(sin.getFechaResoluc()));
            ps.setInt(2, sin.getPuntuacion());
            ps.setInt(3, sin.getCodSiniestro());

            int aux = ps.executeUpdate();
            if (aux == 1){
                JOptionPane.showMessageDialog(null, "Reporte actualizado");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!");
        }

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
            JOptionPane.showMessageDialog(null, "No hay Cuarteles que cumplan los requisitos","ERROR !!",2);
        }

        return DatosXEsp;
    }

    public Siniestro buscarSiniestro(int cod) {
        Siniestro sin = null;
        Brigada brig = null;
        String sql = "SELECT * FROM siniestro WHERE cod_siniestro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(cod);
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSinietro");
                LocalDateTime localDateTime = LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                sin.setFechaSinietro(localDateTime);
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setCodBrigada(rs.getInt("codBrigada"));
                sin.setBrigada(brig);
            } else {
                JOptionPane.showMessageDialog(null, "No hay Reportes con el código " + cod,"ERROR !!",2);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Siniestros\n"+ex);
            System.out.println("Error: " + ex);
            sin = null;
        }

        return sin;
    }
    
    public ArrayList<Siniestro> listarSiniestros(){
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin; Brigada brig;
        String sql = "SELECT * FROM siniestro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSinietro");
                LocalDateTime localDateTime = LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                sin.setFechaSinietro(localDateTime);
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setCodBrigada(rs.getInt("codBrigada"));
                sin.setBrigada(brig);
                
                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay Reportes en la tabla Siniestros","ERROR !!",2);
//            System.out.println("Error: " + ex);
        }
        
        return listaSin;
    }
    
    public ArrayList<Siniestro> listarSiniestrosXFecha(Date fecha1, Date fecha2){
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin; Brigada brig;
        String sql = "SELECT * FROM siniestro WHERE fechaSinietro BETWEEN ? AND ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, fecha1);
            ps.setDate(2, fecha2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSinietro");
                LocalDateTime localDateTime = LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                sin.setFechaSinietro(localDateTime);
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setCodBrigada(rs.getInt("codBrigada"));
                sin.setBrigada(brig);
                
                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay Reportes en la tabla Siniestros para las fechas seleccionadas","ERROR !!",2);
//            System.out.println("Error: " + ex);
        }
        
        return listaSin;
    }
}
