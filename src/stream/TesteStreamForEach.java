package stream;

import java.util.ArrayList;
import java.util.List;

public class TesteStreamForEach {
	
	public static void main(String[] args) {
		
		List<String> tiposConta = new ArrayList<String>();
		
		tiposConta.add("Conta Corrente");
		tiposConta.add("Conta Poupança");
		
		tiposConta.stream().forEach(conta -> System.out.println(conta));
		
	}
}
