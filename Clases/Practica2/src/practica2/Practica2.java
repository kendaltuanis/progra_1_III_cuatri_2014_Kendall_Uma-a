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
        Problema2 problema2 = new Problema2();
        Problema3 problema3 = new Problema3();
        Problema4 problema4 = new Problema4();
        Problema5 problema5 = new Problema5();

        int A;
        String hola;

        int opcion;
        char I = ' ';
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
                    A = teclado.nextInt(1);
                    System.out.println(" El mes es " + problema1.Meses(A));

                    break;
                case 2:
                    System.out.println("Ingrese un número ");
                    int i = teclado.nextInt();

                    System.out.println("El resultado es " + problema2.nose(i));

                    break;
                case 3:

                    System.out.println("Ingrese el estado de la nota");

                    I = teclado.next().charAt(0);

                    System.out.println(problema3.Revisado(I));

                    break;
                case 4:

                    System.out.println("Ingrese el año y el mes");
                    problema4.setYear(teclado.nextInt());
                    int mes = teclado.nextInt();

                    System.out.println(problema4.mes(mes));

                    break;

                case 5:

                    System.out.println(problema5.aleatorios());
                    
                    break;
                case 6:
                    System.out.println("Ingrese 2 números para la potencia");
                    hola=teclado.next();
                    

                default:
                    System.out.println("Opción Incorrecta");

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar S/N?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }

}
