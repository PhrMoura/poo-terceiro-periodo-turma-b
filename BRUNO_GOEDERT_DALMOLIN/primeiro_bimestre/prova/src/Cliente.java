public class Cliente extends Pessoa {
    private int id;

    public Cliente(String nome, String cpf, int id) {
        super(nome, cpf);
        this.id = id;
    }

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
