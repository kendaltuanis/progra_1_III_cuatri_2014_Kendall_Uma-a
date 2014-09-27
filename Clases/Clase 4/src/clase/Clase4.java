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
        char C;
        
        int X, Y;
        double n,m;
        
  
        Problema1 problemas = new Problema1();
        Problema2 problema2 = new Problema2();
        Problema3 problema3 = new Problema3();
        Problema4 problema4 = new Problema4();
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el número N, A y C");

        N = teclado.nextInt();
        A = teclado.nextDouble();
        
        
        

        System.out.println("La suma de A y N es  " + problemas.Suma(N, A));

        System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));
        
        
        
        
        
        

    }

}
