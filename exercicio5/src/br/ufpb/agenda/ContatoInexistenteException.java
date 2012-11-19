
package br.ufpb.agenda;

public class ContatoInexistenteException extends Exception {
    
    public ContatoInexistenteException(){
        this("Contato inexistente");
    }
    public ContatoInexistenteException(String message){
        super(message);
    }
    
}
