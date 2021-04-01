
package FormulariosCrucero;


public class clsVariablesViaje {



    public  int getCodigoBuque() {
        return codigoBuque;
    }

     protected static int codigoViaje;
    protected static int codigoBuque;
    protected static int numeroPersonas;
    protected static int nivelBarco;
    protected static int numeroCamarote;

    public  void setCodigoBuque(int codigoBuque) {
        clsVariablesViaje.codigoBuque = codigoBuque;
    }
    
    public int getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(int codigoViaje) {
        clsVariablesViaje.codigoViaje = codigoViaje;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        clsVariablesViaje.numeroPersonas = numeroPersonas;
    }

    public int getNivelBarco() {
        return nivelBarco;
    }

    public void setNivelBarco(int nivelBarco) {
        clsVariablesViaje.nivelBarco = nivelBarco;
    }

    public int getNumeroCamarote() {
        return numeroCamarote;
    }

    public void setNumeroCamarote(int numeroCamarote) {
        clsVariablesViaje.numeroCamarote = numeroCamarote;
    }

    
}
