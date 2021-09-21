package interfaceFuncional;

public class TesteInterfaceFuncional {
	public static void main(String[] args) {
		ContaInterfaceFuncional conta = valor -> System.out.println("Saldo: " + valor);
		
		conta.exibe(100.00);
		
		ContaInterfaceFuncional contaDevedora = valor -> System.out.println("Você deve: " + valor);
		
		contaDevedora.exibe(200.00);
	}
}
