package primeirob.sextaatividade;

import java.util.ArrayList;
import java.util.List;

public class SextaAtividade {
    public static void main(String[] args) {

        // Criação da Loja Matriz

        System.out.println("-------------------------------------------------------------------");

        Loja lojaMatriz = new Loja();

        lojaMatriz.CPNJ = 39349196000160L;
        lojaMatriz.nomeFantasia = "Myy Plant - Matriz";
        lojaMatriz.razaoSocial = "MP PAGAMENTOS";
        lojaMatriz.endereco.cidade = "Cascavel";
        lojaMatriz.endereco.bairro = "Centro";
        lojaMatriz.endereco.rua = "Av Brasil";
        lojaMatriz.endereco.complemento = "Proximo à Praça do Migrante";
        lojaMatriz.endereco.numero = 1980;
        lojaMatriz.endereco.uf = "PR";

        lojaMatriz.apresentarse();

        System.out.println("-------------------------------------------------------------------");

        // Criação do Gerente

        Gerente gerenteUm = new Gerente();

        gerenteUm.nome = "Bruno";
        gerenteUm.idade = 25;
        gerenteUm.localTrabalho = lojaMatriz;
        gerenteUm.salarioBase = 1000d;
        gerenteUm.salarioRecebido = new double[] {1000d, 1000d, 1000d};
        gerenteUm.endereco.rua = "Rio Das Pedras";
        gerenteUm.endereco.bairro = "Brasmadeira";
        gerenteUm.endereco.cidade = "Cascavel";
        gerenteUm.endereco.uf = "PR";
        gerenteUm.endereco.numero = 330;
        gerenteUm.endereco.complemento = "Proximo ao mercado Samara";

        gerenteUm.apresentarse();
        gerenteUm.calcularMedia();
        gerenteUm.calcularBonus();
        gerenteUm.endereco.apresentarLogradouro();

        System.out.println("-------------------------------------------------------------------");

        // Criação do Vendedor

        Vendedor vendedorUm = new Vendedor();
        vendedorUm.nome = "Kesia";
        vendedorUm.idade = 18;
        vendedorUm.salarioBase = 1000d;
        vendedorUm.salarioRecebido = new double[] {1000d, 1000d, 1000d};;
        vendedorUm.localTrabalho = lojaMatriz;
        vendedorUm.endereco.cidade = "Cascavel";
        vendedorUm.endereco.bairro = "São Cristovão";
        vendedorUm.endereco.rua = "Rua Goias";
        vendedorUm.endereco.complemento = "Proximo à Igreja Catolica";
        vendedorUm.endereco.numero = 540;
        vendedorUm.endereco.uf = "PR";

        vendedorUm.apresentarse();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        vendedorUm.endereco.apresentarLogradouro();

        lojaMatriz.vendedores.add(vendedorUm);

        System.out.println("-------------------------------------------------------------------");

        // Criacao do Cliente

        Cliente clienteUm = new Cliente();
        clienteUm.nome = "Maylo";
        clienteUm.idade = 19;
        clienteUm.endereco.rua = "Rio Bora";
        clienteUm.endereco.numero = 640;
        clienteUm.endereco.bairro = "Brasmadeira";
        clienteUm.endereco.cidade = "Cascavel";
        clienteUm.endereco.uf = "PR";
        clienteUm.endereco.complemento = "Proximo à Mercado Bom Preço";

        clienteUm.apresentarse();

        lojaMatriz.clientes.add(clienteUm);

        System.out.println("-------------------------------------------------------------------");

        lojaMatriz.contarClientes();
        lojaMatriz.contarVendedores();

        System.out.println("-------------------------------------------------------------------");

        // Criando Itens para a Loja;
        Item item01 = new Item();
        item01.nome = "Rosas";
        item01.id = 001;
        item01.valor = 9.00;
        item01.tipo = "Flor";

        Item item02 = new Item();
        item02.nome = "Tulipa";
        item02.id = 002;
        item02.valor = 7.00;
        item02.tipo = "Flor";

        item01.gerarDescricao();
        item02.gerarDescricao();

        // Criação do Pedido

        ProcessaPedido processadorPedido = new ProcessaPedido();

        List<Item> carrinItems = new ArrayList<Item>();

        carrinItems.add(item01);
        carrinItems.add(item02);

        Pedido pedido01 = processadorPedido.processar(clienteUm, vendedorUm, lojaMatriz, carrinItems);

        System.out.println();

        pedido01.calcularValorTotal();
        pedido01.gerarDescricaoVenda();

        System.out.println("-------------------------------------------------------------------");

        // Confirmação de pagamento
                
        processadorPedido.confirmarPagamento(pedido01);
        System.out.println(pedido01.dataPagamento);

        System.out.println("-------------------------------------------------------------------");

    }
}
