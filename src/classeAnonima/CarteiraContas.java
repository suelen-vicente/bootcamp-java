package classeAnonima;

public class CarteiraContas {
	
	Conta contaCorrente = new Conta() {
		public void imprimeTipoConta() {
			System.out.println("Conta Corrente");
		}
	};
	
	Conta poupanca = new Conta() {
		public void imprimeTipoConta() {
			System.out.println("Conta Poupança");
		}
	};

}
