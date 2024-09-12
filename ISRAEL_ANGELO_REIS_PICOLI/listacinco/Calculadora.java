package listacinco;

public class Calculadora {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();
        Vendedor vendedorDois = new Vendedor();
        Cliente cliente = new Cliente();
        Loja loja = new Loja();

        vendedor.nome = "Melina";
        vendedor.idade = "23";
        vendedor.loja = "Myy Plant";
        vendedor.cidade = "Olimpo";
        vendedor.bairro = "Templo";
        vendedor.rua = "Pedras Brancas";
        vendedor.salarioBase = 2000;
        vendedor.salarioRecebido = new double[] { 2000, 2100, 2150 };

        vendedorDois.nome = "Astolfo";
        vendedorDois.idade = "25";
        vendedorDois.loja = "Myy Plant";
        vendedorDois.cidade = "Olimpo";
        vendedorDois.bairro = "Templo";
        vendedorDois.rua = "Norte da Manhã";
        vendedorDois.salarioBase = 2500;
        vendedorDois.salarioRecebido = new double[] { 2500, 2400, 2450 };

        cliente.nome = "Sasha";
        cliente.idade = "32";
        cliente.cidade = "Olimpo";
        cliente.bairro = "Atlantida";
        cliente.rua = "Vale Dinicio";

        loja.nomeFantasia = "Myy Plant";
        loja.razaoSocial = "Industrias Olimpo";
        loja.cnpj = "234.874.345-00";
        loja.cidade = "Olimpo";
        loja.bairro = "Praça dos Corvos";
        loja.rua = "Creta";

        loja.vendedores = new Vendedor[] { vendedor, vendedorDois };
        loja.clientes = new Cliente[] { cliente };

        vendedor.apresentarse();
        System.out.println(String.format("Média de salário do vendedor: %.2f", vendedor.calcularMedia()));
        System.out.println(String.format("Bônus do vendedor: %.2f\n", vendedor.calcularBonus()));

        vendedorDois.apresentarse();
        System.out.println(String.format("Média de salário do vendedor: %.2f", vendedorDois.calcularMedia()));
        System.out.println(String.format("Bônus do vendedor: %.2f\n", vendedorDois.calcularBonus()));

        cliente.apresentarse();
        loja.apresentarse();

        System.out.println("Contagem de vendedores: " + loja.contarVendedores());
        System.out.println("Contagem de clientes: " + loja.contarClientes());
    }
}
