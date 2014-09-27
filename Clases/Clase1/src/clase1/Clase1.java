
package clase1;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase1 {

    
    public static void main(String[] args) {
        
        double horasTrabajadas=0, costoHora=0, salario=0;
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("Digite las horas laboradas por el trabajador"+ "\n" );
        horasTrabajadas=Double.parseDouble(teclado.nextLine());
        
        System.out.println("Digite el costo por hora" + "\n");
        costoHora=Double.parseDouble(teclado.nextLine());
        
        salario=horasTrabajadas*costoHora;
        System.out.println("El salario final es "+ salario);
        
       
        
    }
    
}
