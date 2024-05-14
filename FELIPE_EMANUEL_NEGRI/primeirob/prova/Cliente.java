package FELIPE_EMANUEL_NEGRI.primeirob.prova;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String nome;
    private int idade;
    private Date dataChekin;
    
    public Cliente(String nome, int idade) {
        
        this.nome = nome;
        this.idade = idade;
        this.dataChekin = new Date();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Date getDataChekin() {
        return dataChekin;
    }
    public void setDataChekin(Date dataChekin) {
        this.dataChekin = dataChekin;
    }
    
    public void chekin(){
    System.out.println("Chekin realizado: " + dataChekin);
    }


}
