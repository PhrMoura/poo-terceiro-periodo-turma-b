package primeirob.myyplant;

public class Vendedor {

    String nome;
    Integer idade;
    String cidade;
    String bairro;
    String rua;
    Loja loja;
    Integer[] salarioBase = new Integer[3];
    Integer[] salarioRecebido = new Integer[3];

    public Vendedor() {
        // Inicializar os arrays de salários com zeros
        for (int i = 0; i < salarioBase.length; i++) {
            salarioBase[i] = 0;
            salarioRecebido[i] = 0;
        }
    }

    // Método para calcular a média dos salários
    public double calcularMedia() {
        double soma = 0;
        for (int salario : salarioBase) {
            soma += salario;
        }
        return soma / salarioBase.length;
    }

    // Método para calcular o bônus
    public double calcularBonus() {
        double bonusTotal = 0;
        for (int salario : salarioBase) {
            bonusTotal += salario * 0.2;
        }
        return bonusTotal;
    }

    public void apresentarse() {
        // Verificar se a loja está definida para evitar NullPointerException
        String lojaNome = (loja != null) ? loja.nomeFantasia : "Loja não definida";

        // Calcular o bônus
        double bonusTotal = calcularBonus();

        // Construir a mensagem de apresentação
        String msg = "Nome: "
                .concat(nome)
                .concat("\n Idade:  ")
                .concat(Integer.toString(idade))
                .concat("\nLoja: ")
                .concat(lojaNome)
                .concat("\nBônus: ")
                .concat(String.valueOf(bonusTotal));

        // Exibir a mensagem
        System.out.println(msg);
    }
}
