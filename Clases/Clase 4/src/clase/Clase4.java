
package clase;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase4 {

    
    public static void main(String[] args) {
       
    int N;
    double A;
    char C = 'A';
    int ascii = (int) C; 
        
      Problema1 problemas =new Problema1();
      
      Scanner teclado=new Scanner(System.in);
      
        System.out.println("Digite el número N, A y C");
       
       N=teclado.nextInt();
       A=teclado.nextDouble();     
       ascii=(char) teclado.nextInt();
       
       System.out.println("La suma de A y N es  " + problemas.Suma(N, A) );
       
       System.out.println("La diferencia de A y N es " + problemas.Resta(N, A) );
       
       System.out.println("asdf " + ascii );
       
          
       
       
       
       
        
       
       
       
       
       
      
              
    }
    
}
