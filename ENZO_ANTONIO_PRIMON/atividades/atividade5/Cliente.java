package atividades.atividade5;

public class Cliente {
    
    String nomeCliente;
    String cidadeCliente;
    String bairroCliente;
    String ruaCliente;
    int idadeCliente;

    public void apresentarse() {

        String msg = "Nome do cliente "
            .concat(nomeCliente)
            .concat(", ")
            .concat(idadeCliente + " anos.");

            System.out.println(msg);
    }
}
