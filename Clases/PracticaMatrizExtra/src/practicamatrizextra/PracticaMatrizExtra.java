package practicamatrizextra;

import java.util.Scanner;

public class PracticaMatrizExtra {

    public static void main(String[] args) {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        
        Scanner teclado = new Scanner(System.in);

        int menu = 0;
        char continuar = ' ';

        do {
            System.out.println("Menú" + "\n"
                    + "\n" + "1.Primer Ejercicio"
                    + "\n" + "2.Segundo Ejercicio"
                    + "\n" + "3.Tercer Ejercicio"
                    + "\n" + "4.Salir"+"\n");
            menu = teclado.nextInt();
            switch (menu) {

                case 1:
                    System.out.println("Agregue la dimensión de la matriz");
                    ejercicio1.iniciarMatriz(teclado.nextInt(), teclado.nextInt());
                    ejercicio1.llenar();
                    
                    System.out.println(ejercicio1.impresionPorFila());
                    System.out.println(ejercicio1.impresionTriangularSuperior()); 
                    System.out.println(ejercicio1.impresionTriangularInferior());

                    break;

                case 2:
                    System.out.println("Agregue la dimensión de la matriz");
                    ejercicio2.iniciarMatriz(teclado.nextInt(), teclado.nextInt());
                    ejercicio2.llenar();
                    
                    System.out.println(ejercicio2.diagonalSuperior());

                    break;
                    
                case 3:
                    
                    ejercicio3.llenar();
                    ejercicio3.mostrar_matriz();
                    break;
                    
            }
            System.out.println("\n");
            System.out.println("¿Desea continuar?");
            continuar = teclado.next().charAt(0);

        } while ((continuar == 's' || continuar == 'S'));

    }

}
