package clase5;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Operaciones Op = new Operaciones();

        double n1;
        double n2;

        int opcion;
        char continuar = ' ';

        do {
            System.out.println("Digite la operación a evaluar"
                    + "\n 1. Suma"
                    + "\n 2. Resta"
                    + "\n 3. Multiplicación"
                    + "\n 4. División"
                    + "\n 5. Raiz"
                    + "\n 6 Potencia "
                    + "\n");

            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("Ingrese 2 números para la suma");

                    n1 = teclado.nextDouble();
                    n2 = teclado.nextDouble();

                    System.out.println(" La suma de los valores es "
                            + Op.Sumar(n1, n2));

                    break;
                case 2:

                    System.out.println("Ingrese 2 números para la resta");

                    n1 = teclado.nextDouble();
                    n2 = teclado.nextDouble();

                    System.out.println(" La resta de los valores es "
                            + Op.Resta(n1, n2));
                    break;
                case 3:

                    System.out.println("Ingrese 2 números para multiplicación");

                    n1 = teclado.nextDouble();
                    n2 = teclado.nextDouble();

                    System.out.println(" La multiplicación de los valores es "
                            + Op.Multiplicacion(n1, n2));

                    break;
                case 4:

                    System.out.println("Ingrese 2 números para la División");

                    n1 = teclado.nextDouble();
                    n2 = teclado.nextDouble();

                    System.out.println(" La División de los valores es "
                            + Op.Division(n1, n2));

                    break;

                case 5:

                    System.out.println("Ingrese 1 número para saber la raíz");

                    n1 = teclado.nextDouble();

                    System.out.println("La raiz del número es " + Op.Raiz(n1));
                    break;

                case 6:
                    System.out.println("Ingrese 2 números para la potencia");

                    n1 = teclado.nextDouble();
                    n2 = teclado.nextDouble();

                    System.out.println("La potencia es " + Op.Potencia(n1, n2));
                    break;

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }

}
