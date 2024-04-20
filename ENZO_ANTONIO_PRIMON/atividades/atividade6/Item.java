package atividades.atividade6;

public class Item {
    int id;
    String nome;
    String tipo;
    double valor;

    public double getValor() {
        return valor;
    }
    
    public void gerarDescricao(){

        String msg = ("\nid:" + id)
        .concat("\nNome: " + nome)
        .concat("\nTitpo: " + tipo)
        .concat("\nValor: " + valor);

        System.out.println(msg);
    }
}
