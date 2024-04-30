package primeirob.myyplant;

public class Vendedor {

    private String nome;
    private Integer idade;
    private String cidade;
    private String bairro;
    private String rua;
    private Loja loja;
    private Integer[] salarioBase = new Integer[3];
    private Integer[] salarioRecebido = new Integer[3];

    // Construtor
    public Vendedor(String nome, int idade, String cidade, String bairro, String rua, Loja loja, Integer[] salarioBase, Integer[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }
    

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter e Setter para bairro
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Getter e Setter para rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    // Getter e Setter para loja
    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    // Getter e Setter para salarioBase
    public Integer[] getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Integer[] salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Getter e Setter para salarioRecebido
    public Integer[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(Integer[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
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
            bonusTotal += salario * 0.2; // Utilizei 0.2 para corresponder ao 20%
        }
        return bonusTotal;
    }

    // Método para apresentar informações do vendedor
    public void apresentarse() {
        // Verificar se a loja está definida para evitar NullPointerException
        String lojaNome = (loja != null) ? loja.getNomeFantasia() : "Loja não definida";

        // Calcular o bônus
        double bonusTotal = calcularBonus();

        // Construir a mensagem de apresentação
        String msg = "Nome: " + nome + "\nIdade: " + idade + "\nLoja: " + lojaNome + "\nBônus: " + bonusTotal;

        // Exibir a mensagem
        System.out.println(msg);
    }
}
