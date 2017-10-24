import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Aplicacao {
	
	public static void main(String[] args){
		tempoDeVida();
		duracaoDesde3hsMadruga();
	}
	
	private static void tempoDeVida(){
		
		LocalDate aniversario = LocalDate.parse("1979-07-09");
		LocalDate niverPaty   = LocalDate.parse("1979-05-08");
		LocalDate hoje = LocalDate.now();
		
		Period periodo = Period.between(aniversario, hoje);
		Period perPaty = Period.between(niverPaty, hoje);
		
		System.out.println(String.format("%d anos, %d meses, %d dias", periodo.getYears(), periodo.getMonths(), 
				periodo.getDays()));
		
		System.out.println(String.format("%d anos, %d meses, %d dias", perPaty.getYears(), perPaty.getMonths(), 
				perPaty.getDays()));		
		
	}
	
	private static void duracaoDesde3hsMadruga(){ 
		
		LocalTime horarioMadruga = LocalTime.parse("03:00");
		
		LocalTime agora = LocalTime.now();
		
		Duration duracao = Duration.between(horarioMadruga, agora);
		
		System.out.println(String.format("Segundos: %d", duracao.getSeconds()));
		
	}

}
