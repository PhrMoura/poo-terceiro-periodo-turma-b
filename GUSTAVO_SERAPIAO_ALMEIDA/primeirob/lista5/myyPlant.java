package lista5;

public class myyPlant {
    public static void main(String[] args) {
        
        Vendedor vendedorUm = new Vendedor();
        Vendedor vendedorDois = new Vendedor();

        System.out.println("Vendedores");

        vendedorUm.nome = "José";
        vendedorUm.idade = 36;
        vendedorUm.loja = "Myy Plant Centro";
        vendedorUm.cidade = "Ubiratã";
        vendedorUm.bairro = "Centro";
        vendedorUm.rua = "Nilza de Oliveira Pipino";
        
        vendedorUm.apresentarVendedor();
        vendedorUm.calcularBonus();
        vendedorUm.calcularMedia();

        System.out.println("\n");

        vendedorDois.nome = "Luíz";
        vendedorDois.idade = 42;
        vendedorDois.loja = "Myy Plant Centro";
        vendedorDois.cidade = "Ubiratã";
        vendedorDois.bairro = "Centro";
        vendedorDois.rua = "Rua XYZ";

        vendedorDois.apresentarVendedor();
        vendedorDois.calcularBonus();
        vendedorDois.calcularMedia();

        System.out.println("\n");

        Cliente clienteUm = new Cliente();
        Cliente clienteDois = new Cliente();

        clienteUm.nome = "Felipe";
        clienteUm.idade = 25;
        clienteUm.cidade = "Xique Xique";
        clienteUm.bairro = "Xique";
        clienteUm.rua = "Xiqui";

        clienteUm.apresentarCliente();

        System.out.println("\n");

        clienteDois.nome = "Cloutilde";
        clienteDois.idade = 78;
        clienteDois.cidade = "Salvador";
        clienteDois.bairro = "N/A";
        clienteDois.rua = "Rua das flores";

        clienteDois.apresentarCliente();

        System.out.println("\n");

        Loja lojaUm = new Loja();

        lojaUm.nomeFantasia = "myy Plant";
        lojaUm.razaoSocial = "Floricultura LTDA";
        lojaUm.cnpj = "00.000.000/0000-00";
        lojaUm.bairro = "Centro";
        lojaUm.cidade = "Ubiratã";
        lojaUm.rua = "Nilza de Oliveira Pepino";

        lojaUm.apresentarLoja();
        lojaUm.contarCliente();
        lojaUm.contarVendedores();
    }
}
