package primeirob.atividades.uteis;

public class Professor {
  String nome;
  String materia;
  Arma awp;

  public void apresentarse() {
    String msg = "Só salvinho carai meu nome é "
        .concat(nome)
        .concat(" eu dou aula de ")
        .concat(materia);
    System.out.println(msg);
  }
}
