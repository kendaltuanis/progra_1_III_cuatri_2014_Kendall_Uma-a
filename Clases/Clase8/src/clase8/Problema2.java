

package clase8;


public class Problema2 {
    
    int[] vector1 = new int[4];
    int[] vector2 = new int[4];
    int[] vectortotal = new int[8];
    
    
    public void Agregarvector1(int elemento) {

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] == 0) {

                vector1[i] = elemento;
                break;
            }

        }
    }
        
        public void Agregarvector2(int elemento) {

        for (int i = 0; i < vector2.length; i++) {
            if (vector2[i] == 0) {

                vector2[i] = elemento;
                break;
            }

        }
        
    }
        
        public int resultado(){
            int vectoruno=0;
            int vectordos=0;
        
            for (int i = 0; i < vector1.length; i++){
            
              vectoruno+=vector1[i];
            }
            
             for (int i = 0; i < vector2.length; i++){
            
              vectordos+=vector2[i];
            }
             int total= vectoruno+vectordos;
            
            
         return total;   
        }
        
    }
    

