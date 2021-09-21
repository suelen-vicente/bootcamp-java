package optional;

import java.util.Optional;

public class ExemploOptional {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(600.00);
		conta.setTipoConta("Conta Corente");
		
		Optional contaOpcional = Optional.ofNullable(conta);
		
		contaOpcional.ifPresent(n -> System.out.println(n));
	}
}
