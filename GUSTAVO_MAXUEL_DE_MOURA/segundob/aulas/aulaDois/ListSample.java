package segundob.aulas.aulaDois;
import java.util.ArrayList;
import java.util.List;
public class ListSample {
    public static void main(String[] args) {
        List<String> listaNomes =  new ArrayList();
        listaNomes.add("Jacarezao");   
        listaNomes.add("Jacarezinho");   
        listaNomes.add("Mini Jacare");   
        listaNomes.add("Super Jacare");
        
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        listaNomes.remove(0);
       System.out.println(listaNomes);
    }
    


    
    
}
