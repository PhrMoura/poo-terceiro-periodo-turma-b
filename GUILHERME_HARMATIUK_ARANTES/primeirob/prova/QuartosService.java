package primeirob.prova;

import java.util.ArrayList;
import java.util.List;

public class QuartosService {
    public List<Quarto> quartos;

    public void addQuarto(Quarto novoQuarto) {
        if (this.quartos == null) {this.quartos = new ArrayList<Quarto>();} 
        this.quartos.add(novoQuarto);
    }

    public List<Quarto> getAllQuartos() {
        if (this.quartos == null) {this.quartos = new ArrayList<Quarto>();} 
        return this.quartos;
    }
    public Integer qtdQuartos() {
        return getAllQuartos().size();
    }
    public List<Quarto> getAllQuartosNaoReservados() {
        return getAllQuartos().stream().filter(quarto -> {
            return quarto.reservado == false;
        }).toList();
    }
    public Integer qtdQuartosNaoReservados() {
        Integer qtd = getAllQuartos().stream().filter(quarto -> {
            return quarto.reservado == false;
        }).toList().size(); 

        System.out.println(qtd);
        return qtd;
    }

    public void listarQuartos() {
        getAllQuartos().forEach(quarto -> {
            quarto.listarSelf();
        });
    }
    
    public void listarQuartosNaoReservados() {
        getAllQuartosNaoReservados().forEach(quarto -> {
            quarto.listarSelf();
        });
    }

    public void toggleReservado(Long id) {
        
        // Quarto quartoToggle = getAllQuartosNaoReservados().stream().filter(quarto -> {
        //     return quarto.id == id;
        // }).findFirst().orElse(null);

        // List<Quarto> oRestoDosQuartos = getAllQuartos().stream().filter(quarto -> {
        //     return quarto.id != id;
        // }).toList();

        // quartoToggle.toggleReservado();

        // oRestoDosQuartos.add(quartoToggle);

        // this.quartos = oRestoDosQuartos;
    }
}
