package Clases;

public class ClsValidaciones{
    
    public boolean isEntero(String cadena) {
        if (cadena == null) {
            return false;
        }
        try {
            long d = Long.parseLong(cadena);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
        public boolean isDecimal(String cadena) {
        if (cadena == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(cadena);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public boolean isLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
}
