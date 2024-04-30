package GUILHERME_HARMATIUK_ARANTES.primeirob.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {
    public static void opcoes () {
        System.out.println("======= MENU =======");
        System.out.println("[9] - Fechar Sistema");
        System.out.println("[0] - Cadastrar Cliente");
        System.out.println("[1] - Cadastrar Quarto");
        System.out.println("[2] - Listar Quartos");
        System.out.println("[3] - Reserva de Quarto");
        System.out.println("[4] - Realizar Check-in");
    }

    
    public static void scanner () {
        QuartosService quartosService = new QuartosService();
        ClientesService clientesService = new ClientesService();

        Scanner input = new Scanner(System.in);
        Integer action;
        Boolean condition = false;

        while (condition == false) {
            opcoes();
            action = input.nextInt();
            System.out.println(action);
            switch (action) {
                case 9:
                    condition = true;
                    System.out.println("Fechando sistema...");
                case 0:
                    Cliente novoCliente = new Cliente();
                    novoCliente.easyCadastro();
                    clientesService.addCliente(novoCliente);
                    break;
                case 1:
                    Quarto novoQuarto = new Quarto();
                    novoQuarto.easyCadastro();
                    quartosService.addQuarto(novoQuarto);
                    break;
                case 2: 
                    System.out.println("Todos os Quartos: ");
                    quartosService.listarQuartos();
                    // quartosService.listarQuartos();
                    break;
                case 3:
                    if (quartosService.qtdQuartosNaoReservados() == 0) {System.out.println("É necessário pelo menos 1 quarto não reservado para fazer a reserva");}
                    else if (clientesService.qtdClientesSemReservas() == 0) {System.out.println("É necessário pelo menos 1 cliente sem reserva para realizar a reserva");}
                    else {
                        clientesService.selecionarQuartoECliente(quartosService);
                        clientesService.listarClientesSemReservas();
                        quartosService.listarQuartosNaoReservados();
                    } 
                    break;
                case 4:
                    clientesService.fazerCheckin(quartosService);
                    break;
                default:
                    System.out.println("Comando não reconhecido. Tente novamente.\n");
                    break;
            }
        }    
    }
}
