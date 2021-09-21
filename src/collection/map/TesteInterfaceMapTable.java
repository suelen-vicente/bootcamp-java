package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteInterfaceMapTable {
	
	public static void main(String[] args) {
		Map<Integer, Conta> mapaContas = new HashMap<Integer, Conta>();
		
		mapaContas.put(1, new Conta("Conta Corrente", 2000.00));
		mapaContas.put(2, new Conta("Conta Poupança", 6000.00));
		mapaContas.put(3, new Conta("Conta Comum", 900.00));
		
		for (Integer indice : mapaContas.keySet()) {
			System.out.println(mapaContas.get(indice));
		}
		
	}
}
