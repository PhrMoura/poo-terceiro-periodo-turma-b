package primeirob.atividades.atividadeclasse;

public class Teste {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Cliente clienteDois = new Cliente();
        Cliente clienteTres = new Cliente();
        Loja loja = new Loja();
        Vendedor vendedor = new Vendedor();
        Item item = new Item();
        Gerente gerente = new Gerente();
        Pedido pedido = new Pedido();

        vendedor.nome = "Roger Guedes";
        vendedor.idade = 18;
        vendedor.bairro = "São José Operário";
        vendedor.cidade = "Capanema";
        vendedor.rua = "Tamoios";
        vendedor.loja = loja ;
        loja.contadorVendedor++;
        
        vendedor.apresentarse();

        cliente.nome = "Yuri Alberto";
        cliente.idade = 20;
        loja.contadorCliente++;
        clienteDois.nome = "Cássio";
        clienteDois.idade = 35;
        loja.contadorCliente++;
        clienteTres.nome = "Fagner";
        clienteTres.idade = 48;
        loja.contadorCliente++;

        cliente.apresentarse();
        clienteDois.apresentarse();
        clienteTres.apresentarse();

        loja.nomeFantasia = "Myy Plant";
        loja.razaoSocial = "Floricultura Dona Gabrielinha LTDA.";
        loja.bairro = "Parque Verde";
        loja.cidade = "Cascavel - PR";
        loja.cnpj = "00.000.000/0001-01";
        loja.numero = 1010;
        loja.complemento = "Casa A";
        loja.rua = "Avenida da Torres";

        loja.apresentarLogradouro();
        loja.contarClientes();
        loja.contarVendedores();

        gerente.nome = "Neymar";
        gerente.idade = 32;
        gerente.loja = loja;

        gerente.apresentarse();

        item.gerarDescricao();

        pedido.calcularValorTotal();
    }
}
