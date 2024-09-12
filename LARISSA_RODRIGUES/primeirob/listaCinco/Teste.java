package primeiroB.listaCinco;

public class Teste {
    public static void main(String[] args) {
        // acesso classe Cliente
        Cliente clienteUm = new Cliente();
        Cliente clienteDois = new Cliente();
        Cliente clienteTres = new Cliente();

        clienteUm.nome = "Pedro";
        clienteUm.idade = 21;
        clienteUm.apresentarse();

        clienteDois.nome = "Jessica";
        clienteDois.idade = 59;
        clienteDois.apresentarse();

        clienteTres.nome = "Claudio";
        clienteTres.idade = 37;
        clienteTres.apresentarse();
        
        System.out.println("\n---------------");

        // acesso classe Vendedor
        Vendedor vendedorUm = new Vendedor();
        Vendedor vendedorDois = new Vendedor();
        Vendedor vendedorTres = new Vendedor();

        vendedorUm.nome = "João";
        vendedorUm.idade = 30;
        vendedorUm.loja = "FloriudaShop";
        vendedorUm.salarioBase = 2000;
        vendedorUm.apresentarse();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        

        vendedorDois.nome = "Patrícia";
        vendedorDois.idade = 34;
        vendedorDois.loja = "FloriudaShop";
        vendedorDois.salarioBase = 4000;
        vendedorDois.apresentarse();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();

        vendedorTres.nome = "Ana";
        vendedorTres.idade = 23;
        vendedorTres.loja = "FloriudaShop";
        vendedorTres.salarioBase = 1600;
        vendedorTres.apresentarse();
        vendedorTres.calcularMedia();
        vendedorTres.calcularBonus();
        
        System.out.println("\n---------------");


        // acesso classe Loja
        Loja loja = new Loja();

        loja.nomeFantasia = "FloriudaShop";
        loja.razaoSocial = "FloriudaShop Comércio de Flores e Artigos Florais Ltda.";
        loja.cnpj = "74.920.581/0001-36";
        loja.cidade = "Cascavel";
        loja.bairro = "Santo Inácio";
        loja.rua = "Av. das Torres";
        loja.apresentarse();

        loja.adicionarCliente(clienteUm);
        loja.adicionarCliente(clienteDois);
        loja.adicionarCliente(clienteTres);
        loja.contarCliente();

        loja.adicionarVendedor(vendedorUm);
        loja.adicionarVendedor(vendedorDois);
        loja.adicionarVendedor(vendedorTres);
        loja.contarVendedor();

    }
}
