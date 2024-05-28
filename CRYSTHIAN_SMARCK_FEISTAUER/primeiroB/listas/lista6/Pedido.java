import java.util.Date;
import java.util.ArrayList;

public class Pedido extends Heranca {
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    ArrayList<Item> itens = new ArrayList<>();

    public Pedido(String nome, int idade, String loja, String cidade, String bairro, String rua, String complemento, String estado, int numero) {
        super(nome, idade, loja, cidade, bairro, rua, complemento, estado, numero);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de criação do pedido: " + dataCriacao + ", Valor total: " + calcularValorTotal());
    }
}
