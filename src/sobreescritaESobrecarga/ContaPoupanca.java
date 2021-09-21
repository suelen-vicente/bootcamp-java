package sobreescritaESobrecarga;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	public void sacar(Double valor, Double taxaOperacao) {
		this.saldo -= valor + taxaOperacao;
	}
	
}
