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
        char C ;

        int x, y;
        double n, m;

        boolean validar = true;
        int opcion;
        char continuar;
        double monto;
        int H;
        int L;
        double P;

        Scanner teclado = new Scanner(System.in);

        Problema1 problema1 = new Problema1();
        Problema2 problema2 = new Problema2();
        Problema3 problema3 = new Problema3();
        Problema4 problema4 = new Problema4();

         do{
           
            System.out.println("Digite el número de problema que deseas ver ");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            
            switch(opcion){
            case 1: 
                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();

                System.out.println("La suma de A y N es  " + problema1.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problema1.Resta(N, A));

                break;
                
            case 2:
                System.out.println("Digite el número X,Y,N y M"); 
                
                x= teclado.nextInt();
                y= teclado.nextInt();
                n= teclado.nextInt();
                m= teclado.nextInt();
                
                System.out.println("La suma de X y Y es  " + problema2.Suma(x, y));
                System.out.println("La resta de N y M es " + problema2.Resta(n,m));
                System.out.println("La multiplicación de X y M es " + problema2.Multiplicación(x, m));
                System.out.println("La división de N y Y es " + problema2.División(n, y));
                
                break;
                
            case 3:
                System.out.println("Digite un número N");   
                N = teclado.nextInt();
                
                System.out.println("El número incrementó en 77, decrementó en 3 y se duplicó para dar un valor de " + "\n"+ problema3.Operaciones(N));
                
                break;
    
            case 4:
                System.out.println("Salir");   
                break;
               
            case 5:
                System.out.println("Salir");   
                break;    
            case 6:
                System.out.println("Salir");   
                break;
            case 7:
                System.out.println("Salir");   
                break;    
            }
        
            System.out.println("Desea continuar con otra transacción S/N ");
           teclado =new Scanner(System.in);
           continuar=teclado.nextLine().charAt(0);       
         
        }while((continuar == 's')|| (continuar=='S'));

    }
}
