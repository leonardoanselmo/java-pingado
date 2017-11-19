import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		TicketPress newTicket = new TicketPress(5);
		System.out.println(newTicket.getBalanco());
		newTicket.inserirDinheiro(15);
		System.out.println(newTicket.getBalanco());
		newTicket.imprimirTicket();
		newTicket.statusConta();
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Leonardo Anselmo");
		nomes.add("Patricia Anselmo");
		
		nomes.remove(1);
		
		for (String nome : nomes) {
			System.out.println("Contato: " + nome);
		}
		
	}

}
