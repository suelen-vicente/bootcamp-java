package stream;

import java.util.ArrayList;
import java.util.List;

public class TesteStreamCadeiaOperacoes {
	
	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(new Conta("Conta Corrente", 100.00));
		contas.add(new Conta("Conta Poupança", 200.00));
		contas.add(new Conta("Conta Comum", 300.00));
		contas.add(new Conta("Conta Comum", 400.00));
		
		Double saldo = contas.stream()
			.filter(pessoa -> pessoa.getTipoConta()
			.equals("Conta Comum"))
			.mapToDouble(pessoa -> pessoa.getSaldo())
			.average()
			.getAsDouble();
		
		System.out.println(saldo);
		
	}
}
