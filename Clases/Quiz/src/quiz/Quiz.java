
package quiz;

import java.util.Scanner;


public class Quiz {

    
    public static void main(String[] args) {
     
        Ejercicio ejercicio = new Ejercicio();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 5 palabras");
        ejercicio.agregarPalabras();
        ejercicio.conver();
        System.out.println(ejercicio.comparar());
        
    }
    
}
