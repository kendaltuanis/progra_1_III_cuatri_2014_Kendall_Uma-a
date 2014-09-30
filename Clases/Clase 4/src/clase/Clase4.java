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
        String Z;

        int x, y;
        double n, m;

        int a, b, c;

        int h, j, k, l;

        int opcion;
        char continuar;
        double monto;
        

        Scanner teclado = new Scanner(System.in);

        Problema1 problema1 = new Problema1();
        Problema2 problema2 = new Problema2();
        Problema3 problema3 = new Problema3();
        Problema5 problema5 = new Problema5();
        Problema6 problema6 = new Problema6();

        do {

            System.out.println("Digite el número de problema que deseas ver ");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            System.out.println("\n");

            switch (opcion) {
                case 1:
                    System.out.println("Digite el número N, A y C");
                    N = teclado.nextInt();
                    A = teclado.nextDouble();
                    C=teclado.next().charAt(0); 

                    System.out.println("La suma de A y N es  " + problema1.Suma(N, A));
                    System.out.println("La diferencia de A y N es " + problema1.Resta(N, A));
                    System.out.println(C + " es " + (int) C);

                    break;

                case 2:
                    System.out.println("Digite el número X,Y,N y M");

                    x = teclado.nextInt();
                    y = teclado.nextInt();
                    n = teclado.nextInt();
                    m = teclado.nextInt();

                    System.out.println("La suma de X y Y es  " + problema2.Suma(x, y));
                    System.out.println("La resta de N y M es " + problema2.Resta(n, m));
                    System.out.println("La multiplicación de X y M es " + problema2.Multiplicación(x, m));
                    System.out.println("La división de N y Y es " + problema2.División(n, y));

                    break;

                case 3:
                    System.out.println("Digite un número N");
                    N = teclado.nextInt();

                    System.out.println("El número incrementó en 77, decrementó en 3 "
                            + "y se duplicó para dar un valor de " + "\n" + problema3.Operaciones(N));

                    break;

                case 4:
                    System.out.println("Digite el número H,J,K y L");

                    h = teclado.nextInt();
                    j = teclado.nextInt();
                    k = teclado.nextInt();
                    l = teclado.nextInt();

                    Problema4 problema4 = new Problema4(h, j, k, l);

                    System.out.println("J toma el valor de K" + "\n" + problema4.getJ());
                    System.out.println("K toma el valor de H" + "\n" + problema4.getK());
                    System.out.println("H toma el valor de L" + "\n" + problema4.getH());
                    System.out.println("L toma el valor de J" + "\n" + problema4.getL());

                    break;

                case 5:
                    System.out.println("Digite un número A");
                    a = teclado.nextInt();

                    System.out.println(problema5.parImpar(a));

                    break;

                case 6:
                    System.out.println("Digite un número B");
                    b = teclado.nextInt();

                    System.out.println(problema6.positivoNegativo(b));

                    break;
                case 7:
                    System.out.println("Digite un número C");
                    c = teclado.nextInt();
                    Problema7 problema7 = new Problema7(c);
                    System.out.println(problema7.PositivoNegativo());
                    System.out.println(problema7.parImpar());
                    System.out.println(problema7.Multi5());
                    System.out.println(problema7.Multi10());
                    System.out.println(problema7.mayorMenor());
                    break;

                default:
                    System.out.println("Opción Incorrecta");

            }

            System.out.println("\n");
            System.out.println("Desea continuar con otra transacción S/N ");
            teclado = new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);

        } while ((continuar == 's') || (continuar == 'S'));

    }
}
