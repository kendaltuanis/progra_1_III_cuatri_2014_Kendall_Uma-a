

package clase2;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase2 {

   
    public static void main(String[] args) {
       
       boolean validar=true;
       int opcion;
       char continuar;
       double monto;
       
       cuentaBancaria ocuentaBancaria=new cuentaBancaria();
       Scanner teclado =new Scanner(System.in);
       
       while(validar){
           System.out.println("Digite 1 si quiere realizar un depósito y 2 si quiere realizar un retiro");
           teclado =new Scanner(System.in);
           opcion=teclado.nextInt();
           
           if(opcion==1)
           {
               System.out.println("Digite el monto a depósitar");
               monto=teclado.nextDouble();
               ocuentaBancaria.Deposito(monto);
           }
           
           if(opcion==2){
           
               System.out.println("Digite el monto a retirar");
               teclado =new Scanner(System.in);
               monto=teclado.nextDouble();
               ocuentaBancaria.Retiro(monto);
               if (ocuentaBancaria.isHayError())
               {
                   System.out.println("El monto que usted va a retirar no puede ser retirado");
               }
           }
           
           System.out.println("El saldo final es de "+ ocuentaBancaria.getSaldoInicial());
           System.out.println("Desea continuar con otra transacción S/N ");
           teclado =new Scanner(System.in);
           continuar=teclado.nextLine().charAt(0);
           if((continuar=='S') ||(continuar=='s'))
           {
               validar=true;
           
           }
          
           if((continuar=='N') ||(continuar=='n'))
           validar=false;
           
              
           }
       
       }
        
    }
    

