package plugueinformatica.com.br;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {
		
		String dataNascimento = "09/07/1979 15:45";
		
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Quantas horas de vida eu tenho: " + d.toHours());
		System.out.println("Quantos dias de vida eu tenho: " + d.toDays());
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Quantos meses de vida eu tenho: "+ p.toTotalMonths());
		
		System.out.println("Quantos anos eu tenho: "+ChronoUnit.YEARS.between(d1, d2));

	}

}
