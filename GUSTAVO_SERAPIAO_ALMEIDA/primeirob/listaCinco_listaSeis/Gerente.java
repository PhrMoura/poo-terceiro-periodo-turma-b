package listaCinco_listaSeis;

public class Gerente extends Pessoa{

    public Gerente(Integer idade, String nome, String rua, String bairro, String cidade, String estado, String numero, String complemento) {
        super(idade, nome, rua, bairro, cidade, estado, numero, complemento);
        //TODO Auto-generated constructor stub
    }

    private Loja loja;
    
    private Double salarioBase;

    private double[] salarioRecebido = {5300, 5300, 5300};

    private Endereco endereco;

    private Pessoa pessoa;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularBonus(){
        System.out.println(salarioBase * 0.035);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void calcularMedia(){
        
        Double mediaSalario = 0d;
        
        for (int i = 0; i>=3; i++) {
            mediaSalario += salarioRecebido[i];
        }

        System.out.println("Média Salarial: " + mediaSalario);
    }
}

