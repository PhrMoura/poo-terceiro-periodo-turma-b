package poo.ListaSete;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static Integer itensCriados = 0;
    static Date dataAtual = new Date();
    static long umDia = 86400000;

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        Gerente gerente1 = new Gerente();

        int opcao;

        gerente1.nome = "Joao";
        gerente1.idade = 25;
        gerente1.loja = "lojaJoao";
        gerente1.salarioBase = 3000;
        gerente1.enderecoGerente.cidade = "palotina";
        gerente1.enderecoGerente.bairro = "Centro";
        gerente1.enderecoGerente.complemento = "Perto do lago";
        gerente1.enderecoGerente.estado = "Paraná";
        gerente1.enderecoGerente.numero = "1637";

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Criar Pedido");
            System.out.println("[2] - novo Item");
            System.out.println("[3] - Processar Pedido");
            System.out.println("[4] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaTeclado.nextInt();

            switch (opcao) {
                case 1:
                    criaPedido(entradaTeclado);
                    break;
                case 2:
                    criarItem(entradaTeclado);
                    break;
                case 3:
                    processaPedido(entradaTeclado);
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        entradaTeclado.close();

        gerente1.apresentarse();
    }

    public static void criarItem(Scanner scanner) {
        Item novoItem = new Item();

        itensCriados += 1;
        novoItem.id = itensCriados;
        novoItem.tipo = "tipoPredefinido";

        System.out.println("digite o nome do item: ");
        novoItem.nome = scanner.next();
        System.out.println("digite o valor do produto:");
        novoItem.valor = scanner.nextDouble();

    }

    public static void processaPedido(Scanner scanner) {
        ProcessaPedido processandoPedido = new ProcessaPedido();

        processandoPedido.dataAtual = dataAtual;

        System.out.println("quantos dias pra vencer?");
        Integer diasPVencer = scanner.nextInt();
        Date dataVencimento = new Date(diasPVencer * umDia);
        processandoPedido.dataVencimento = dataVencimento;
    }

    public static void criaPedido(Scanner scanner) {

    }
}
