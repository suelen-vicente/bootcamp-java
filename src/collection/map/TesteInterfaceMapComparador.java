package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteInterfaceMapComparador {
	
	public static void main(String[] args) {
		Map<Integer, String> mapaContas = new HashMap<Integer, String>();
		
		mapaContas.put(1, "Conta Corrente");
		mapaContas.put(2, "Conta Poupança");
		mapaContas.put(3, "Conta Comum");
		
		ComparadorIntsMap comparador = new ComparadorIntsMap(mapaContas);
		
		Map<Integer, String> mapaContasOrdenadas = new TreeMap(comparador);
		mapaContasOrdenadas.putAll(mapaContas);
		
		for (Integer indice : mapaContasOrdenadas.keySet()) {
			System.out.println(indice + " " + mapaContas.get(indice));
		}
		
	}
}
