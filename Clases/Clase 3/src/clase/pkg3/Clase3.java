

package clase.pkg3;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase3 {

   
    public static void main(String[] args) {
      
    int cantidad;
    int suma=0;
    
    Scanner teclado=new Scanner(System.in);
    
        System.out.println("Digite el # de impresiones que desea ver");
        cantidad=Integer.parseInt(teclado.nextLine());
        
        System.out.println("\n");
        
        for (int i = 0; i <cantidad; i++) {
            
            System.out.println(i);    
        }
        
        System.out.println("\n");
        System.out.println("Inverso");
        System.out.println("\n");
        
        for (int i = cantidad; i > 0; i--) {
            
             System.out.println(i);  
        }
        
        while(suma<=cantidad){
        
            System.out.print(suma);
            System.out.print(" - ");
            suma=suma+1;     
        }
        
        
        System.out.println("\n");
        suma=cantidad;
        while(suma>=0){
            
        
            System.out.print(suma);
            System.out.print(" - ");
            suma=suma-1;
        }
        System.out.println("\n");
        suma=0;
        do{
            System.out.print(suma);
            System.out.print(" _ ");
            suma=suma+1;
            
        }while(suma<=cantidad);
        
        System.out.println("\n");
        suma=cantidad;
        do{
            System.out.print(suma);
            System.out.print(" _ ");
            suma=suma-1;
            
        }while(suma>=0);
    }
    
}
