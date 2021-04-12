package Clases.Personas;

public class ClsPersona {
    protected static String Identidad;
    protected static String Nombres;
    protected static String Apellidos;
    protected static String Telefono;
    protected static String CorreoElectronico;
    protected static String Estado;
    protected static String direccionCliente;
    protected static String fechaNacimiento;
    protected static int Cargo;
    protected static String Contrasenia;
    protected static String Usuario;

    public static String getUsuario() {
        return Usuario;
    }

    public static void setUsuario(String Usuario) {
        ClsPersona.Usuario = Usuario;
    }
    
    public static int getCargo() {
        return Cargo;
    }

    public static void setCargo(int Cargo) {
        ClsPersona.Cargo = Cargo;
    }

    public static String getContrasenia() {
        return Contrasenia;
    }

    public static void setContrasenia(String Contrasenia) {
        ClsPersona.Contrasenia = Contrasenia;
    }
    
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

    public static String getDireccionCliente() {
        return direccionCliente;
    }

    public static void setDireccionCliente(String direccionCliente) {
        ClsPersona.direccionCliente = direccionCliente;
    }

    public static String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static void setFechaNacimiento(String fechaNacimiento) {
        ClsPersona.fechaNacimiento = fechaNacimiento;
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
