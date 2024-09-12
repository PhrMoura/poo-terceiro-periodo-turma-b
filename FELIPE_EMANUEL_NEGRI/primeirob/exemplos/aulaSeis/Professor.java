package primeirob.exemplos.aulaSeis;

public class Professor {
    
    String nome;

    String materia;
    
    public void apresentarse() {
        String msg = "Só salvin meu vulgo é malvadao"
            .concat(nome)
            .concat("e eu sou o professor da putaria")
            .concat(materia);
        System.out.println(msg);
    }
}
