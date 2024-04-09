package primeirob.myyplant;

public class Teste {

    public static void main(String[] args) {
        // Criando uma instância da loja
        Loja minhaLoja = new Loja();
        minhaLoja.nomeFantasia = "Minha Loja";
        minhaLoja.razaoSocial = "Empresa XYZ";
        minhaLoja.cnpj = 123456789;
        minhaLoja.cidade = "Minha Cidade";
        minhaLoja.bairro = "Meu Bairro";
        minhaLoja.rua = "Minha Rua";

        // Criando instâncias de clientes
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Cliente 1";
        cliente1.idade = 30;
        cliente1.cidade = "Cidade do Cliente 1";
        cliente1.bairro = "Bairro do Cliente 1";
        cliente1.rua = "Rua do Cliente 1";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Cliente 2";
        cliente2.idade = 25;
        cliente2.cidade = "Cidade do Cliente 2";
        cliente2.bairro = "Bairro do Cliente 2";
        cliente2.rua = "Rua do Cliente 2";

        // Adicionando clientes à loja
        minhaLoja.arrayClientes[0] = cliente1;
        minhaLoja.arrayClientes[1] = cliente2;

        // Criando instâncias de vendedores
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nome = "Vendedor 1";
        vendedor1.idade = 35;
        vendedor1.cidade = "Cidade do Vendedor 1";
        vendedor1.bairro = "Bairro do Vendedor 1";
        vendedor1.rua = "Rua do Vendedor 1";
        vendedor1.salarioBase[0] = 2000;
        vendedor1.salarioBase[1] = 2500;
        vendedor1.salarioBase[2] = 2200;

        // Inicializando o array salarioRecebido com valores padrão
        vendedor1.salarioRecebido[0] = 0;
        vendedor1.salarioRecebido[1] = 0;
        vendedor1.salarioRecebido[2] = 0;

        Vendedor vendedor2 = new Vendedor();
        vendedor2.nome = "Vendedor 2";
        vendedor2.idade = 28;
        vendedor2.cidade = "Cidade do Vendedor 2";
        vendedor2.bairro = "Bairro do Vendedor 2";
        vendedor2.rua = "Rua do Vendedor 2";
        vendedor2.salarioBase[0] = 1800;
        vendedor2.salarioBase[1] = 2300;
        vendedor2.salarioBase[2] = 2100;

        // Inicializando o array salarioRecebido com valores padrão
        vendedor2.salarioRecebido[0] = 0;
        vendedor2.salarioRecebido[1] = 0;
        vendedor2.salarioRecebido[2] = 0;

        // Adicionando vendedores à loja
        minhaLoja.arrayVendedores[0] = vendedor1;
        minhaLoja.arrayVendedores[1] = vendedor2;

        // Testando os métodos das classes
        minhaLoja.apresentarse();

        // Iterando sobre os clientes da loja
        for (Cliente cliente : minhaLoja.arrayClientes) {
            if (cliente != null) {
                cliente.apresentarse();
            }
        }

        // Iterando sobre os vendedores da loja
        for (Vendedor vendedor : minhaLoja.arrayVendedores) {
            if (vendedor != null) {
                vendedor.apresentarse();
                System.out.println("Média salarial: " + vendedor.calcularMedia());
                System.out.println("Bônus: " + vendedor.calcularBonus());
            }
        }

    }
}
