
package clase8;


public class Problema3 {
    
    float[] cursoA = new float[5];
    float[] cursoB = new float[5];
    
    
    
    public void AgregarCursoA(float A) {

        for (int i = 0; i < cursoA.length; i++) {
            if (cursoA[i] == 0) {

                cursoA[i] = A;
                break;
            }

        }
    }
    
    public void AgregarCursoB(float B) {

        for (int i = 0; i < cursoB.length; i++) {
            if (cursoB[i] == 0) {

                cursoB[i] = B;
                break;
            }

        }
    }
    
    public float PromedioA() {

        float sumaPromedio = 0;
        float promedio = 0;

        for (int i = 0; i < cursoA.length; i++) {
            sumaPromedio += cursoA[i];

        }
        promedio = sumaPromedio / cursoA.length;
        return promedio;
    }
    
    public float PromedioB() {

        float sumaPromedio = 0;
        float promedio = 0;

        for (int i = 0; i < cursoB.length; i++) {
            sumaPromedio += cursoB[i];

        }
        promedio = sumaPromedio / cursoB.length;
        return promedio;
    }
    
    
    
    
    
    
    public String mayorPromedio() {

        String personasAltas = "";
        String personasBajas = "";
        
        String retorno = "";
        
        
        

        float promedio1 = this.PromedioA();
        float promedio2 = this.PromedioB();
        

       
           
            if (PromedioA() > PromedioB()) {

                return "Las personas con mejor promedio fueron el promedio A con "+ PromedioA();
            } else {
                
                return "Las personas con mejor promedio fueron el promedio B con "+ PromedioB();

            }

        
        
                
      

    }
}
