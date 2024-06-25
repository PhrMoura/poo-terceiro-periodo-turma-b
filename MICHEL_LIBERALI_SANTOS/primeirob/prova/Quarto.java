    private int numero;
    private String tipo;
    private boolean disponivel;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}
