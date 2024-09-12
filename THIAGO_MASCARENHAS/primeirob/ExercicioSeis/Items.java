package ExercicioSeis;

public class Items {
    // Classe Item
    class Item {
        // Atributos
        private int id;
        private String nome;
        private String tipo;
        private double valor;
    
        // Construtor
        public Item(int id, String nome, String tipo, double valor) {
            this.id = id;
            this.nome = nome;
            this.tipo = tipo;
            this.valor = valor;
        }
    
        // Método para obter o valor do item
        public double getValor() {
            return valor;
        }
    
        // Método gerarDescricao
        public void gerarDescricao() {
            System.out.println("ID: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Tipo: " + tipo);
            System.out.println("Valor: " + valor);
        }
    }
}
