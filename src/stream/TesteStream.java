package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteStream {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		Stream<String> stream = lista.stream();
		
	}
}
