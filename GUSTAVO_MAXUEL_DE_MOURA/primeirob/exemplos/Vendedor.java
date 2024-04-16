package primeirob.exemplos;

public class Vendedor {
     String nome;
     int idade;
     String loja;
     String cidade;
     String bairro;
     String rua;
     double salarioBase;
     double[] salarioRecebido = new double[]{2100.0,2200.0,2300.0};


    
    public void apresentarSe() {
        String msg = "Nome: "
        .concat(nome)
        .concat(", tenho "+idade+" anos")
        .concat(" e trabalho na "+loja);
    System.out.println(msg);
    }

    
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

   
    public double calcularBonus() {
        return salarioBase * 0.2;
    }


    
}

   