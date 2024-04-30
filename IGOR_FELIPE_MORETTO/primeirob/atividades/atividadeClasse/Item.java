package primeirob.atividades.atividadeclasse;

import java.util.Scanner;

public class Item {
    private int [] id = new int[99]; 
    private String [] nome = new String[99]; 
    private String [] tipo = new String[99]; 
    private int [] valor = new int[99]; 
    Scanner demo = new Scanner(System.in);

   
    public int[] getId() {
        return id;
    }


    public void setId(int[] id) {
        this.id = id;
    }


    public String[] getNome() {
        return nome;
    }


    public void setNome(String[] nome) {
        this.nome = nome;
    }


    public String[] getTipo() {
        return tipo;
    }


    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }


    public int[] getValor() {
        return valor;
    }


    public void setValor(int[] valor) {
        this.valor = valor;
    }

    

    public Item (){
        this.id = getId();
        this.nome = getNome();
        this.tipo = getTipo();
        this.valor = getValor();
    }
    // public void gerarDescricao(){
    //     for (int i = 0; i < getId().length; i++) {
    //         String msg = "Produtos: \n"
    //         .concat("Item " + getNome()[i])
    //         .concat(", id " + getId()[i])
    //         .concat(", o tipo é " + getTipo()[i] + " e o valor é R$" + getValor()[i]);
    //         System.out.println(msg);
    //     }
    // }
}
