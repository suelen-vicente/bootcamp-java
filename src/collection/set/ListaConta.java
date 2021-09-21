package collection.set;

import java.util.HashSet;
import java.util.Set;

public class ListaConta {
	public static void main(String[] args) {
		Set<Conta> contas = new HashSet<Conta>();
		
		Conta contaCorrente1 = new Conta("Conta Corrente", 100.00);
		Conta contaCorrente2 = new Conta("Conta Corrente", 200.00);
		Conta contaPoupanca = new Conta("Conta Poupança", 500.00);
		Conta contaComum = new Conta("Conta Comum", 100.00);
		
		contas.add(contaCorrente1);
		contas.add(contaCorrente2);
		contas.add(contaPoupanca);
		contas.add(contaComum);
		
		System.out.println(contas);
	}
}
