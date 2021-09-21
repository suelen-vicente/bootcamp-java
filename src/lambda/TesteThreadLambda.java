package lambda;

public class TesteThreadLambda {
	public static void main(String[] args) {
		
		Runnable r2 = () -> System.out.println("Thread com lambda");
		new Thread(r2).start();
	}
}
