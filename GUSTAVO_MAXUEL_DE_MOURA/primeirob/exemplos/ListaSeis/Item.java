package primeirob.exemplos.ListaSeis;

public class Item {
    Integer[] id = { 1000, 1010, 1020 };
    String nome;
    String[] tipo = { "rosa", "suculenta", "Flor do campo" };
    double[] valor = { 20.0, 25.0, 30.0 };

    public void gerarDescricao() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Valor: R$" + valor);
    }
}
