package clase.pkg3;

public class Ejercicio1 {

    public Ejercicio1() {
    }

    /* Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1   
     hasta el valor ingresado de uno en uno.
     Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los nùmeros del 1 al 30
     */
    private String numeros="";
    
    public Ejercicio1(int numero){
        this.imprimirNumeros(numero);
    }
    
    private String imprimirNumeros(int numero) {

        
        for (int i = 0; i < 10; i++) {
            numeros+=getNumeros()+ i+"";
        }
        
        return (numeros);
        

    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }
    
    

}


