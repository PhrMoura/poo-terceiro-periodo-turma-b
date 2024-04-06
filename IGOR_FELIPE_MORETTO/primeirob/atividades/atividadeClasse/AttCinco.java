package primeirob.atividades.atividadeClasse;

public class AttCinco {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.nome = "Demo";
        cliente.idade = 10;

        System.out.println(cliente.toString());
    }
}
