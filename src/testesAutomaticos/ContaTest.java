package testesAutomaticos;

import junit.framework.TestCase;

public class ContaTest extends TestCase{
	
	public void testaSaque() {
		Double saldoTeste = 100.00;
		Double taxaOperacaoTeste = 0.50;
		Double valorSaque = 50.00;
		
		Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
		conta.sacar(valorSaque);
		
		assertEquals(saldoTeste - (valorSaque + taxaOperacaoTeste) , conta.getSaldo());
	}
	
	public void testaDeposito() {
		Double saldoTeste = 300.00;
		Double taxaOperacaoTeste = 0.50;
		Double valorSaque = 90.00;
		
		Conta conta = new Conta(saldoTeste, taxaOperacaoTeste);
		conta.depositar(valorSaque);
		
		assertEquals(saldoTeste + (valorSaque - taxaOperacaoTeste) , conta.getSaldo());
	}
}
