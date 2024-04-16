package primeirob.atividades.atividadeclasse;

public class Endereço {
    String estado;
    String cidade;
    String bairro;
    String rua;
    Integer numero;
    String complemento;
    
    public void apresentarLogradouro(){
        String msg = "O endereço da Myy Plant é em "
        .concat(cidade)
        .concat(", bairro " + bairro)
        .concat(", na " + rua + " número " + numero)
        .concat(", " + complemento);

        System.out.println(msg);
    }
}
