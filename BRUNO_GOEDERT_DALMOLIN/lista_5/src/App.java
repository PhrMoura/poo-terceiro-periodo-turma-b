import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criando classe Vendedor!");
        var novoVendedor = new Vendedor("Felipe", 18, "Loja da Gabi", "Cascavel", "Centro", "Rua Araucaria", 2000.0, Arrays.asList(2000.0,3000.0, 4000.0));
        System.out.println("Apresentando Vendedor criado: " + novoVendedor.toString());
        System.out.println("Media de Salario do Vendedor: " + novoVendedor.calcularMedia());
        System.out.println("Media de Bonus do Vendedor: " + novoVendedor.calcularBonus()+ "\n\n");


        System.out.println("Criando classe Cliente!");
        var novoCliente = new Cliente("Bruno Goedert Dalmolin", 20, "Quedas do Iguaçu", "Centro", "Sem Fim");
        System.out.println("Apresentando cliente criado: " + novoCliente.toString() + "\n\n");

        System.out.println("Criando classe Vendedor!");
        var loja = new Loja("Loja da Gabi", "Lojinha da Gabi", "123123123", "Cascavel", "Centro", "Rua Araucaria", Arrays.asList(novoVendedor), Arrays.asList(novoCliente));
        System.out.println("Apresentando quantidade de clientes: " + loja.contarClientes());
        System.out.println("Apresentando quantidade de vendedores: " + loja.contarClientes());
        }
}
