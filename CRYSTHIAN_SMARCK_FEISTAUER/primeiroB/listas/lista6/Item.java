public class Item {
    int id;
    String nome;
    String tipo;
    double valor;
    public void gerarDescricao(){
        System.out.println(" Item ID: " + id + ", nome: " + nome + ", tipo: " + tipo + ", valor: " + valor);
    }
}
