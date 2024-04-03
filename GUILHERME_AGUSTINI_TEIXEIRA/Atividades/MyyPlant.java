public class MyyPlant {

    string nome;
    int idade;
    string loja1;
    string cidade;
    string bairro;
    string rua;
    float salarioBase;
    float[] salarioRecebido = new float[100];
    string nomeFantasia;
    string razaoSocial;
    int cnpj;
    int[] arrayVendedores = new int[100];
    int[] arrayClientes = new int[100];

    MyyPlant vendedor = new MyyPlant();


    vendedor.nome = "";
    vendedor.idade = ;
    vendedor.loja1 = "";
    vendedor.cidade = "";
    vendedor.bairro = "";
    vendedor.rua = "";
    vendedor.salarioBase = ;
    vendedor.salarioRecebido = ;

    MyyPlant cliente = new MyyPlant();

    cliente.nome = "";
    cliente.idade = ;
    cliente.loja1 = "";
    cliente.cidade = "";
    cliente.bairro = "";
    cliente.rua = "";

    MyyPlant loja = new MyyPlant();

    loja.nomeFantasia = ;
    loja.razaoSocial = ;
    loja.cnpj = ;
    loja.cidade = ;
    loja.bairro = ;
    loja.rua = ;
    loja.arrayVendedores = ;
    loja.arrayClientes = ;
    




    public void apresentarse(){


        float calcularMedia = (salarioBase + salarioRecebido)/2;
        float calcularBonus = salarioBase*0.2;

        String msg = "Nome do cliente:"
                .concat(nome)
                .concat("idade do cliente:")
                .concat(idade)
                .concat("Sua média é:")
                .concat(calcularMedia)
                .concat("Seu bônus é:")
                .concat(calcularBonus)
                .concat("A quantidade de clientes é:")
                .concat(arrayClientes)
                .concat("A quantidade de vendedores é:")
                .concat(arrayVendedores)
                .concat("O nome da loja é:")
                .concat(nomeFantasia)
                .concat("O cnpj é:")
                .concat(cnpj)
                .concat("O endereço é:")
                .concat(rua)
                .concat(bairro)
                .concat(cidade);

  
        System.out.println(msg);
        
    }

}
