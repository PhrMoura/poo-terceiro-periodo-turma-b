package primeirob.atividades.atividadeclasse;



public class ProcessaPedido extends Pedido{
    
    int i = 0;
    long mlsDia = 86400000l;

    public void processar(){
        System.out.println("Cliente: ");
        cliente = demo.next();
        System.out.println("Id do produto: ");
        id = demo.nextInt();
        if (id == 1002) {
            System.out.println("Samambaia");
            valorTotal = valor[0];
            valorT = valorT + valorTotal;
        }
        else if (id == 1003){
            System.out.println("Suculenta");
            valorTotal = valor[1];
            valorT = valorT + valorTotal;
        }
        else if (id == 1004){
            System.out.println("Cacto");
            valorTotal = valor[2];
            valorT = valorT + valorTotal;
        }
        else {
            System.out.println("Id inválido");
        }
        
        while (cond != 2) {
                System.out.println("Mais algum produto? [1] Sim [2] Não");
                cond = demo.nextInt();
                if (cond == 1) {
                    System.out.println("Id do produto: ");
                id = demo.nextInt();
                if (id == 1002) {
                    System.out.println("Samambaia");
                    valorTotal = valor[0];
                    valorT = valorT + valorTotal;
                }
                else if (id == 1003){
                    System.out.println("Suculenta");
                    valorTotal = valor[1];
                    valorT = valorT + valorTotal;
                }
                else if(id == 1004){
                    System.out.println("Cacto");
                    valorTotal = valor[2];
                    valorT = valorT + valorTotal;
                }
                else {
                    System.out.println("Id inválido");
                }
                } else {
                    break;
                }
                  
        }
        
        System.out.println("Seu pedido ficou em R$" + valorT);
        System.out.println(dataCriacao);
        dataVencimentoReserva = dataCriacao.getTime() + (mlsDia * 3);
        System.out.println(new java.util.Date(dataVencimentoReserva));
   
    }

    public void confirmarPagamento(){
        
        if (diaAtual > dataVencimentoReserva) {
            System.out.println("Infelizmente sua reserva está vencida");
        } else {
            System.out.println("Certinho, sua reserva está em dia");
        }
    }
}
