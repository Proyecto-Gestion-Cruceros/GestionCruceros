package Clases.Cliente;

import Clases.Personas.ClsPersona;

/**
 *
 * @author edmej
 */
public class ClsClientes extends ClsPersona{
    
    
    public static String direccionCliente;

    public static String getDireccionCliente() {
        return direccionCliente;
    }

    public static void setDireccionCliente(String direccionCliente) {
        ClsClientes.direccionCliente = direccionCliente;
    }
    
    
    //METODOS
    
    @Override
    public void AgregarPersona()
    {
        
    }
    
    @Override
    public void ActualizarPersona()
    {
        
    }
    
    @Override
    public void EliminarPersona()
    {
        
    }
    
    
}
