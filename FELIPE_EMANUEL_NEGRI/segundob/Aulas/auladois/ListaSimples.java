package segundob.Aulas.auladois;

import java.util.ArrayList;
import java.util.List;

public class ListaSimples {
    
    public static void main(String[] args) {
        
        List<String> ListaNome = new ArrayList<String>();

        ListaNome.add("Felipe");
        ListaNome.add("+");
        ListaNome.add("Sara");

        for (String nome : ListaNome) {
            System.out.println(nome);
        }

       // System.out.println(ListaNome.get(2));
        System.out.println("---------");
        
        
        ListaNome.forEach(nome -> System.out.println(nome));
       // System.out.println("---------");
        
       // ListaNome.removeIf(nome -> nome.contains("+"));
      //  System.out.println("---------");

      //  System.out.println(ListaNome);

        //REMOVER O ULTIMO ITEM DA LISTA
      //  ListaNome.remove(ListaNome.size() - 1);

    }


}
