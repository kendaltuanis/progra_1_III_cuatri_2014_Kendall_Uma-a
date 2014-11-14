package quiz;

import java.util.Scanner;

public class Ejercicio {

    String[] palabras = new String[5];
    String[] palabrasMinu = new String[5];

    public void agregarPalabras() {

        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = teclado.next();

        }
    }

   public void conver(){
   
       for (int i = 0; i < palabras.length; i++) {
          palabrasMinu[i]= palabras[i].toLowerCase();
           
       }
   }
   
   public String comparar(){
       String temp="";
       int temp1=0;
   
       for (int i = 0; i < 5; i++) {
         
           if((i+1)==5){
               temp+=" "+palabras[i];
               
           }
           
           else{
           if(palabrasMinu[i].equals(palabrasMinu[i+1])){
               temp+=" "+palabras[i]+" "+palabras[i+1];

           }
           
           }
           
           
           
       }
       return temp;
   }
   
   
    
    
    
}
