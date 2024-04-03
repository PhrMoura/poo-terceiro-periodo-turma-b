package primeirob.lista05;

import java.util.ArrayList;
import java.util.Iterator;

import primeirob.lista05.models.Cliente;
import primeirob.lista05.models.Loja;
import primeirob.lista05.models.Vendedor;

public class Atitivade01 {
    public static void main (String[] args) {
        Loja loja = new Loja();
        loja.nomeFantasia = "Loja AAA";
        loja.nomeSocial = "Loja BBB";
        loja.bairro = "Bairro";
        loja.cidade = "Cidade";
        loja.rua = "Rua";
        loja.cnpj = "CNPJ";

        Vendedor vendedor1 = new Vendedor();
        vendedor1.nome = "Vend1";
        vendedor1.bairro = "Bairro";
        vendedor1.cidade = "Cidade";
        vendedor1.idade = 22;
        vendedor1.rua = "Rua";
        vendedor1.loja = loja;
        vendedor1.salarioBase = 1000.0;
        vendedor1.salarioRecebido = new ArrayList<Double>();
        vendedor1.salarioRecebido.add(1000.0);
        vendedor1.salarioRecebido.add(1000.0);
        vendedor1.salarioRecebido.add(1000.0);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.nome = "Vend2";
        vendedor2.bairro = "Bairro";
        vendedor2.idade = 33;
        vendedor2.cidade = "Cidade";
        vendedor2.rua = "Rua";
        vendedor2.loja = loja;
        vendedor2.salarioBase = 100.0;
        vendedor2.salarioRecebido = new ArrayList<Double>();
        vendedor2.salarioRecebido.add(2000.0);
        vendedor2.salarioRecebido.add(1000.0);
        vendedor2.salarioRecebido.add(1500.0);

        Cliente cliente = new Cliente();
        cliente.nome = "Cliente1";
        cliente.bairro = "Bairro";
        cliente.cidade = "Cidade";
        cliente.idade = 11;
        cliente.rua = "Rua";
    
        loja.vendedores = new ArrayList<Vendedor>();
        loja.vendedores.add(vendedor1);
        loja.vendedores.add(vendedor2);
        loja.clientes = new ArrayList<Cliente>();
        loja.clientes.add(cliente);


        System.err.println("\n\nLoja:");
        loja.apresentarse();
        loja.contarClientes();
        loja.contarVendedores();

        System.err.println("\n\nVendedores:");
        Iterator<Vendedor> iteratorVendedor = loja.vendedores.iterator();
        while (iteratorVendedor.hasNext()) {
            Vendedor vend = iteratorVendedor.next();
            vend.apresentarse();
            vend.calcularMedia();
            vend.calcularBonus();
            System.err.println("\n");
        }

        System.err.println("\n\nClientes:");
        Iterator<Cliente> iteratorClientes = loja.clientes.iterator();
        while (iteratorClientes.hasNext()) {
            Cliente clie = iteratorClientes.next();
            clie.apresentarse();
        }
    }
}
