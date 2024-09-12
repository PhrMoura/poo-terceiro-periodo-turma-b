package primeirob.listas.lista6;

public class Cliente extends Pessoa {
  public void apresentarse() {
    System.out.println("Nome cliente " + getNome() + " idade " + getIdade());
  }
}
