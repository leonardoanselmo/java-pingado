package plugueinformatica.com.br;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aplicacao {

	public static void main(String[] args) {
		
		String dataNascimento = "09/07/1979 15:45";
		
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		Duration d = Duration.between(d1, d2);
		
		System.out.println("Quantas horas de vida eu tenho: " + d.toHours());
		System.out.println("Quantos dias de vida eu tenho: " + d.toDays());		

	}

}
