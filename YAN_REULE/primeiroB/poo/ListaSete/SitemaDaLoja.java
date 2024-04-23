package poo.ListaSete;

import java.util.Scanner;

public class SitemaDaLoja {

    public static void main(String[] args) {
        Endereco novoEndereco = new Endereco(null, null, null, null, null, null);
        Scanner entradaTeclado = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        Vendedor novoVendedor = new Vendedor();
        Gerente novoGerente = new Gerente();
        Loja novLoja = new Loja(null, null, null, null, null, null);

        novoEndereco.setBairro("Centro");
        novoEndereco.setCidade("Palotina");
        novoEndereco.setComplemento("do lado ");
        novoEndereco.setEstado("Paraná");
        novoEndereco.setNumero("1234");
        novoEndereco.setRua("AV. presidente KND");

        novoVendedor.setNome("yan");
        novoVendedor.setIdade(21);

        novoCliente.setNome("nice"); 
        novoCliente.setIdade(42);

        novoGerente.setNome("Maciel");
        novoGerente.setIdade(40);

        novLoja.setNomeFantasia("MY Plant"); 
        novLoja.setRazaoSocial("minhas plantas S.a");
        novLoja.setCnpj("999 999 999-99");

        novoGerente.endereco.setBairro("interlagos");
        novoGerente.endereco.setCidade("Palotina"); 
        novoGerente.endereco.setComplemento("Perto do lago") ;
        novoGerente.endereco.setEstado("Par");
        novoGerente.endereco.setNumero("7777");
        novoGerente.endereco.setRua("1 de maio");

        novoCliente.endereco.setBairro("Centro");
        novoCliente.endereco.setCidade("Palotina");
        novoCliente.endereco.setComplemento("Perto do lago");
        novoCliente.endereco.setEstado("Paraná");
        novoCliente.endereco.setNumero("9988");
        novoCliente.endereco.setRua("24 de julho");

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Criar Pedido");
            // System.out.println("[2] - novo Item");
            System.out.println("[3] - Processar Pedido");
            System.out.println("[4] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaTeclado.nextInt();

            switch (opcao) {
                case 1:
                    // criaPedido(entradaTeclado);
                    break;
                case 2:
                    // criarItem(entradaTeclado);
                    break;
                case 3:
                    // processaPedido(entradaTeclado);
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        entradaTeclado.close();
        // novoVendedor.apresentarSe();
        // novoCliente.apresentarSe();
        // novoGerente.apresentarSe();
        // novLoja.apresentarSe();
    }
}
