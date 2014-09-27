

package clase2;

/**
 *
 * @author Kendall
 */
public class cuentaBancaria {

    
    private double saldoInicial;
    private boolean hayError;
    
    
    public cuentaBancaria() {
         
        saldoInicial=0;
        hayError=false;
        
    }
    
    public void Deposito(double monto){
    
        setSaldoInicial(getSaldoInicial()+monto);
    }
    
    public void Retiro(double monto){
    
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial()-monto);
        else 
            setHayError(true);
    }
    
    

    public double getSaldoInicial() {
        return saldoInicial;
    }
    
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

    
    
   
    
}
