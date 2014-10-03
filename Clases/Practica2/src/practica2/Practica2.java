
package practica2;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Practica2 {

    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      Problema1 problema1 = new Problema1();
      
      int A;
      
      int opcion;
        char continuar = ' ';
       
        do {
            System.out.println("Digite la operación a evaluar"
                    + "\n 1."
                    + "\n 2."
                    + "\n 3."
                    + "\n 4."
                    + "\n 5."
                    + "\n 6 "
                    + "\n");

            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("Ingresar un número entre 1 y 12 ");
                    A=teclado.nextInt(1);
                    System.out.println(" El mes es "+ problema1.Meses(A));
  
                    break;
                case 2:

                    System.out.println("Ingrese 2 números para la resta");

                   
                    break;
                case 3:

                    System.out.println("Ingrese 2 números para multiplicación");

                   

                    break;
                case 4:

                    System.out.println("Ingrese 2 números para la División");

                    break;

                case 5:

                    System.out.println("Ingrese 1 número para saber la raíz");

                   

                case 6:
                    System.out.println("Ingrese 2 números para la potencia");

               
                default:
                    System.out.println("Opción Incorrecta");

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar S/N?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

        
    }
    
}
