package lambda;

public class TesteThreadComum {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread teste");
				
			}
		};
		
		new Thread(r).start();
	}

}
