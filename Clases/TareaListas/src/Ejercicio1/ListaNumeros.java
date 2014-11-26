
package Ejercicio1;


class ListaNumeros {
    
    NodoNumero raiz;
    NodoNumero pares;
    NodoNumero impares;
    
    public String imprimir(){

    NodoNumero aux;
    String temporal="";
    
    aux=raiz;
    while(aux!=null){
        temporal+=aux.getNumero()+",";
        aux=aux.getSiguiente();
    }
    temporal+="\n";
    temporal+="Pares";
    
    aux=pares;
    while(aux!=null){
        temporal+=aux.getNumero()+",";
        aux=aux.getSiguiente();
    }
    temporal+="\n";
    temporal+="Impares";
    
    aux=impares;
    while(aux!=null){
        temporal+=aux.getNumero()+",";
        aux=aux.getSiguiente();
    }
    return temporal;
}
    
    
    
    
}




