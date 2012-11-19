package br.ufpb.agenda;

public class ProgramaExercicio5 {
  
    public static void main(String[] args) {
       
        Agenda agenda = new Agenda();
        
        agenda.adicionarContato("Jos�","32345098");
        
        try{
             agenda.pesquisarContato("Jos�");
             
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
