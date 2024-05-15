package atividades.atividade6;

public class Cliente extends Pessoa{
    
    public void apresentarse() {

        String msg = "Nome do cliente "
            .concat(nome)
            .concat(", ")
            .concat(idade + " anos.");

            System.out.println(msg);
    }
}