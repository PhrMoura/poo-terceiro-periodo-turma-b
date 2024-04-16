package primeirob.atividades;

import java.util.Date;

public class Myyplant {
  public static void main(String[] args) {
    System.out.println("-----------------------");

    // abrindo um objeto com base na classe Vendedor e preenchendo
    Vendedor vendedor = new Vendedor();
    vendedor.nome = "Redeyes";
    vendedor.idade = 21;
    vendedor.loja = "Myy Plant";
    vendedor.salarioBase = 2000.00;

    // chamando a função apresentarse da classe Vendedor
    vendedor.apresentarse();

    // chamando a função media da classse Vendedor
    System.out.println("Media salario: " + vendedor.calcularMedia());

    // chamando a função bonus da classe Vendedor
    System.out.println("Bonus recebido: " + vendedor.calcularBonus());

    System.out.println("-----------------------");

    // abrindo um objeto com base na classe Cliente e preenchendo
    Cliente cliente = new Cliente();
    cliente.nome = "Neita";
    cliente.idade = 25;

    // chamando a função apresentarse da classe Cliente
    cliente.apresentarse();

    System.out.println("-----------------------");

    // abrindo um objeto com base na classe Loja e preenchendo
    Loja loja = new Loja();
    loja.nomeFantasia = "Myyplant";
    loja.cnpj = "000.000.000-00";
    loja.cidade = "Cascavel";
    loja.bairro = "Loteamento FAG";
    loja.rua = "Rua 2845";

    // adiciona cliente e vendedor na arraylist
    loja.arrayClientes.add(cliente);
    loja.arrayVendedores.add(vendedor);

    // mostra a quantidade de clientes e vendedores no total
    loja.contarClientes();
    loja.contadorVendedores();

    // chama a função de apresentarse da classe Loja
    loja.apresentarse();

    System.out.println("-----------------------");

    Date dataAtual = new Date();

    System.out.println("Data de hoje: " + dataAtual);
  }
}
