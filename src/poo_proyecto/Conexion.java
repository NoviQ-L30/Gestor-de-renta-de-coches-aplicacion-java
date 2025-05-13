package poo_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String url = "jdbc:mysql://127.0.0.1:3306/Venta_Coches";
    private static String user = "root";
    private static String pass = "ciruelo242";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR"+e);
        }
    }

    public Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSA");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXIÓN"+e);
        }
        return con;
    }

}
