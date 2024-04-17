package primeirob.atividades.listaseis;

public class Endereco {
  String rua, bairro, cidade, complemento;
  int numero;

  public void apresentarLogradouro() {
    System.out.println("Rua: " + rua);
    System.out.println("Bairro: " + bairro);
    System.out.println("Cidade: " + cidade);
    System.out.println("Numero: " + numero);
    System.out.println("Complemento: " + complemento);
  }
}
