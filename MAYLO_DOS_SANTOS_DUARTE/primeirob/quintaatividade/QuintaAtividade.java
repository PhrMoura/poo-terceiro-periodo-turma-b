package primeirob.quintaatividade;

public class QuintaAtividade {
    public static void main(String[] args) {

        // Criação da Loja - Instanciado Atributos e chamando Metodos.

        Loja lojaMatriz = new Loja();

        lojaMatriz.CPNJ = 39349196000160L;
        lojaMatriz.nomeFantasia = "Myy Plant - Matriz";
        lojaMatriz.razaoSocial = "MP PAGAMENTOS";
        lojaMatriz.cidade = "Cascavel";
        lojaMatriz.bairro = "Centro";
        lojaMatriz.rua = "Av Brasil";

        lojaMatriz.apresentarse();

        lojaMatriz.contarVendedores();
        lojaMatriz.contarClientes();


        // Criação de Clientes - Instanciado Atributos e chamando Metodos.

        // 1º Cliente 

        Cliente clienteUm = new Cliente();
        
        clienteUm.nome = "Enzo";
        clienteUm.idade = 11;
        clienteUm.cidade = "Cascavel";
        clienteUm.bairro = "Centro";
        clienteUm.rua = "Marechal Deodoro";

        clienteUm.apresentarse();

        lojaMatriz.clientes.add(clienteUm);
        lojaMatriz.contarClientes();       

        // 2º Cliente

        Cliente clienteDois = new Cliente();
        clienteDois.nome = "Thiago";
        clienteDois.idade = 23;
        clienteDois.cidade = "São Paulo";
        clienteDois.bairro = "Centro";
        clienteDois.rua = "Av Paulista";

        clienteDois.apresentarse();

        lojaMatriz.clientes.add(clienteDois);
        lojaMatriz.contarClientes();
        

        // Criação de Vendedores - Instanciado Atributos e chamando Metodos.

        // 1º Vendedor

        Vendedor vendedorUm = new Vendedor();
        
        vendedorUm.nome = "Bruno";
        vendedorUm.idade = 20;
        vendedorUm.cidade = "Quedas";
        vendedorUm.bairro = "Sei Lá";
        vendedorUm.rua = "Sei lá das Contas";
        vendedorUm.salarioBase = 1700.83;
        vendedorUm.salarioRecebido = new double[] {1300.84, 1323.45, 1440.55};
        vendedorUm.localTrabalho = lojaMatriz;

        vendedorUm.apresentarse();
        lojaMatriz.vendedores.add(vendedorUm);

        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();

        lojaMatriz.contarVendedores();

        // 2º Vendedor

        Vendedor vendedorDois = new Vendedor();
        vendedorDois.nome = "Kesia";
        vendedorDois.idade = 18;
        vendedorDois.cidade = "Cascavel";
        vendedorDois.bairro = "São Cristovão";
        vendedorDois.rua = "Rua Goias";
        vendedorDois.salarioBase = 7500.00;
        vendedorDois.salarioRecebido = new double[] {9575.53, 7567.65, 7567.43};
        vendedorDois.localTrabalho = lojaMatriz;
        
        vendedorDois.apresentarse();
        lojaMatriz.vendedores.add(vendedorDois);

        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();
        
        lojaMatriz.contarVendedores();
        
    }
    
}
