package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class ClsValidaciones {

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
    
    public boolean isLetras(JTextField txt) {
        try{
            Pattern pattern = Pattern.compile("^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$");

            Matcher mather = pattern.matcher(txt.getText());
            return mather.find();
        }catch(Exception ex){
            return false;
        }
        
    }

    public boolean isemail(String cadena) {
        try{
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(cadena);
            return mather.find();
        }catch(Exception ex){
            return false;
        }
        
    }

    public boolean isNumeroTel(String tel){
        if(tel.length() == 8){
            return true;
        }else{
            return false;
        }
    }
    
}
