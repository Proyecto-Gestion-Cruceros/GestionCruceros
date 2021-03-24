package Clases.Personas;

public class clsUsuarios extends ClsPersona {

    protected static int Cargo;
    protected static String Contrasenia;

    public static int getCargo() {
        return Cargo;
    }

    public static void setCargo(int Cargo) {
        clsUsuarios.Cargo = Cargo;
    }

    public static String getContrasenia() {
        return Contrasenia;
    }

    public static void setContrasenia(String Contrasenia) {
        clsUsuarios.Contrasenia = Contrasenia;
    }

        //Metodos deL Crud
    
    @Override
    public void AgregarPersona(){
        
    }
    
    
    @Override
    public void ActualizarPersona(){
        
    }
    
    
    @Override
    public void EliminarPersona(){
        
    }
    
    
    @Override
    public void VerPersonas(){
        
    }
}
