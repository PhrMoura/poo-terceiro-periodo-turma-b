package primeirob.lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import primeirob.lista05.models.Cliente;
import primeirob.lista05.models.Loja;
import primeirob.lista05.models.Vendedor;
import primeirob.lista06.models.Endereco;
import primeirob.lista06.models.Item;
import primeirob.lista06.models.Pedido;
import primeirob.lista06.models.ProcessaPedido;

public class UtilityPedido {
    public static Pedido processarPedido () {
        System.out.println("Processar Pedidos");

        System.out.println("Escolha um Item:");
        List<Item> listaItems = ListaItems.retriveListaItems();
        List<Long> listaIds = new ArrayList<Long>();
        List<Long> listaSelecionados = new ArrayList<Long>();
        
        listaItems.forEach(item -> listaIds.add(item.id));

        listaItems.forEach(item -> {
            if (!listaSelecionados.contains(item.id)) {
                item.gerarDescricao();
            }
        });

        Scanner actionInput = new Scanner(System.in);
        Scanner itemInput = new Scanner(System.in);
        Integer action = -1;
        Boolean condition = false;

        while (condition == false) {
            System.out.println("======= Adicionar um novo item? =======");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Não");

            action = actionInput.nextInt();
            switch (action) {
                case 1:
                    listaItems.forEach(item -> {
                        if (!listaSelecionados.contains(item.id)) {
                            item.gerarDescricao();
                        }
                    });
                    System.err.println("Escolha um item pelo id:");
                    Long selecionado = itemInput.nextLong();
                    if (listaIds.contains(selecionado)) {
                        listaSelecionados.add(selecionado);
                    } else {
                        System.err.println("Item não existe");
                    }
                    break;
                case 2:
                    condition = true;
                    break;
                default:
                    break;
            }
        }    

        System.err.println("\nItems escolhidos:");
        List<Item> listaSelect = new ArrayList<Item>(); 
        listaSelecionados.forEach(id -> {
            // Encontrar o item correspondente na listaItems
            Item itemCorrespondente = listaItems.stream()
                                                .filter(item -> item.id == id)
                                                .findFirst()
                                                .orElse(null);
            
            // Verificar se o item foi encontrado
            if (itemCorrespondente != null) {
                listaSelect.add(itemCorrespondente); // Adicionar o item encontrado à listaSelect
            } else {
                System.err.println("Item com ID " + id + " não encontrado.");
            }
        });



        Cliente cliente = new Cliente();
        cliente.endereco = new Endereco();
        cliente.endereco.setEndereco("Cascavel", "Basd", "Ruasd");
        cliente.idade = 11;
        cliente.nome = "Teste";

        Loja loja = new Loja();
        loja.endereco = new Endereco();
        loja.endereco.setEndereco("Cascavel", "sad", "adsa");
        loja.nomeFantasia = "Nome Fantasia";
        loja.nomeSocial = "Nome Social";

        Vendedor vendedor = new Vendedor();
        vendedor.endereco = new Endereco();
        vendedor.endereco.setEndereco("Cascavel", "Teste", "teste");
        vendedor.idade = 20;
        vendedor.salarioBase = 10.0;
    
        return ProcessaPedido.processar(listaSelect, null, null, null);
    }
}
