package primeiroB.listaSete;
import java.util.Scanner;

public class LojaDonaGabriela {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[13][31];

        Endereco enderecoCliente = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 01");
        Cliente cliente = new Cliente("Larissa", 19, enderecoCliente);

        Endereco enderecoVendedor = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 04");
        Vendedor vendedor = new Vendedor("José" , 30 , "MyyPlant", 1800, enderecoVendedor);

        Endereco enderecoLoja = new Endereco("Acre", 1561, "Ipê", "Medianeira", "PR", "Sala comercial");
        Loja loja = new Loja("MyyPlant" , "MyyPlant LTDA" , "74.920.581/0001-36" , enderecoLoja);

        do {
            System.out.println("Bem vindo(a) à MyyPlant!");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Calcular valor da venda.\n2- Calcular troco");
            System.out.println("3- Registrar venda.\n4- Acessar venda registrada.");
            System.out.println("5- Cadastrar item.\n6- Listar itens.\n7- Criar pedido");
            System.out.println("8- Sair.");
            System.out.println("Opção desejada:");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Calcular valor da venda.
                System.out.println("Insira a quantidade de plantas: ");
                int quantPlanta = input.nextInt();
                System.out.println("Insira o valor da planta: ");
                float valorPlanta = input.nextFloat();
                double valorTotal = quantPlanta * valorPlanta;
                if (quantPlanta > 10) {
                    double desconto = (valorTotal * 0.05);
                    valorTotal = (valorTotal - desconto);
                    System.out.println("\nVocê recebeu um desconto de 5%!");
                }
                System.out.println("\nValor total da venda: R$" + valorTotal + "\n\n");
                break;
                
                case 2: // Calcular troco.
                System.out.println("Insira o valor recebido pelo cliente: ");
                double valorRecebido = input.nextDouble();
                System.out.println("Insira o valor total da compra: ");
                valorTotal = input.nextDouble();
                if (valorRecebido < valorTotal) {
                    System.out.println("\nAtenção! O valor recebido pelo cliente é insuficiente.\n");
                } else {
                    double valorTroco = (valorRecebido - valorTotal);
                    System.out.println("\nO valor a ser retornado é de: R$" + valorTroco + "\n\n");
                }
                break;

                case 3: // Registrar venda.
                System.out.println("Insira o mês da venda:");
                int mes = input.nextInt();
                System.out.println("Insira o dia da venda:");
                int dia = input.nextInt();
                System.out.println("Insira o valor da venda:");
                valorTotal = input.nextDouble();
                matriz[mes][dia] = valorTotal;
                System.out.println("\nValor registrado na data " + dia + "/" + mes + ": R$" + matriz[mes][dia] + "\n\n");
                break;

                case 4: // Acessar venda registrada.
                System.out.println("Insira o mês da venda registrada:");
                mes = input.nextInt();
                System.out.println("Insira o dia da venda registrada:");
                dia = input.nextInt();
                System.out.println("\nValor registrado na data " + dia + "/" + mes + ": R$" + matriz[mes][dia] + "\n\n");
                break;

                case 5: // Cadastrar item

                break;

                case 6: // Listar itens

                break;

                case 7: // Criar pedido
                Item[] itens = {new Item(01, "Samambaia", "Planta", 50.0),
                                new Item(02, "Suculenta", "Planta", 5.0),
                                new Item(03, "Tulipa", "Flor", 25.0)};

                System.out.println("\nItens disponíveis: \n1- Samambaia.\n2- Suculenta.\n3- Tulipa.");
                System.out.println("Escolha o item:");
                int id = input.nextInt();
                ProcessarPedido processador = new ProcessarPedido();


                Pedido pedido = new Pedido(id, cliente, vendedor, loja, itens);
                System.out.println("\nPedido criado com sucesso!");
                pedido.gerarDescricaoVenda();

                boolean pagamentoConfirmado = processador.confirmarPagamento(pedido);
                if (pagamentoConfirmado) {
                    System.out.println("Pagamento confirmado.");
                } else {
                    System.out.println("Erro ao confirmar o pagamento. A reserva está vencida.");
                }
    
                case 8: // Sair.
                System.out.println("\nObrigada!");
                break;

                default:
                System.out.println("\nOpção inválida.");
                break;
            }
        } while (opcao != 8);
        input.close();
    }
}