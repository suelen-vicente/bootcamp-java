package localDate;

import java.time.LocalDate;

public class ExemploLocalDateTime {
	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		System.out.println("Dia da semana: " + data.getDayOfWeek().name());
		System.out.println("Dia da semana: " + data.getDayOfWeek().ordinal());
		System.out.println("Mes: " + data.getMonthValue());
		System.out.println("Mes: " + data.getMonth().name());
		System.out.println("Ano: " + data.getYear());
		
	}

}
