package AQUILES_DANIEL.segundob.prova;

import java.util.List;

import javax.swing.JOptionPane;

public class Prova {
  public static void main(String[] args) {
    List<String> opcoes = List.of("Listagem de alunos", "Criar registro de testemunho", "Sair");
    String escolha = (String) JOptionPane.showInputDialog(
        null,
        "Escolha uma opção !",
        "vou trancar a faculdade (brincadeira professor n vou trancar não)",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(),
        opcoes.toArray()[0]);

    switch (escolha) {
      case "Listagem de alunos":
        JOptionPane.showMessageDialog(
            null,
            ListagemDeAlunos.listagemDeAlunos().substring(0, 200),
            "Listagem dos alunos 👇",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      case "Criar registro de testemunho":
        CriarRegistroDeTestemunho.criarRegistroDeTestemunho();
        break;
      case "Sair":
        System.exit(0);
        break;
      default:
        throw new Erro("Escolha alguma opção amigo !");
    }
    System.exit(0);
  }
}
