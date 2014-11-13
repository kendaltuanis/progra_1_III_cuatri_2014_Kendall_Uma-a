

package clase11;

import java.util.Scanner;


public class Clase11 {

    
    public static void main(String[] args) {
       
        Lineal lineal = new Lineal();
        Binario binario = new Binario();
        
        Scanner teclado = new Scanner(System.in);
        
        int[]arreglo={1,2,3,4,5,6,7,8,9};
        System.out.println("Agregar elemento");
        int elemento=teclado.nextInt();
        
        System.out.println("El index es "+lineal.busquedaLinea(arreglo, elemento)); 
        System.out.println("El index es "+binario.busquedaBinaria(arreglo, elemento));
        
        
        
    }
    
}
