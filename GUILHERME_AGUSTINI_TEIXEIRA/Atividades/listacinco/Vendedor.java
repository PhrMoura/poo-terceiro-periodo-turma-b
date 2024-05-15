package listacinco;

public class Vendedor {
    
    String nome;

    Integer idade;

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

        System.out.println("media é: " + salarioMedia);
    }

    public void calcularBonus() {

        System.out.println( "bonus é: " + salarioBase * 0.2);
        
    }
    public void apresentarse(){

        String msg = "O nome do vendedor é: "
            .concat(nome)
            .concat("Minha idade é: ")
            .concat(idade.toString())
            .concat(" Minnha loja é: ")
            .concat(loja.nomeFantasia);


            System.out.println(msg);

    }
}
