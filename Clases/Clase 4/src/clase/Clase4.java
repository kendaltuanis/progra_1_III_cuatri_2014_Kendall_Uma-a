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

        int X, Y;
        double n, m;

        boolean validar = true;
        int opcion;
        char continuar;
        double monto;

        Scanner teclado = new Scanner(System.in);

        Problema1 problemas = new Problema1();
        Problema2 problema2 = new Problema2();
        Problema3 problema3 = new Problema3();
        Problema4 problema4 = new Problema4();

        while (validar) {
            System.out.println("Digite el número de problema que deseas ver ");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));

            }
            

            if (opcion == 2) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
            
             if (opcion == 3) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
             
              if (opcion == 4) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
              
              
               if (opcion == 5) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
               
                if (opcion == 6) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
                
                 if (opcion == 7) {

                System.out.println("Digite el número N, A y C");
                N = teclado.nextInt();
                A = teclado.nextDouble();
                C = (char) teclado.nextInt();

                System.out.println("La suma de A y N es  " + problemas.Suma(N, A));
                System.out.println("La diferencia de A y N es " + problemas.Resta(N, A));


                }
            

                

           
               

        }

    }
}
