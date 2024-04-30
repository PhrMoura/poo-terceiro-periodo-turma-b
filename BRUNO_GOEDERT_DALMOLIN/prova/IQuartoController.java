package BRUNO_GOEDERT_DALMOLIN.prova;

public interface IQuartoController {
    void cadastrar(String nome);

    void listar();

    Quarto getById(int id);

    void reservar(int idCliente, int idQuarto);

    void checkin(int idQuarto);
}
