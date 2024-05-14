package primeirob.atividades.atividadeclasse;

public class ProcessaPedido extends Pedido{
    
    int i = 0;
    long mlsDia = 86400000l;
    
    public void cadastrarItem (){
                    System.out.println("Id da planta: ");
                    getId()[0] = demo.nextInt();
                    System.out.println("Nome da planta: ");
                    getNome() [0] = demo.next();
                    System.out.println("Tipo da planta: ");
                    getTipo() [0] = demo.next();
                    System.out.println("Valor da planta: ");
                    getValor()[0] = demo.nextInt();
                    System.out.println("Id da planta: ");
                    getId() [1] = demo.nextInt();
                    System.out.println("Nome da planta: ");
                    getNome() [1] = demo.next();
                    System.out.println("Tipo da planta: ");
                    getTipo() [1] = demo.next();
                    System.out.println("Valor da planta: ");
                    getValor() [1] = demo.nextInt();
    }

    public void processar(){
        System.out.println("Cliente: ");
        cliente = demo.next();
        System.out.println("Id do produto: ");
        int idd = demo.nextInt();
        if (idd == getId() [0]) {
            System.out.println(getNome()[0]);
           
            valorTotal = getValor()[0];
            valorT = valorT + valorTotal;
        }
        
        while (cond != 2) {
                System.out.println("Mais algum produto? [1] Sim [2] Não");
                cond = demo.nextInt();
                if (cond == 1) {
                    System.out.println("Id do produto: ");
        idd = demo.nextInt();
        if (idd == getId() [1]) {
            System.out.println(getNome() [1]);
            valorTotal = getValor()[1];
            valorT = valorT + valorTotal;
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
