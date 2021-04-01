
package FormulariosCrucero;

import javax.swing.table.DefaultTableModel;


public class clsVariablesViaje {

    public int getCodigoOperacion() {
        return codigoOperacion;
    }

    public void setCodigoOperacion(int codigoOperacion) {
        clsVariablesViaje.codigoOperacion = codigoOperacion;
    }

    protected static int codigoOperacion = 1;
    protected static DefaultTableModel model;
    protected static DefaultTableModel model1;
    protected static int codigoViaje = 0;
    protected static int codigoBuque = 0;
    protected static int numeroPersonas = 0;
    protected static int nivelBarco = 0;
    protected static int numeroCamarote = 0;

    public  void setCodigoBuque(int codigoBuque) {
        clsVariablesViaje.codigoBuque = codigoBuque;
    }
        public  int getCodigoBuque() {
        return codigoBuque;
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
