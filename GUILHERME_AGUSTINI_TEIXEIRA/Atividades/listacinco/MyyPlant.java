package listacinco;

public class MyyPlant {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();
        Loja loja = new Loja();
        Vendedor vendedor2 = new Vendedor();
        Cliente cliente2 = new Cliente();

        vendedor.nome = "Sandrolax ";
        vendedor.idade = 25;
        vendedor.cidade = "Cascavel ";
        vendedor.bairro = "centro ";
        vendedor.rua = "avenida brasil ";
        vendedor.loja = loja;
        vendedor.salarioBase = 150d;
        vendedor.salarioRecebido = new Double[] { 300d, 200d, 100d };

        cliente.nome = "Jorge ";
        cliente.idade = 30;
        cliente.cidade = "Cascavel ";
        cliente.bairro = "centro ";
        cliente.rua = "abobrinha da silva ";

        loja.nomeFantasia = "Curitibana ";
        loja.razaoSocial = "Comércio ";
        loja.cnpj = 123891751d;
        loja.cidade = "Cascavel ";
        loja.bairro = "centro ";
        loja.rua = "mandiocal oliveira "; 
        loja.arrayVendedores[0] = vendedor;
        loja.arrayClientes[0] = cliente;

        vendedor2.nome = "Cleiton ";
        vendedor2.idade = 26;
        vendedor2.cidade = "Cascavel ";
        vendedor2.bairro = "FAG ";
        vendedor2.rua = "avenida fag ";
        vendedor2.loja = loja;
        vendedor2.salarioBase = 160d;
        vendedor2.salarioRecebido = new Double[] { 310d, 210d, 110d };

        cliente2.nome = "Mario ";
        cliente2.idade = 40;
        cliente2.cidade = "Toledo ";
        cliente2.bairro = "centro ";
        cliente2.rua = "abobrinha de jaraguá ";

        vendedor.apresentarse();
        vendedor.calcularMedia();
        vendedor.calcularBonus();
        cliente.apresentarse();
        loja.contarCliente();
        loja.contarVendedores();
        loja.apresentarse();
        vendedor2.apresentarse();
        vendedor2.calcularMedia();
        vendedor2.calcularBonus();
        cliente2.apresentarse();

    }

}
