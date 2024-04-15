package primeirob.atividades.atividadeclasse;

public class Item {
    Integer [] id = new Integer[] {1002, 1003, 1004};
    String [] nome = new String[] {"Samambaia", "Suculenta", "Cacto"};
    String [] tipo = new String[] {"Samambaia Americana", "Kalanchoe", "Seco"};
    Double [] valor = new Double[] {30.0d, 20.0d, 35.0d};

    public void gerarDescricao(){
        for (int i = 0; i < id.length; i++) {
            String msg = "Produtos: \n"
            .concat("Item " + nome[i])
            .concat(", id " + id[i])
            .concat(", o tipo é " + tipo[i] + " e o valor é R$" + valor[i]);
            System.out.println(msg);
        }
    }
}
