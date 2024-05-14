package primeirob.setimaatividade;

public class Funcionario extends Pessoa {
    private double salarioBase;

    private double[] salarioRecebido;

    private Loja localTrabalho;

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double[] getSalarioRecebido() {
		return salarioRecebido;
	}

	public void setSalarioRecebido(double[] salarioRecebido) {
		this.salarioRecebido = salarioRecebido;
	}

	public Loja getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(Loja localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

    
    
}
