import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {

		String s1 = new String("abc");
		System.out.println(s1);
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.printf(">%7d<\n>%7s<", 2000, "abc");
		System.out.println("");
		
		Locale l = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		String s = nf.format(1000.5);
		System.out.println(s);
		
		Locale l1 = new Locale("it", "IT");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(l1);
		String s2 = nf1.format(1000.5);
		System.out.println(s2);
		
		Date d = new Date();
		System.out.println(d.toString());
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual.toString());
		
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.parse("1979-07-09");
		
		Period p = Period.between(d2, d1);
		long years = ChronoUnit.YEARS.between(d2, d1);
		long meses = ChronoUnit.MONTHS.between(d2, d1);
		long dias = ChronoUnit.DAYS.between(d2, d1);
		System.out.println(years + " - " + meses + " - " + dias);
		
		Instant start = Instant.now();
		for (long i = 0; i < 1000000000; i++) {
			System.out.println(i);
		}
		Instant end = Instant.now();
		Duration tempoSec = Duration.between(start, end);
		long seconds = tempoSec.getSeconds();
		System.out.println("Duração: "+seconds);
		
		

	}

}
