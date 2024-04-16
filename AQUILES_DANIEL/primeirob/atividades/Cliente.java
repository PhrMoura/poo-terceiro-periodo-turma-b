package primeirob.atividades;

public class Cliente {
  String nome, cidade, bairro, rua;
  int idade;

  public void apresentarse() {
    System.out.println("Nome Cliente: " + nome);
    System.out.println("Idade Cliente: " + idade);
  }
}
