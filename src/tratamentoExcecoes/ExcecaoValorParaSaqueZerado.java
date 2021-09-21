package tratamentoExcecoes;

public class ExcecaoValorParaSaqueZerado extends Exception{
	
	@Override
	public String getMessage() {
		return "Valor para saque não pode ser zero.";
	}

}
