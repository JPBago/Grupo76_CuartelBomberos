
package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.Brigada;
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
   
   public void NuevaBrigada(Brigada  brig) {
        
       
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel !!\n"+ ex.getMessage());
        }    
   }  
   
   public void ModificarBrigada(Brigada brig ){
       String sql = "UPDATE bridaga SET nombreBrig=?,especialidad=?,libre=?,codCuartel=? WHERE codBrigada=? ";
   
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brig.getNombreBrigada());
            ps.setString(2, brig.getEspecialidad().name());
            ps.setBoolean(3, brig.isLibre());
            ps.setInt(4, brig.getCodCuartel().getCodCuartel());
            
            int uno = ps.executeUpdate(); // necesito un mejor nombre para la variale
            if (uno == 1) {
                JOptionPane.showMessageDialog(null, "La Brigada  ha sido Actualizado exitosamente . ");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no encontrada.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada.\n" + ex.getMessage());
        }
   }
   
   public void eliminaBrigada(int codBrigada){
       String sql= "UPDATE bombero SET activo=0 WHERE codBrigada=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            int uno =ps.executeUpdate();
            if (uno==1) {
               JOptionPane.showMessageDialog(null, "Se eliminó la Brigada Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la Tabla Brigada\n"+ ex.getMessage());
        }
   }
   public void limpiar(){
       
   }
}

