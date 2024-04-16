package primeirob.atividades.atividadeclasse;

public class Item {
    Integer [] id = new Integer[] {1002, 1003, 1004};
    String [] nome = new String[] {"Samambaia", "Suculenta", "Cacto"};
    String [] tipo = new String[] {"Samambaia Americana", "Kalanchoe", "Seco"};
    Double [] valor = new Double[] {30.0d, 20.0d, 35.0d};

    public void gerarDescricao(){
        String msg = "Produtos: \n"
        .concat("Item " + nome[0])
        .concat(", id " + id[0])
        .concat(", o tipo é " + tipo[0] + " e o valor é R$" + valor[0]);

        System.out.println(msg);
    }
}
