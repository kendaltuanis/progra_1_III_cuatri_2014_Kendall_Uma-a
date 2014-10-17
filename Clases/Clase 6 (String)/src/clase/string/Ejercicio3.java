
package clase.string;

/**
 *
 * @author Kendall
 */
public class Ejercicio3 {
    
    public String Rote(String palabra){
    
        String temp="";
        
        for (int i = 0; i < palabra.length(); i--) {
            
           temp+=palabra.charAt(i-1);
        }
        
           return temp;
    }
    
 
    
}
