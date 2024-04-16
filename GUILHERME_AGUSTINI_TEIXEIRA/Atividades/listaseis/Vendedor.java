package listacinco;

public class Vendedor {
    
    String nome;

    int idade;

    Loja loja;

    String cidade;

    String bairro;

    String rua;

    Double salarioBase;

    Double[] salarioRecebido = new Double[3];

    public void calcularMedia() {
        Double total = 0d;

        for (int i = 0; i < salarioRecebido.length; i++) {
            total += salarioRecebido[i];
        }

        Double salarioMedia = total / 3;

        System.out.println(salarioMedia);
    }

    public void calcularBonus() {

        System.out.println(salarioBase * 0.2);
        
    }
}
