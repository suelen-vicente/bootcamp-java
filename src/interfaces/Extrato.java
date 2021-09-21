package interfaces;

public class Extrato {
	
	public void geraExtrato(Conta conta) {
		
		System.out.println("Saldo Atual");
		System.out.println(conta.getSaldo());
	}
}
