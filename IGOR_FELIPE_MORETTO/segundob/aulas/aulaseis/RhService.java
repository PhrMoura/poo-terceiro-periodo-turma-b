package segundob.aulas.aulaseis;

public class RhService {
    
    public void gerarFolhaPagamento(Estagiario estagiario, Clt clt){
        if (estagiario != null){
            Double vlrFolha = estagiario.getSalario() + (estagiario.getSalario() * 0.5);

            System.out.println("Valor folha estagiário: " + vlrFolha);
        }

        else if (clt != null) {
            Double vlrFolhaClt = clt.getSalario() / 2;

            System.out.println("Valor folha clt: " + vlrFolhaClt);
        }
    }

}
