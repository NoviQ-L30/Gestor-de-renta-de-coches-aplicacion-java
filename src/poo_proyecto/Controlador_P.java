package poo_proyecto;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador_P {

    PreparedStatement ps;
    ResultSet rs;
    Conexion con = new Conexion();
    Connection acceso;

    public void insertar(Autos_BD lib) {

        try {
            String sql = "insert into Renta3(Id_Rastreo,Fecha_Ini_Renta,Fecha_Ter_Renta,Costo,Metodo_Pago,Costos_Extra) values(?,?,?,?,?,?)";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, lib.getIdRastreo());
            ps.setObject(2, lib.getFechaIni());
            ps.setObject(3, lib.getFechaTer());
            ps.setObject(4, lib.getCosto());
            ps.setObject(5, lib.getMetodoPago());
            ps.setObject(6, lib.getCostosExtra());
            ps.executeUpdate();

        } catch (SQLException e) {
        }

    }

    public ArrayList<Autos_BD> consulta() {
        
        ArrayList<Autos_BD> listaPrestamo = new ArrayList<>();

        try {

            String sql = "select * from Renta3";
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Autos_BD lib = new Autos_BD();
                lib.setIdRastreo(rs.getString(1));
                lib.setFechaIni(rs.getString(2));
                lib.setFechaTer(rs.getString(3));
                lib.setCosto(rs.getString(4));
                lib.setMetodoPago(rs.getString(5));
                lib.setCostosExtra(rs.getString(6));
                listaPrestamo.add(lib);
            }

        } catch (SQLException e) {
        }

        return listaPrestamo;
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