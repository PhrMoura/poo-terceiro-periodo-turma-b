public interface IClienteController {
    void cadastrar(String nome, String cpf);

    void listar();

    Cliente getById(int id);
}
