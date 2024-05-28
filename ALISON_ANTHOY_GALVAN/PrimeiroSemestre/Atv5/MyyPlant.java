public class MyyPlant {
    public static void main(String[] args) {
        
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();

        vendedor1.nome = "Geber";
        vendedor2.nome = "Welington";
        vendedor3.nome = "Moisés";

        vendedor1.idade = "37";
        vendedor2.idade = "23";
        vendedor3.idade = "59";

        vendedor1.cidade = "Ourinhos";
        vendedor2.cidade = "Varginha";
        vendedor3.cidade = "Ceilândia";

        vendedor1.bairro = "Vila Sândano";
        vendedor2.bairro = "Loteamento Terreirão";
        vendedor3.bairro = "Guariroba";

        vendedor1.rua = "Manuel Vieira Pinto";
        vendedor2.rua = "Odilon Salgado";
        vendedor3.rua = "Helio Prates";

        vendedor1.salarioBase = 3000d;
        vendedor2.salarioBase = 1800d;
        vendedor3.salarioBase = 4700d;

        vendedor1.salarioRecebido = 2700d;
        vendedor2.salarioRecebido = 1600d;
        vendedor3.salarioRecebido = 4300d;

        Loja loja1 = new Loja();

        loja1.nomeFantasia = "Myy Plant";

        loja1.razaoSocial = "Contribuinte";

        loja1.cidade = "Cascavel";

        loja1.bairro = "Centro";

        loja1.rua = "Rua dos Bandeirantes";

        loja1.cnpj = "22.333.444/0001-99";

        Cliente cliente1 = new Cliente();

        cliente1.nome = "José da Silva";

        cliente1.cidade = "Ceilândia";

        cliente1.idade = "35";

        cliente1.bairro = "Centro";

        cliente1.rua = "Viente Machado";

        vendedor1.apresentarsevend();
        vendedor2.apresentarsevend();
        vendedor3.apresentarsevend();

        cliente1.apresentarsecli();

        loja1.apresentarseloja();

        vendedor1.calcularbonus();
        vendedor2.calcularbonus();
        vendedor3.calcularbonus();

        vendedor1.calcularmedia();

        loja1.calcularclientes();

        loja1.calcularvendedores();



    }
}
