package lambda;

import java.util.Arrays;
import java.util.List;

public class TesteListComum {
	public static void main(String[] args) {
		System.out.println("Imprime todos os elementos da lista.");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		
		for(Integer n: lista) {
			System.out.println(n);
		}
	}

}
