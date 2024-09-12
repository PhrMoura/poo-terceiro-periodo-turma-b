public class Teste extends Heranca {
    public Teste(String nome, int idade, String loja, String cidade, String bairro, String rua, String complemento, String estado, int numero) {
        super(nome, idade, loja, cidade, bairro, rua, complemento, estado, numero);
    }
    @Override
    public void apresentarse(){
        super.apresentarse();
    }

    public class Main{
        public static void main(String[] args) {
            Teste teste = new Teste("Pedro", 30, "Myy plant", "Cascavel" , "Centro", "Avenida Brasil", "Sem complemento", "Paraná", 510);
            teste.apresentarse();
        }
    }
}
