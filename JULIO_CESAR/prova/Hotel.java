package PROVA.JAVA;


class Hotel {
    private CadastroCliente cadastroCliente;
    private CadastroQuarto cadastroQuarto;

    public Hotel() {
        this.cadastroCliente = new CadastroCliente();
        this.cadastroQuarto = new CadastroQuarto();
    }
 