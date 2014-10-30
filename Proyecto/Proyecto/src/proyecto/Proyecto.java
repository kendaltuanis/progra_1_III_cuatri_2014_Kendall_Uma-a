package proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0, saltos;
        char continuar = ' ';
        String palabra = "";

        do {

            System.out.println("Digite la opción que desea : ");
            System.out.println("1. Primer ejercicio");
            System.out.println("2. Segundo ejercicio");
            System.out.println("3. Salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Inserte la palabra a editar y los saltos que desea");
                    palabra = teclado.next();
                    saltos = teclado.nextInt();
                    Ejercicio1 ejercicio1 = new Ejercicio1(palabra, saltos);

                    ejercicio1.letrasMinus();

                    System.out.println(ejercicio1.numeros());

                    break;

                case 2:
                    break;

                default:
                    System.out.println("Error");

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar S/N?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }

}
