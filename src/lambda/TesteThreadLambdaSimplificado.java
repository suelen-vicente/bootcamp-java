package lambda;

public class TesteThreadLambdaSimplificado {
	public static void main(String[] args) {
		
		new Thread(
				() -> System.out.println("Thread com lambda 2")
		).start();
	}

}
