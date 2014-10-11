package clase8;

import java.util.Scanner;

public class Clase8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        char continuar = ' ';

        do {
            System.out.println("Digite la opción del ejercicio a evaluar");
            
            System.out.println("1.Primer Ejercicio ");
            System.out.println("2.Segundo Ejercicio ");
            System.out.println("3.Tecercer Ejercicio ");
            System.out.println("4.Salir ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    Problema1 problema1 = new Problema1();
                    for (int i = 0; i < 8; i++) {

                        System.out.println("Digite el elemento # " + (i + 1));
                        problema1.AgregarElemento(teclado.nextInt());

                    }
                    System.out.println("El valor acumulado es " + problema1.valorAcomulado());
                    System.out.println(problema1.Numero36());
                    System.out.println(problema1.Numero50());

                    break;

                case 2:
                    
                    Problema2 problema2 = new Problema2();
                    for (int i = 0; i < 4; i++) {

                        System.out.println("Digite el elemento # " + (i + 1));
                        problema2.Agregarvector1(teclado.nextInt());      

                    }
                     for (int i = 4; i < 8; i++) {

                        System.out.println("Digite el elemento # " + (i + 1));
                        problema2.Agregarvector2(teclado.nextInt());      

                    }
                    
                    System.out.println(problema2.resultado());

                    break;

                case 3:
                    Problema3 problema3 = new Problema3();
                    for (int i = 0; i < 5; i++) {

                        System.out.println("Digite la nota del Curso A del estudiante # " + (i + 1));
                        problema3.AgregarCursoA(teclado.nextFloat());

                    }
                     for (int i = 0; i < 5; i++) {

                        System.out.println("Digite la nota del Curso B del estudiante # " + (i + 1));
                          problema3.AgregarCursoB(teclado.nextFloat());


                    }
                     
                     System.out.println(problema3.mayorPromedio());
                    

                    break;

            }
            System.out.println("\n");
            System.out.println("¿Desea continuar con otro ejercicio?");
            continuar = teclado.next().charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

    }

}
