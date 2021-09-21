package interfaces;

public class TesteInterface {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(5000.00);
		contaCorrente.sacar(1000.00);
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(15000.00);
		poupanca.sacar(800.00);
		
		Extrato extrato = new Extrato();
		extrato.geraExtrato(contaCorrente);
		extrato.geraExtrato(poupanca);
		
	}
}
