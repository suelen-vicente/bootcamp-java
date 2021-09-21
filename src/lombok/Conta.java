package lombok;

public class Conta {
	private Double saldo;
	private String tipoConta;
	private Double taxaOperacao;
	
	public Conta(Double saldo, String tipoConta, Double taxaOperacao) {
		super();
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.taxaOperacao = taxaOperacao;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Double getTaxaOperacao() {
		return taxaOperacao;
	}

	public void setTaxaOperacao(Double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	
}
