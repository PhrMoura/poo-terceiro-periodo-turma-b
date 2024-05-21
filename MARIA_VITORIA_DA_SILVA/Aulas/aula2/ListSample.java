package Aulas.aula2;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
         // Criando lista
         List<String> listaNomes = new ArrayList<>();
         String gusta = "Gustavo";
 
         // Adicionando elementos lista
         listaNomes.add(gusta);
         listaNomes.add("Júlio");
         listaNomes.add("Pedro");
         listaNomes.add("Igor");
         listaNomes.add("Israel");
         listaNomes.add("Gustavo Serapião");
         listaNomes.add("Júlio");
 
         // Iterando na fila
         for (String nome : listaNomes) {
             System.out.println(nome);
         }
 
         System.out.println("------\n");
         // Retornando elemento pelo indice
         System.out.println(listaNomes.get(2));
 
         System.out.println("------\n");
         // Removendo o elemento por indice
         // listaNomes.remove(0);
         // Removendo o elemento por referência do objeto
         listaNomes.remove(gusta);
         // System.out.println(listaNomes.get(2));
         
         // Removendo o elementos por condicional
         listaNomes.removeIf(nome -> nome.contains("i") || nome.contains("I"));
         
         // Iterando a lista
         listaNomes.forEach(nome -> System.out.println(nome));
         
         // Removendo todos os itens
         listaNomes.clear();
 
         // -----------------------------Desafio
 
         List<Pessoa> listaPessoas = new ArrayList<>();
 
         listaPessoas.add(new Pessoa("Cleber"));
         listaPessoas.add(new Pessoa("Roberto"));
         listaPessoas.add(new Pessoa("Teste"));
         listaPessoas.add(new Pessoa("Teste 2"));
 
         // Removendo e adicionando elementos
         listaPessoas.remove(listaPessoas.size() - 1);
         listaPessoas.add(new Pessoa("Teste 3"));
         listaPessoas.add(new Pessoa("Teste 4"));
         listaPessoas.remove(listaPessoas.size() - 1);
 
         listaPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
