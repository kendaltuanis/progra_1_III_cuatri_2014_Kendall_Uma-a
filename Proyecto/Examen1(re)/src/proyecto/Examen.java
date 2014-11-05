package proyecto;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        char continuar = ' ';
 
        

        do {

            System.out.println("Digite la opción que desea : ");
            System.out.println("1. Primer ejercicio");
            System.out.println("2. Segundo ejercicio");
            System.out.println("3. Salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Inserte la palabra a editar y los saltos que desea");
                    
                    Ejercicio1 ejercicio1 = new Ejercicio1(teclado.next(),teclado.nextInt());   //agrego la palabra y los saltos.
                    ejercicio1.letras();
                    System.out.println(ejercicio1.numerosyResultado());

                    break;

                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    System.out.println("Inserte el monto de dinero para el desglose");
                
                    System.out.println(ejercicio2.dinero(teclado.nextInt()));  

                    break;
                    
                case 3:
                    
                    System.exit(0);

                default:
                    System.out.println("Opción equivocada: Vuelva a ingresar un número.");

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar S/N?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }

}
