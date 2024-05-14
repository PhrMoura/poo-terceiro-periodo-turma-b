package IGOR_FELIPE_MORETTO.primeirob.prova;

import java.util.Scanner;

public class Cliente {
    String nome;
    int i = 0;
    Integer idade;
    Scanner cliente = new Scanner(System.in);

    public void cliente (){
        System.out.println("Nome do cliente: ");
        nome = cliente.next();
        System.out.println("Idade do cliente: ");
        idade = cliente.nextInt();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
    

}
