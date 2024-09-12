// package primeirob.prova;

// import java.util.Date;
// import java.util.Scanner;

// public class Main {

//     Quartos[] quartos = new Quartos[10];
//     Clientes[] clientes = new Clientes[10];

//     public Quartos[] getQuartos() {
//         return quartos;
//     }

//     public Clientes[] getClientes() {
//         return clientes;
//     }

//     public void checkin(int numeroQuarto, Clientes Clientes){
//         Quartos quarto = this.quartos[numeroQuarto - 1];
//         if (quarto != null && !quarto.getDisponivel() && quarto.getClientes().equals(Clientes)){
//             quarto.setOcupado(true);
//             System.out.println("Check-in realizado com sucesso!");
//         } else {
//             System.out.println("Quarto não encontrado ou não está reservado para o hóspede informado");
//         }
//     }

//     public static void main(String[] args) {
        
//         System.out.println("Escolha uma das opçoes: \n");
//         System.out.println("1- Cadastro de Clientes ");
//         System.out.println("2- Cadastro de quartos ");
//         System.out.println("3- Listar quartos ");
//         System.out.println("4- Reserva de quarto ");
//         System.out.println("5- Check-in ");
//         System.out.println("6- Sair");
//         Scanner leitor = new Scanner(System.in);
//         int opcao = leitor.nextInt();

//         while (opcao != 6) {

//             switch (opcao) {
//                 case 1:
               
//                 clientes.cadastrarClientes();

//                     break;

//                 case 2:

//                 quartos.cadastrarQuarto();

//                     break;

//                 case 3:

//                 quartos.listarQuartos();
           
//                     break;

//                 case 4:

//                 quartos.reservarQuarto();
                   
//                     break;

//                 case 5:
                   
//                     break;
//                 case 6:
//                     System.out.println("Obrigado por utilizar o sistema");
//                     System.exit(0);
//                     break;

//                 default:
//                     System.out.println("Opção inválida");
//                     break;
//             }
//             System.out.println("Escolha uma das opçoes: \n");
//         System.out.println("1- Cadastro de Clientes ");
//         System.out.println("2- Cadastro de quartos ");
//         System.out.println("3- Listar quartos ");
//         System.out.println("4- Reserva de quarto ");
//         System.out.println("5- Check-in ");
//         System.out.println("6- Sair");
//             opcao = leitor.nextInt();
//             leitor.nextLine();
//         }
//         System.out.println("Obrigado por utilizar o sistema");
//         System.exit(0);
//         leitor.close();

//     }

// }
