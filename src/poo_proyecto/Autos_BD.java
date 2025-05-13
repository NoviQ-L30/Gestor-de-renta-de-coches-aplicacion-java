package poo_proyecto;


public class Autos_BD {
    
    private String Auto;
    private String Vin;
    private String Modelo;
    private String Marca;
    private String Color;
    private String Tipo_Auto;
    
    private String Id_Rastreo;
    private String Fecha_Ini;
    private String Fecha_Ter;
    private String Costo;
    private String Metodo_Pago;
    private String Costos_Extra;
    
    private String Nombres;
    private String Apellidos;
    private String Email;
    private String Usuario;
    private String Contraseña;


    public Autos_BD(String Auto, String Vin, String Modelo, String Marca, String Color, String Tipo_Auto,String Id_Rastreo, String Fecha_Ini, String Fecha_Ter, String Costo, String Metodo_Pago, String Costos_Extra,String Nombres,String Apellidos,String Email,String Usuario,String Contraseña) {
        this.Auto = Auto;
        this.Vin = Vin;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Color = Color;
        this.Tipo_Auto = Tipo_Auto;
        this.Id_Rastreo = Id_Rastreo;
        this.Fecha_Ini = Fecha_Ini;
        this.Fecha_Ter = Fecha_Ter;
        this.Costo = Costo;
        this.Metodo_Pago = Metodo_Pago;
        this.Costos_Extra = Costos_Extra;
        
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Email = Email;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    

    public Autos_BD() {
    }

    public String getAuto() {
        return Auto;
    }

    public void setAuto(String Auto) {
        this.Auto = Auto;
    }

    public String getVin() {
        return Vin;
    }

    public void setVin(String Vin) {
        this.Vin= Vin;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo_Auto() {
        return Tipo_Auto;
    }

    public void setTipo_Auto(String Tipo_Auto) {
        this.Tipo_Auto = Tipo_Auto;
    }

    public String getIdRastreo() {
        return Id_Rastreo;
    }

    public void setIdRastreo(String Id_Rastreo) {
        this.Id_Rastreo = Id_Rastreo;
    }

    public String getFechaIni() {
        return Fecha_Ini;
    }

    public void setFechaIni(String Fecha_Ini) {
        this.Fecha_Ini = Fecha_Ini;
    }

    public String getFechaTer() {
        return Fecha_Ter;
    }

    public void setFechaTer(String Fecha_Ter) {
        this.Fecha_Ter = Fecha_Ter;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public String getMetodoPago() {
        return Metodo_Pago;
    }

    public void setMetodoPago(String Metodo_Pago) {
        this.Metodo_Pago = Metodo_Pago;
    }

    public String getCostosExtra() {
        return Costos_Extra;
    }

    public void setCostosExtra(String Costos_Extra) {
        this.Costos_Extra = Costos_Extra;
    }
//-----------------------------------------------------------------
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

     
}
