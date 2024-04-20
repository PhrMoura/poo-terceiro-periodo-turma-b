package primeirob.atividades.listacinco;

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

    vendedor.salarioRecebido[0] = 2000.00;
    vendedor.salarioRecebido[1] = 3000.00;
    vendedor.salarioRecebido[2] = 1900.00;

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

    // data de hoje
    Date dataAtual = new Date();
    // data de hoje mas com os parametros ano ,mes e dia
    Date dataSemHora = new Date(dataAtual.getYear(), dataAtual.getMonth(), dataAtual.getDate());
    // data de 23 de setembro de 2002
    Date dataDeAniversario = new Date(105, 9, 06);

    Long diaEmMs = 86400000l;
    Long mesEmMS = 2629800000l;

    System.out.println("Data de hoje: " + dataAtual);
    System.out.println("Data sem hora: " + dataSemHora);
    System.out.println("Meu aniversario: " + dataDeAniversario);

    System.out.println("Dias de vida: " + (dataAtual.getTime() - dataDeAniversario.getTime()) / diaEmMs);
    System.out.println("Meses de vida: " + (dataAtual.getTime() - dataDeAniversario.getTime()) / mesEmMS);

  }
}
