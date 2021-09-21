package stream;

import java.util.ArrayList;
import java.util.List;

public class TesteStreamFilter {
	
	public static void main(String[] args) {
		
		List<String> tiposConta = new ArrayList<String>();
		
		tiposConta.add("Conta Corrente");
		tiposConta.add("Conta Poupança");
		tiposConta.add("Conta Comum");
		
		tiposConta.stream().forEach(conta -> conta.equals("Conta Comum"));
		
	}
}
