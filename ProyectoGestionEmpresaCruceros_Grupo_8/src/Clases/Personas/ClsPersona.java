package Clases.Personas;

public class ClsPersona {
    protected static String Identidad;
    protected static String Nombres;
    protected static String Apellidos;
    protected static String Telefono;
    protected static String CorreoElectronico;
    protected static String Estado;

    public static String getIdentidad() {
        return Identidad;
    }

    public static void setIdentidad(String Identidad) {
        ClsPersona.Identidad = Identidad;
    }

    public static String getNombres() {
        return Nombres;
    }

    public static void setNombres(String Nombres) {
        ClsPersona.Nombres = Nombres;
    }

    public static String getApellidos() {
        return Apellidos;
    }

    public static void setApellidos(String Apellidos) {
        ClsPersona.Apellidos = Apellidos;
    }

    public static String getTelefono() {
        return Telefono;
    }

    public static void setTelefono(String Telefono) {
        ClsPersona.Telefono = Telefono;
    }

    public static String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public static void setCorreoElectronico(String CorreoElectronico) {
        ClsPersona.CorreoElectronico = CorreoElectronico;
    }

    public static String getEstado() {
        return Estado;
    }

    public static void setEstado(String Estado) {
        ClsPersona.Estado = Estado;
    }

    public boolean AgregarPersona(){
        return false;
    }
    
    public boolean ActualizarPersona(){
        return false;
    }
    
    public boolean EliminarPersona(){
        return false;
    }  
}
