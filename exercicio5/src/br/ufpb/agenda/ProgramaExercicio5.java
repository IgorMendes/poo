package br.ufpb.agenda;

public class ProgramaExercicio5 {
  
    public static void main(String[] args) {
       
        Agenda agenda = new Agenda();
        
        agenda.adicionarContato("José","32345098");
        
        try{
             agenda.pesquisarContato("José");
             
             System.out.println("Contato Encontrado");
             
        } catch(ContatoInexistenteException e){
            
            System.err.println(e.getMessage());
            
        }
        
        try{
             agenda.pesquisarContato("Joao");
             
             System.out.println("Contato Encontrado");
        
        } catch(ContatoInexistenteException e){
            
            System.err.println(e.getMessage());
            
        }
       
        
        
    }
}
