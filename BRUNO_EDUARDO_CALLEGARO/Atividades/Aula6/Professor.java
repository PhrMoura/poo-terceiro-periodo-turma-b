package Atividades.Aula6;

public class Professor {
        String nome; 

        String materia; 
    
        public void apresentarse() { 
            String msg = "Olá! Sou o professor(a):"
            .concat(nome)
            .concat(" e vou lecionar ")
            .concat(materia);
    
            System.out.println(msg);
    
            Professor profeUm = new Professor(); 
            Professor oMelhorProfe = new Professor();
            
            profeUm.nome = "Roberto"; 
            profeUm.materia = "Projeto de Software"; 
    
            oMelhorProfe.nome = "Sandro"; 
            oMelhorProfe.materia = "POO"; 
    
            oMelhorProfe.apresentarse();
    
            
        }
           
        
          
    
        
        
    }
   


   

