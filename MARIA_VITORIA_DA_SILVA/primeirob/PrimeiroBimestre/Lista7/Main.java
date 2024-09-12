package primeirob.PrimeiroBimestre.Lista7;

public class Main {
    public static void main(String[] args) {

        //Objeto Endereço
        Endereco endereco = new Endereco("Centro", "Rua 1", "Cascavel", "Paraná", 123, "Casa 1");
        endereco.presentarLogradouro();

        //Objeto Vendedor
        Vendedor novoVendedor = new Vendedor("Robson", 20, "Myy Plant", 0, null);
        novoVendedor.apresentarse();

        //Objeto Gerente
        Gerente gerente = new Gerente("Marcia", 30, "Myy Plant", 50000, new double[]{20000, 15000, 18000});
        System.out.println(gerente);

        //Objeto Loja
        Loja loja = new Loja("Myy Plant", "Myy Plant LTDA", "123456789", endereco);
        loja.gerarDescricaoLoja();
        
    }
}

