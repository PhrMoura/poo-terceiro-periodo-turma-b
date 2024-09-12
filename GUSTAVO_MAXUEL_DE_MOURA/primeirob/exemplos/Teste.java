package primeirob.exemplos;

public class Teste {
    public static void main(String[] args) {
        Loja lojaImport = new Loja();
        Vendedor vend = new Vendedor();
        Cliente clienteIn = new Cliente();
        vend.nome = "Gustavo";
        vend.bairro = "São José Operário";
        vend.cidade = "Capanema";
        vend.idade = 20; 
        vend.loja = lojaImport.nomeFantasia;
        vend.rua = "Av. Brasil";
        vend.salarioBase = 2000;
        lojaImport.bairro = "São José Operário";
        lojaImport.cidade = "Capanema";
        lojaImport.rua = "Av. Brasil";
        clienteIn.nome = "José Andrade";
        clienteIn.idade = 20;
        vend.apresentarSe();
        lojaImport.apresentarSe();
        clienteIn.apresentarSe();
    }
    
}
