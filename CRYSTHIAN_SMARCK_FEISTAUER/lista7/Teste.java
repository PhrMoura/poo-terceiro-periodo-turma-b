package lista7;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int id = 1;
        String cliente = "Cliente A";
        String vendedor = "Vendedor X";
        String loja = "Loja Y";
        ArrayList<Double> itens = new ArrayList<>();

        Endereco endereco = new Endereco("Pedro",  30, "Myy Plant", "Cascavel", "Santa Cruz", "Avenida das torres", 1400.0, new Double[]{1400.0, 1500.0, 1600.0}, "Paraná", 510, "Sem complemento");
        endereco.apresentarse();
        endereco.apresentarLogradouro();
        Gerente gerente = new Gerente("Pedro", 30, "Myy Plant", "Cascavel", "Santa Cruz", "Avenida das torres", 1400.0, new Double[]{1400.0, 1500.0, 1600.0});
        gerente.apresentarse();
        gerente.calcularBonus();
        gerente.calcularMedia();

        Pedido pedido = new Pedido();
        pedido.itens.add(100.0);
        pedido.itens.add(500.0);
        pedido.calcularValorTotal();

        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.APRIL);
        calendario.set(Calendar.DAY_OF_MONTH, 23);
        Date dataPagamento = null;
        Date dataVencimentoReserva = null;
        Date dataCriacao = calendario.getTime();
        Date dataEspecifica = calendario.getTime();
        pedido.adicionarDataCriacao(dataEspecifica);
        pedido.getDataCriacao();
        pedido.gerarDescricaoVenda();

        ProcessaPedido processaPedido = new ProcessaPedido(id, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, vendedor, loja, itens);
        processaPedido.processar();

        int usuario = 0;
        String mensagem = """
                /n** Escolha uma opção **
                1- cadastrar itens
                2-Listar itens
                3- Sair
                """;
        while (true){
            System.out.println(mensagem);
            usuario = entrada.nextInt();

            if (usuario == 3){
                System.out.println("Saindo...");
                break;
            }

            switch (usuario){
                case 1:
                    System.out.println("Entre com o valor do item");
                    double valorItem = entrada.nextDouble();
                    pedido.adicionarItem(valorItem);
                    break;
                case 2:
                    System.out.println("Listando itens");
                    pedido.listarItens();
                    break;
                default:
                System.out.println("opção invalida");
                break;
            }
        }
        entrada.close();
    }
}
