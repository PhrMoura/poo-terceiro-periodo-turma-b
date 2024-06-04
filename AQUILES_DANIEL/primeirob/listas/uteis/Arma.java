package primeirob.listas.uteis;

public class Arma {

  String nome;

  String tipo;

  Integer dano;

  @Override
  public String toString() {
    return "Estou portando uma " + nome + " do tipo " + tipo + " que causa " + dano + " de dano !!!";
  }

}
