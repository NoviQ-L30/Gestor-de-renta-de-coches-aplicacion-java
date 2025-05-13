package poo_proyecto;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador_2 {

    PreparedStatement ps;
    ResultSet rs;
    Conexion con = new Conexion();
    Connection acceso;

    public void insertar(Autos_BD lib) {

        try {
            String sql = "insert into usuarios(Nombres,Apellidos,Email,Username,Contraseña) values(?,?,?,?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, lib.getNombres());
            ps.setObject(2, lib.getApellidos());
            ps.setObject(3, lib.getEmail());
            ps.setObject(4, lib.getUsuario());
            ps.setObject(5, lib.getContraseña());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        

    }

    public ArrayList<Autos_BD> consulta() {
        
        ArrayList<Autos_BD> listaAuto = new ArrayList<>();

        try {

            String sql = "select * from usuarios";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Autos_BD lib = new Autos_BD();
                lib.setNombres(rs.getString(1));
                lib.setApellidos(rs.getString(2));
                lib.setEmail(rs.getString(3));
                lib.setUsuario(rs.getString(4));
                lib.setContraseña(rs.getString(5));
                listaAuto.add(lib);
            }

        } catch (SQLException e) {
        }

        return listaAuto;
    }

     public void actualizar(Autos_BD lib) {
        String sql = "update Auto set Auto=?,Vin=?,Modelo=?,Marca=?,Color=?,Tipo_Auto=? where Vin=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
             ps.setObject(1, lib.getAuto());
            ps.setObject(2, lib.getVin());
            ps.setObject(3, lib.getModelo());
            ps.setObject(4, lib.getMarca());
            ps.setObject(5, lib.getColor());
            ps.setObject(6, lib.getTipo_Auto());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
     
    public void eliminar(String id) {
        String sql = "update Auto set Auto=? where Vin=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 0);
            ps.setObject(2, id);
            
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    } 
    
     public void habilitar(String id) {
        String sql = "update Auto set Auto=? where Vin=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, 1);
            ps.setObject(2, id);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
    } 
     
    
}
