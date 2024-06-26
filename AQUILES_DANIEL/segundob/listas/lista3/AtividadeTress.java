package segundob.listas.lista3;

import java.util.List;

import javax.swing.JOptionPane;

public class AtividadeTress {
  public static void main(String[] args) {
    // atividade 1
    JOptionPane.showMessageDialog(
        null,
        "Ola mundo !",
        "💞",
        JOptionPane.INFORMATION_MESSAGE);

    // atividade 2
    String nome = JOptionPane.showInputDialog(
        null,
        "Coloque seu nome: ",
        null,
        JOptionPane.QUESTION_MESSAGE);

    JOptionPane.showMessageDialog(
        null,
        "Boas vindas " + nome + " !");

    // atividade 3
    int resposta = JOptionPane.showConfirmDialog(
        null,
        "Deseja continuar?",
        "(。_。)",
        JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(
          null,
          "Você escolheu continuar !",
          "ヾ(•ω•`)o",
          JOptionPane.INFORMATION_MESSAGE);
    } else if (resposta == JOptionPane.NO_OPTION) {
      JOptionPane.showMessageDialog(
          null,
          "Você escolheu não continuar !",
          "(┬┬﹏┬┬)",
          JOptionPane.INFORMATION_MESSAGE);
    }

    // atividade 4
    List<String> opcoes = List.of("Masculino", "Feminino", "Felipe Emanuel Negri da conceição");

    String escolha = (String) JOptionPane.showInputDialog(
        null,
        "Qual seu sexo?",
        null,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(),
        opcoes.toArray()[0]);

    if (escolha == "Felipe Emanuel Negri da conceição") {
      throw new ExcecaoPersonalizada("VOCÊ NÃO É O FELIPE EMANUEL NEGRI DA CONCEIÇÃO");
    } else {
      JOptionPane.showMessageDialog(
          null,
          "Sexo escolhido: " + escolha);
    }

    // atividade 5
    new ExcecaoPersonalizada("excessão personalizada do nada");

    // atividade 6
    List<String> operacaoMatematica = List.of("Adição", "Subtração", "Multiplicação", "Divisão");
    String operacaoEscolhida = (String) JOptionPane.showInputDialog(
        null,
        "Escolha a operação matematica: ",
        "",
        JOptionPane.QUESTION_MESSAGE,
        null,
        operacaoMatematica.toArray(),
        operacaoMatematica.toArray()[0]);

    String numeroUmString = JOptionPane.showInputDialog(
        null,
        "Informe o primeiro numero: ",
        null,
        JOptionPane.INFORMATION_MESSAGE);

    String numeroDoisString = JOptionPane.showInputDialog(
        null,
        "Informe o segundo numero: ",
        null,
        JOptionPane.INFORMATION_MESSAGE);

    int numeroUm = Integer.parseInt(numeroUmString);
    int numeroDois = Integer.parseInt(numeroDoisString);

    int resultado = 0;

    switch (operacaoEscolhida) {
      case "Adição":
        resultado = numeroUm + numeroDois;
        break;
      case "Subtração":
        resultado = numeroUm - numeroDois;
        break;
      case "Multiplicação":
        resultado = numeroUm * numeroDois;
        break;
      case "Divisão":
        if (numeroUm == 0 || numeroDois == 0) {
          throw new ExcecaoPersonalizada("Divizão por zero não é possivel!");
        }
        resultado = numeroUm / numeroDois;
        break;
      default:
        throw new ExcecaoPersonalizada("nenhuma opção selecionada!");
    }

    JOptionPane.showMessageDialog(
        null,
        "Resultado: " + resultado,
        "🔥",
        JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  }
}
