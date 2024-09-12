import java.util.ArrayList;
import java.util.List;

public class QuartoController implements IQuartoController {
    public static List<Quarto> lQuartos = new ArrayList<>();

    @Override
    public void cadastrar(String nome) {
        var novoQuarto = new Quarto(nome);

        var lastIdQuarto = lQuartos.stream().mapToInt(q -> q.getId()).max();

        if (lastIdQuarto.isPresent()) {
            novoQuarto.setId(lastIdQuarto.getAsInt() + 1);
        } else {
            novoQuarto.setId(1);
        }

        lQuartos.add(novoQuarto);

        System.out.println("\nQuarto: " + novoQuarto.getNome() + ". Cadastrado com Sucesso! ");
    }

    @Override
    public void listar() {
        System.out.println("\nListando quartos cadastrados: \n");

        for (Quarto quarto : lQuartos) {
            System.out.println(
                    "Id: " + quarto.getId() + ". Nome: " + quarto.getNome() + ". Reservado: " + quarto.getReservado()
                            + ". Fez Checkin: " + quarto.getCheckin() + ". ");
        }
    }

    @Override
    public Quarto getById(int id) {
        var quarto = lQuartos.stream().filter(q -> q.getId() == id).findFirst();

        if (quarto.isPresent()) {
            return quarto.get();
        } else {
            return new Quarto(0, "");
        }
    }

    @Override
    public void reservar(int idCliente, int idQuarto) {
        var clienteCtrl = new ClienteController();
        var quartoCtrl = new QuartoController();

        var clienteReserva = clienteCtrl.getById(idCliente);

        if (clienteReserva.getId() == 0) {
            System.out.println("ATENÇÃO!!!");
            System.out.println("CLIENTE COM O ID " + idCliente + " NÃO ENCONTRADO!");

            return;
        }

        var quartoReserva = quartoCtrl.getById(idQuarto);

        if (quartoReserva.getId() == 0) {
            System.out.println("ATENÇÃO!!!");
            System.out.println("QUARTO COM O ID " + idQuarto + " NÃO ENCONTRADO!");

            return;
        }

        quartoReserva.setClienteReserva(clienteReserva);
        quartoReserva.setReservado(true);

        System.out.println("Quarto: " + quartoReserva.getNome() + ". Reservado para o Cliente: "
                + clienteReserva.getNome() + ". ");
    }

    @Override
    public void checkin(int idQuarto) {
        var quartoCtrl = new QuartoController();

        var quartoReserva = quartoCtrl.getById(idQuarto);

        if (quartoReserva.getId() == 0) {
            System.out.println("ATENÇÃO!!!");
            System.out.println("QUARTO COM O ID " + idQuarto + " NÃO ENCONTRADO!");

            return;
        }

        var clienteReserva = quartoReserva.getClienteReserva();

        quartoReserva.setCheckin(true);

        System.out.println("Quarto: " + quartoReserva.getNome() + ". Check-in Realizado com sucesso, para o cliente: "
                + clienteReserva.getNome() + ". ");

    }

}
