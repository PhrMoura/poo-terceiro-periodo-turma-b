package atividades.atividade6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

public class mainAtividade6 {
    public static void main(String[] args) {

        Loja loja = new Loja();
        loja.nomeFantasia = "Myy Plant";
        loja.razãoSocial = "Gabrielinha's shop";
        loja.cidade = "Cascavel";
        loja.bairro = "Centro";
        loja.rua = "Av Brasil";
        loja.cnpj = "varios numeros de cnpj inseridos aqui";

        Vendedor vendedor1 = new Vendedor();
        vendedor1.loja = "Myy Plant";
        vendedor1.cidade = "Cascavel";
        vendedor1.nome = "Maylo";
        vendedor1.bairro = "shangrila";
        vendedor1.rua = "Morada de Judas";
        vendedor1.idade = 35;
        vendedor1.salarioRecebido = new ArrayList<Double>();
        vendedor1.salarioRecebido.add(1500.0);
        vendedor1.salarioRecebido.add(1600.0);
        vendedor1.salarioRecebido.add(1550.0);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.loja = "Myy Plant";
        vendedor2.cidade = "Cascavel";
        vendedor2.nome = "Bruno";
        vendedor2.bairro = "arabe";
        vendedor2.rua = "mahal habib";
        vendedor2.idade = 47;
        vendedor2.salarioRecebido = new ArrayList<Double>();
        vendedor2.salarioRecebido.add(1500.0);
        vendedor2.salarioRecebido.add(1500.0);
        vendedor2.salarioRecebido.add(1550.0);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Felipe";
        cliente1.cidade = "Cascavel";
        cliente1.bairro = "Lamal";
        cliente1.rua = "bingbong";
        cliente1.idade = 19;

        loja.vendedores = new ArrayList<Vendedor>();
        loja.vendedores.add(vendedor1);
        loja.vendedores.add(vendedor2);
        loja.clientes = new ArrayList<Cliente>();
        loja.clientes.add(cliente1);

        loja.apresentarse();
        loja.contarVendedores();
        loja.contarClientes();

        System.out.println("Vendedores:");
        Iterator<Vendedor> iteratorVendedor = loja.vendedores.iterator();
        while (iteratorVendedor.hasNext()) {
            Vendedor vendedorIte = iteratorVendedor.next();
            vendedorIte.apresentarseVendedor();
            vendedorIte.calcularMedia();
            vendedorIte.calcularBonus();
            System.out.println("\n");
        }

        System.out.println("Clientes:");
        Iterator<Cliente> iteratorClientes = loja.clientes.iterator();
        while (iteratorClientes.hasNext()) {
            Cliente clienteIte = iteratorClientes.next();
            clienteIte.apresentarse();
        }

        Pedido novoPedido = new Pedido();
        novoPedido.id = 1; 
        novoPedido.dataCriacao = (new Date()); 
        novoPedido.cliente = cliente1; 
        novoPedido.vendedor = vendedor1; 
        novoPedido.loja = "MyyPlant"; 

        Item item1 = new Item();
        item1.id = 1;
        item1.nome = "Camisa";
        item1.tipo = "Vestuário";
        item1.valor = 50.0;

        novoPedido.itens.add(item1);
        
        novoPedido.calcularValorTotal();
        novoPedido.gerarDescricaoVenda();

    }
}
