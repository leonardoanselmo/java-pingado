package plugueinformatica.numero;

import plugueinformatica.util.ConsoleUtils;
import plugueinformatica.util.RandomUtils;

public class Jogo {
	
	public static void main(String[] args) {
		
		int number = RandomUtils.nextInt(0,50);
		
		int guess, contador = 0;
		
		do {
			System.out.println("Adivinhe o número: entre 0 e 50.");
			guess = ConsoleUtils.readInt();
			
			if (guess > number) {
				System.out.println("O valor é menor.");
			} else if (guess < number) {
				System.out.println("O valor é maior");
			}
			contador++;
		} while (guess != number);
		
		System.out.println("Você acertou em "+contador+" tentativas!"+" Parabéns !!! O valor era "+number+". Fim de jogo!");
		
	}

}
