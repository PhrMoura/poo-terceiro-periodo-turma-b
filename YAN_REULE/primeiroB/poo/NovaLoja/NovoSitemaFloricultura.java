package poo.NovaLoja;

public class NovoSitemaFloricultura {

    public static void main(String[] args) {
        Loja novaLoja = new Loja(null, null, null, null, null, null);
        Vendedor vendedor1 = new Vendedor();
        Cliente cliente1 = new Cliente();

        Vendedor vendedor2 = new Vendedor();
        Cliente cliente2 = new Cliente();

        vendedor1.nome = "Claudia";
        vendedor1.bairro = "interlagos";
        vendedor1.cidade = "Palotina";
        vendedor1.idade = 22;
        vendedor1.loja = "Myy Plant";
        vendedor1.rua = "1 de maio";
        vendedor1.salarioBase = 1220.50;

        vendedor1.apresentarSe();
        System.out.println(vendedor1.calcularBonus());
        System.out.println(vendedor1.calcularMedia());

        vendedor2.nome = "Claudia";
        vendedor2.bairro = "interlagos";
        vendedor2.cidade = "Palotina";
        vendedor2.idade = 22;
        vendedor2.loja = "Myy Plant";
        vendedor2.rua = "1 de maio";
        vendedor2.salarioBase = 1220.50;

        vendedor2.apresentarSe();
        System.out.println(vendedor2.calcularBonus());
        System.out.println(vendedor2.calcularMedia());

        cliente1.nome = "Pedro";
        cliente1.bairro = "centro";
        cliente1.cidade = "Palotina";
        cliente1.idade = 18;
        cliente1.rua = "24 de junho";

        cliente1.apresentarSe();

        cliente2.nome = "Pedro";
        cliente2.bairro = "centro";
        cliente2.cidade = "Palotina";
        cliente2.idade = 18;
        cliente2.rua = "24 de junho";

        cliente2.apresentarSe();

        novaLoja.bairro = "centro";
        novaLoja.cidade = "Palotina";
        novaLoja.cnpj = "929-3849-92-3920.00";
        novaLoja.nomeFantasia = "30pra1";
        novaLoja.razaoSocial = "TrintaPraUm S.A";
        novaLoja.rua = "A.V President Kenned";
        novaLoja.clientes.add(cliente1);
        novaLoja.clientes.add(cliente2);
        novaLoja.vendedores.add(vendedor2);
        novaLoja.vendedores.add(vendedor1);

        novaLoja.apresentarSe();
        System.out.println(novaLoja.contarClientes());
        System.out.println(novaLoja.contarVendedores());
        
    }
}
