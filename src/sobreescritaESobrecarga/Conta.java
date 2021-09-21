package sobreescritaESobrecarga;

public class Conta {
	
	public Double saldo;
	public Double taxaOperacao;
	
	public Conta(double saldo) {
		this.saldo = saldo;
		this.taxaOperacao = 0.45;
	}
	
	public void depositar(Double valor) {
		saldo += valor - taxaOperacao;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}

}
