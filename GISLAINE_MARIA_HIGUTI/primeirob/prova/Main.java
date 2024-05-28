package primeirob.prova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int escolha;    
        Scanner input = new Scanner(System.in);   

            do {
                exibirMenu();
                escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            CadastroCliente clienteUm = new CadastroCliente(null, null);
                            clienteUm.setNome("Maria");
                            clienteUm.setIdade(25);
                            clienteUm.apresentarse();
                            break;

                        case 2:
                            Quarto quartoUm = new Quarto(null, null);
                            quartoUm.setNumero(1);
                            quartoUm.setDisponivel(1);
                            Quarto quartoDois = new Quarto(null, null);
                            quartoDois.setNumero(2);
                            quartoDois.setDisponivel(0);
                            break;

                        default:
                        System.out.println("Finalizando execução");
                            break;
                    }
                }while (escolha != 4);

                input.close();
        }
    public static void exibirMenu() {
        System.out.println("Menu da Calculadora");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Quarto e listar quartos");
        System.out.println("Selecione a opção: 1, 2 ou 3");
    }
    }

