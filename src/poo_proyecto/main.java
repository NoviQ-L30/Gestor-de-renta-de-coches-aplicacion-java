package poo_proyecto;

public class main {

    public static void main(String args[]) {
        Conexion db = new Conexion();
        db.conectar();
         new main().run();
       
    }
    public void run() {
        Inicio_Sesion mostrar=new Inicio_Sesion();
        mostrar.setVisible(true);
    }
}
