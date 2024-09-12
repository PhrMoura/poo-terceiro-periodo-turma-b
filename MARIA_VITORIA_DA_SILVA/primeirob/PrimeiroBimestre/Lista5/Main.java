package primeirob.PrimeiroBimestre.Lista5;

import Lista5.Informacoes.Cliente;
import Lista5.Informacoes.Vendedor;

public class Main {
    public static void main(String[] args) {
        Vendedor primeiroVendedor = new Vendedor();
        Cliente primeiroCliente = new Cliente();
        Informacoes testInstance = new Informacoes(); 
        Informacoes.Loja primeiraLoja = testInstance.new Loja(); 

        primeiraLoja.setVendedores(new Vendedor[]{primeiroVendedor});
        primeiraLoja.setClientes(new Cliente[]{primeiroCliente});

        primeiroVendedor.nomeVendedor = "Robson";
        primeiroVendedor.idadeVendedor = 19;
        primeiroVendedor.lojaVendedor = "Myy Plant";
        primeiroVendedor.cidadeVendedor = "Cascavel";
        primeiroVendedor.bairroVendedor = "Centro";
        primeiroVendedor.ruaVendedor = "Paraná 1";

        primeiroVendedor.apresentarse();

        primeiroCliente.nomeCliente = "Vitoria";
        primeiroCliente.idadeCliente = 30;
        primeiroCliente.cidadeCliente = "Cascavel";
        primeiroCliente.bairroCliente = "São Cristóvão";
        primeiroCliente.ruaCliente = "Paraná 6";

        primeiroCliente.apresentarse();

        primeiraLoja.nomeFantasia = "Myy Plant";
        primeiraLoja.razaoSocial = "Myy Plant Ltda";
        primeiraLoja.cnpj = 123456789;
        primeiraLoja.cidade = "Cascavel";
        primeiraLoja.bairro = "Centro";
        primeiraLoja.rua = "Paraná 1";

        primeiraLoja.apresentarse();
    }
}
