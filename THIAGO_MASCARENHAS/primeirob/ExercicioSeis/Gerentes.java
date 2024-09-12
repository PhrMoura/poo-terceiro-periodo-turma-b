package ExercicioSeis;

public class Gerentes {
    
    class Gerente {
        // Atributos
        private String nome;
        private Integer idade;
        private String loja;
        private String cidade;
        private String bairro;
        private String rua;
        private double salarioBase;
        private double[] salarioRecebido;

        // Construtor
        public Gerente(String nome, int idade, String loja, String cidade, String bairro, String rua,
                    double salarioBase, double[] salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.salarioBase = salarioBase;
            this.salarioRecebido = salarioRecebido;
        }

        // Método apresentarse
        public void apresentarse() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Loja: " + loja);
            System.out.println("Nome: " + cidade);
            System.out.println("Idade: " + bairro);
            System.out.println("Loja: " + rua);
        }

        // Método calcularMedia
        public double calcularMedia() {
            double soma = 0;
            for (double salario : salarioRecebido) {
                soma += salario;
            }
            return soma / salarioRecebido.length;
        }

        // Método calcularBonus
        public double calcularBonus() {
            return salarioBase * 0.35;
        }
    }
}
