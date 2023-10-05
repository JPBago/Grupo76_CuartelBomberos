/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.coneccion;

import grupo76_cuartelbomberos.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            ps.setInt(6, bombero.getBrigada().getCodBrigada());
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
            ps.setInt(6, bom.getBrigada().getCodBrigada());
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
    
    public List<Bomberos>listarBomberosActivos(){
        List<Bomberos>listaBom=new ArrayList<>();
        Bomberos bom;
        String sql="SELECT * FROM bombero Where activo = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next())  {
                bom = new Bomberos();
                bom.setCodBombero(rs.getInt("codBombero"));
                bom.setDNI(rs.getInt("DNI"));
                bom.setNombreApe(rs.getString("nombreApe"));
                bom.setGrupoSang(rs.getString("grupoSang"));
                bom.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                bom.setCelular(rs.getString("celular"));
                listaBom.add(bom);  
            }
            rs.close();
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Bombero\n"+ex.getMessage());
        }
        
        return listaBom;
    }
    
    public List<Bomberos>listarBomberosXBrigada(int codBrigada){
        List<Bomberos>listaBom=new ArrayList<>();
        Bomberos bom;
        String sql="SELECT * FROM bombero WHERE codBrigada=? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codBrigada);
            ResultSet rs= ps.executeQuery();
            while (rs.next())  {
                bom = new Bomberos();
                bom.setCodBombero(rs.getInt("codBombero"));
                bom.setDNI(rs.getInt("DNI"));
                bom.setNombreApe(rs.getString("nombreApe"));
                bom.setGrupoSang(rs.getString("grupoSang"));
                bom.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                bom.setCelular(rs.getString("celular"));
                Brigada brig=new Brigada();
                brig.setCodBrigada(rs.getInt("codBrigada"));
                bom.setBrigada(brig);
                listaBom.add(bom);  
            }
            rs.close();
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Bombero\n"+ex.getMessage());
        }
        
        return listaBom;
    }
}
