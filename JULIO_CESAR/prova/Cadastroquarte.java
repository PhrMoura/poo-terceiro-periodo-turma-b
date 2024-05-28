package PROVA.JAVA;

import java.util.List;


class CadastroQuarto {
    private List<Quarto> quartos;

    public CadastroQuarto() {
        this.quartos = new ArrayList<>();
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    /**
     * @return
     */
    public List<Quarto> listarQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                quartosDisponiveis.add(quarto);
            }
        }
    
class CadastroQuarto {
    private List<Quarto> quartos;

    public CadastroQuarto() {
        this.quartos = new ArrayList<>();
    }

    public void cadastrarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Quarto> listarQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                quartosDisponiveis.add(quarto);
            }
        }
        return quartosDisponiveis;
    }
}
