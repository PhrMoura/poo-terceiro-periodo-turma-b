package poo.ListaSete;

public class Main {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();

        gerente1.nome = "Joao";
        gerente1.idade= 25;
        gerente1.loja="lojaJoao";
        gerente1.salarioBase=3000;
        gerente1.enderecoGerente.cidade = "palotina";
        gerente1.enderecoGerente.bairro = "Centro";
        gerente1.enderecoGerente.complemento = "Perto do lago";
        gerente1.enderecoGerente.estado = "Paraná";
        gerente1.enderecoGerente.numero = "1637";

        gerente1.apresentarse();
    }

}
