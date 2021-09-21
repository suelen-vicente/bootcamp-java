package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListComComparador {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		ComparaConta comparadorContas = new ComparaConta();
		
		contas.add(new Conta("Conta Corrente", 10000.00));
		contas.add(new Conta("Conta Corrente", 200.00));
		contas.add(new Conta("Conta Poupança", 500.00));
		contas.add(new Conta("Conta Comum", 100.00));
		
		System.out.println("Antes da Ordenação: ");
		contas.forEach(conta -> System.out.println(conta.getTipoConta()));
		
		Collections.sort(contas, comparadorContas);
		
		System.out.println();
		System.out.println("Depois da Ordenação: ");
		contas.forEach(conta -> System.out.println(conta.getTipoConta()));
	}
}
