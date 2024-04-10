package primeirob.listaCinco;

public class myyPlant {
    public static void main(String[] args) {
        
        
        Vendedor vendedorUm = new Vendedor();

        vendedorUm.nome = "Prepti";
        vendedorUm.idade = 19;
        vendedorUm.loja = "myyPlant";
        vendedorUm.salarioBase = 1500;
        
        vendedorUm.salarioRecebido[0] = 2000;
        vendedorUm.salarioRecebido[1] = 2500;
        vendedorUm.salarioRecebido[2] = 2800;

        vendedorUm.apresentarse();

        System.out.println("------------------------");
        
        Cliente clienteUm = new Cliente();
        
        clienteUm.nome = "Cabritoz";
        clienteUm.idade = 19;
        
        clienteUm.apresentarse();
        
        System.out.println("------------------------");

        Loja loja = new Loja();
        loja.nomeFantasia = "myyPlant";
        loja.cnpj = "12345678912";
        loja.cidade = "Rolandia";
        loja.bairro = "Santa Felicidade";
        loja.rua = "Carlos Gomes";

        loja.arrayCliente.add(clienteUm);
        loja.arrayVendedores.add(vendedorUm);

        loja.contaClientes();
        loja.contaVendedor();

        loja.apresentarse();

        System.out.println("-------------------------");


    }
}
