/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.Bomberos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bangho
 */
public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = coneccionData.Conectar();
    }

    public void guardarBombero(Bomberos bombero) {
        String sql = "INSERT INTO bombero (DNI, nombreApe, grupoSang, fechaNac, celular, codBrigada, activo)"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, bombero.getDNI());
            ps.setString(2, bombero.getNombreApe());
            ps.setString(3, bombero.getGrupoSang());
            ps.setDate(4, Date.valueOf(bombero.getFechaNac()));
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada().getCodBrigada());
            ps.setBoolean(7, bombero.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setCodBombero(rs.getInt("insert_id"));
                JOptionPane.showMessageDialog(null, "Bombero agregado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!\n" + ex.getMessage());
        }
    }

    public void ActualizarBombero(Bomberos bom) {
        String sql = "UPDATE bombero SET DNI=?,nombreApe=?,grupoSang=?,fechaNac=?,celular=?,codBrigada=? WHERE codBombero=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bom.getDNI());
            ps.setString(2, bom.getNombreApe());
            ps.setString(3, bom.getGrupoSang());
            ps.setDate(4, Date.valueOf(bom.getFechaNac()));
            ps.setString(5, bom.getCelular());
            ps.setInt(6, bom.getCodBrigada().getCodBrigada());
            ps.setInt(7, bom.getCodBombero());

            int uno = ps.executeUpdate(); // necesito un mejor nombre para la variale
            if (uno == 1) {
                JOptionPane.showMessageDialog(null, "El Bombero  ha sido Actualizado exitosamente . ");
            } else {
                JOptionPane.showMessageDialog(null, "Bombero no encontrado.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero.\n" + ex.getMessage());
        }
    }

    public void eliminarBombero(int codBombero){
        String sql= "UPDATE bombero SET activo=0 WHERE codBombero=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBombero);
            int uno =ps.executeUpdate();
            if (uno==1) {
               JOptionPane.showMessageDialog(null, "Se eliminó el Bombero Correctamente.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la Tabla Bombero\n"+ ex.getMessage());
        }   
    }
}
