import java.util.HashMap;

public class Lista3 {
    private static HashMap<Integer, HashMap<Integer, Integer>> vendasPorMes = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora da Dona Gabrielinha!");
        System.out.println("1. Calcular preço total");
        System.out.println("2. Calcular troco");
        System.out.println("3. Salvar quantidade de vendas por dia");
        System.out.println("4. Buscar quantidade de vendas total pelo mês e dia");
        System.out.println("5. Sair");

        int opcao = 1;
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                salvarQuantidadeVendasPorDia();
                break;
            case 4:
                buscarQuantidadeVendasPorMesEDia();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void salvarQuantidadeVendasPorDia() {
        int quantidade = 20; 
        int dia = 10; 
        int mes = 3; 
        vendasPorMes.putIfAbsent(mes, new HashMap<>());
        vendasPorMes.get(mes).put(dia, quantidade);

        System.out.println("Quantidade de vendas salva para o dia " + dia + " do mês " + mes);
    }
    private static void buscarQuantidadeVendasPorMesEDia() {
        int dia = 10; 
        int mes = 3; 
        int quantidade = vendasPorMes.getOrDefault(mes, new HashMap<>()).getOrDefault(dia, 0);
        if (quantidade > 0) {
            System.out.println("Quantidade de vendas para o dia " + dia + " do mês " + mes + ": " + quantidade);
        } else {
            System.out.println("Nenhuma venda registrada para o dia " + dia + " do mês " + mes);
        }
    }

}

    
  

        

  
    
    


   