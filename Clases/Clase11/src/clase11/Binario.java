
package clase11;


public class Binario {
    
    public int busquedaBinaria(int[] arreglo, int elemento) {

    int inicial=0,_final=arreglo.length-1;  
        
        
    while(inicial<_final){
    
        int central=(inicial+_final)/2;
        if(elemento>arreglo[central]){
        
            inicial= central+1;
        }
        else{
            
            if(elemento>arreglo[central]){
        
            inicial= central-1;
        }
            else{
                return central;
            }
            
            
        
            
        }
    }   
    
    
        return -1;

    }
    
    
    
    
}
