package atividades.atividade6;

public class Cliente extends Pessoa {

    public Cliente(String nome, Integer idade, Endereco endereco){
        super(nome, idade, endereco);
    }

    public void apresentarse(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade());
    }
}
