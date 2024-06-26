
package segundob.listas;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class ListaDois {
   //Atv 1
    public static void main(String[] args) {
       
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                                             .filter(numero -> numero % 2 == 0)
                                             .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);
        //atv 2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");

        List<String> nomesMaiusculas = nomes.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());

        System.out.println("Nomes em maiúsculas: " + nomesMaiusculas);
        //atv 3
         
         List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

         
         Map<String, Long> contagemPalavras = palavras.stream()
                                                      .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
 
       
         contagemPalavras.forEach((palavra, contagem) -> System.out.println(palavra + ": " + contagem));
         //atv 4
          // Lista de produtos
        List<Produto> produtos = Arrays.asList(
            new Produto("Produto A", 150.00),
            new Produto("Produto B", 80.00),
            new Produto("Produto C", 120.00),
            new Produto("Produto D", 50.00)
    );

    
    List<Produto> produtosFiltrados = produtos.stream()
                                              .filter(produto -> produto.getPreco() > 100.00)
                                              .collect(Collectors.toList());

    
    produtosFiltrados.forEach(System.out::println);
    //atv 5
     
     double somaTotal = produtos.stream()
     .mapToDouble(Produto::getPreco)
     .sum();

System.out.println("Soma total dos produtos: R$ " + somaTotal);
//atv 6 
List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        
        List<String> palavrasOrdenadas = linguagens.stream()
                                                 .sorted((p1, p2) -> Integer.compare(p1.length(), p2.length()))
                                                 .collect(Collectors.toList());

        
        System.out.println("Palavras ordenadas por tamanho: " + palavrasOrdenadas);

    }
}

