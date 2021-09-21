package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(new Conta("Conta Corrente", 17000.00));
		contas.add(new Conta("Conta Poupança", 500.00));
		contas.add(new Conta("Conta Comum", 100.00));
		
		Conta conta;
		
		Iterator<Conta> iteratorConta = contas.iterator();
		
		while(iteratorConta.hasNext()) {
			conta = iteratorConta.next();
			System.out.println(conta.getTipoConta() + " | " + conta.getSaldo());
		}
	}
}
