package proyecto;

public class Ejercicio3 {
    
    private String palabra;
    private int saltos;
    String resultado = "";
    int temp = 0;
    String temp2 = "";
    
    int C;
    
    public Ejercicio3(String palabra, int saltos) {
        
        this.palabra = palabra;
        this.saltos = saltos;
    }
    
    char[] abeceMinu = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] abeceMayu = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    public void letrasMinus() {
        
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j <= abeceMinu.length; j++) {
                
                if (palabra.charAt(i) == abeceMinu[j]) {
                    
                    if ((j + saltos) > abeceMinu.length - 1) {
                        
                        temp = ((j + saltos) - (abeceMinu.length - 1));
                        resultado += "" + abeceMinu[temp - 1];
                        temp2 += "" + abeceMinu[temp - 1];
                        
                    } else {
                        
                        resultado += "" + abeceMinu[j + saltos];
                        temp2 += "" + abeceMinu[j + saltos];
                    }
                    
                } else {
                    
                    temp2 += palabra.charAt(i);
                    
                }
                
            }
            
        }
        
        for (int i = 0; i < temp2.length(); i++) {
            
            for (int j = 0; j <= abeceMayu.length - 1; j++) {
                
                if (temp2.charAt(i) == abeceMayu[j]) {
                    
                    if ((j + saltos) > abeceMayu.length - 1) {
                        
                        temp = ((j + saltos) - (abeceMayu.length - 1));
                        resultado += "" + abeceMayu[temp - 1];
                        
                    } else {
                        
                        resultado += "" + abeceMayu[j + saltos];
                        
                    }
                } else {
                    
                    resultado += temp2.charAt(i);
                }
                
            }
            
        }
        
    }
    
}
