package GUSTAVO_MAXUEL_DE_MOURA.primeirob.prova;

import java.util.Scanner;
import java.util.HashSet;

public class CadastroQuarto {
    private int numeroQuarto;
    private Scanner scanner = new Scanner(System.in);
    private int[] quartosDisponiveis = { 300, 301, 302, 303, 304, 305 };
    private HashSet<Integer> quartosReservados = new HashSet<>();

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public void cadastrarQuarto() {
        System.out.println("Quartos disponíveis:");
        for (int quarto : quartosDisponiveis) {
            if (!quartosReservados.contains(quarto)) {
                System.out.println(quarto);
            }
        }

        System.out.println("Insira o quarto que deseja se hospedar:");
        int escolhaQuarto = scanner.nextInt();
        if (quartosReservados.contains(escolhaQuarto)) {
            System.out.println("Este quarto já está reservado.");
        } else {
            boolean quartoValido = false;
            for (int quarto : quartosDisponiveis) {
                if (quarto == escolhaQuarto) {
                    quartoValido = true;
                    break;
                }
            }
            if (quartoValido) {
                quartosReservados.add(escolhaQuarto);
                System.out.println("Quarto reservado com sucesso: " + escolhaQuarto);
            } else {
                System.out.println("Quarto inválido.");
            }
        }
    }
}
