package sobreescritaESobrecarga;

public class TesteSobreescritaSobrecarga {
	
public static void main(String[] args) {
		Conta contaComum = new Conta(9000.00);
		contaComum.depositar(900.45);
		
		ContaPoupanca poupanca = new ContaPoupanca(6000.00);
		poupanca.depositar(500.00);
		
		System.out.println("Conta Comum");
		System.out.println(contaComum.getSaldo());
		
		System.out.println("Poupança");
		System.out.println(poupanca.getSaldo());
		
		poupanca.sacar(500.00);
		
		System.out.println("Poupança Sem Taxa");
		System.out.println(poupanca.getSaldo());
		
		poupanca.sacar(500.00, 0.90);
		
		System.out.println("Poupança Com Taxa");
		System.out.println(poupanca.getSaldo());
	}
}
