package clase.string;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase6String {

    public static void main(String[] args) {

        int opcion = 0;
        char continuar = ' ';
        Scanner teclado = new Scanner(System.in);
        

        String correo;
        

        do {

            System.out.println("Digite la opción que desea : ");
            System.out.println("1. Primer ejercicio");
            System.out.println("2. Segundo ejercicio");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Digite el correo a evaluar");
                    Ejercicio1 oejercicio1 = new Ejercicio1(teclado.nextLine());
                    System.out.println(oejercicio1.ValirCorreo());
                    break;

                case 2:
                    System.out.println("Digite una cadena de carácteres");
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.setCadena(teclado.next());
                    System.out.println("La mitad de la cadena es " +ejercicio2.MediaCadena());
                    System.out.println("El último valor es "+ejercicio2.UltimoValor());
                    System.out.println("La cadena alrevez es "+ejercicio2.Alrevez());
                    System.out.println("La cadena con guiones es " +ejercicio2.Guion());
                    System.out.println("Tiene " +ejercicio2.Vocales()+" vocales");
                    System.out.println(ejercicio2.Palindromo());


            }
            System.out.println("\n");
            System.out.println("¿Desea continuar S/N?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }

}
