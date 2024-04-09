package atividades.atividade5;

import java.util.ArrayList;
import java.util.Iterator;

public class mainAtividade5 {
    public static void main(String[] args) {

        Loja loja = new Loja();
        loja.nomeFantasia = "Myy Plant";
        loja.razãoSocial = "Gabrielinha's shop";
        loja.cidade = "Cascavel";
        loja.bairro = "Centro";
        loja.rua = "Av Brasil";
        loja.cnpj = "varios numeros de cnpj inseridos aqui";

        Vendedor vendedor1 = new Vendedor();
        vendedor1.loja = "Myy Plant";
        vendedor1.cidadeVendedor = "Cascavel";
        vendedor1.nomeVendedor = "Maylo";
        vendedor1.bairroVendedor = "shangrila";
        vendedor1.ruaVendedor = "Morada de Judas";
        vendedor1.idadeVendedor = 35;
        vendedor1.salarioRecebido = new ArrayList<Double>();
        vendedor1.salarioRecebido.add(1500.0);
        vendedor1.salarioRecebido.add(1600.0);
        vendedor1.salarioRecebido.add(1550.0);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.loja = "Myy Plant";
        vendedor2.cidadeVendedor = "Cascavel";
        vendedor2.nomeVendedor = "Bruno";
        vendedor2.bairroVendedor = "arabe";
        vendedor2.ruaVendedor = "mahal habib";
        vendedor2.idadeVendedor = 47;
        vendedor2.salarioRecebido = new ArrayList<Double>();
        vendedor2.salarioRecebido.add(1500.0);
        vendedor2.salarioRecebido.add(1500.0);
        vendedor2.salarioRecebido.add(1550.0);

        Cliente cliente1 = new Cliente();
        cliente1.nomeCliente = "Felipe";
        cliente1.cidadeCliente = "Cascavel";
        cliente1.bairroCliente = "Lamal";
        cliente1.ruaCliente = "bingbong";
        cliente1.idadeCliente = 19;

        loja.vendedores = new ArrayList<Vendedor>();
        loja.vendedores.add(vendedor1);
        loja.vendedores.add(vendedor2);
        loja.clientes = new ArrayList<Cliente>();
        loja.clientes.add(cliente1);

        loja.apresentarse();
        loja.contarVendedores();
        loja.contarClientes();

        System.out.println("Vendedores:");
        Iterator<Vendedor> iteratorVendedor = loja.vendedores.iterator();
        while (iteratorVendedor.hasNext()) {
            Vendedor vendedorIte = iteratorVendedor.next();
            vendedorIte.apresentarseVendedor();
            vendedorIte.calcularMedia();
            vendedorIte.calcularBonus();
            System.out.println("\n");
        }

        System.out.println("Clientes:");
        Iterator<Cliente> iteratorClientes = loja.clientes.iterator();
        while (iteratorClientes.hasNext()) {
            Cliente clienteIte = iteratorClientes.next();
            clienteIte.apresentarse();
        }
    }
}
