package primeirob.exemplos.classemetodo;

public class AulaOito {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario("Igor", "Jogador");

        System.out.println(funcionarioUm.cargo);
        System.out.println(funcionarioUm.nome);

        ContaBancaria conta = new ContaBancaria("127845", "demoteste@gmail.com");

        System.out.println(conta.getEmail());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getNumero());
        System.out.println(conta.getDocumento());


        Postgres postgres = new Postgres();

        salvar(postgres);
    }
    public static void salvar(IBancoDados banco) {
        banco.salvar();
    }
    
}
