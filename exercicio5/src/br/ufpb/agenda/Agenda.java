
package br.ufpb.agenda;

import java.util.ArrayList;
import java.util.List;


public class Agenda implements AgendaIF {

    private List<Contato> contatos;
    
    
    public Agenda(){
        this.contatos = new ArrayList<Contato>();
    }
    
    public void adicionarContato(String nome, String tel) {
        
        this.contatos.add(new Contato(nome,tel));
    }

    public void removerContato(String nomeContato) throws ContatoInexistenteException {
        for(Contato aux: contatos){
            if(aux.getNome().equals(nomeContato)){
                contatos.remove(aux);
            }
        }
        throw new ContatoInexistenteException("Contato nao Cadastrado : " + nomeContato);
    }

   
    public Contato pesquisarContato(String nomeContato) throws ContatoInexistenteException {
        
        for(Contato aux: contatos){
            if(aux.getNome().equals(nomeContato)){
                return aux;
            }
        }
        throw new ContatoInexistenteException("Contato nao Cadastrado : " + nomeContato);
    }
    
    
}
