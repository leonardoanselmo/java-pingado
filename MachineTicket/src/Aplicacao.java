
public class Aplicacao {
	
	public static void main(String[] args) {
		
		TicketPress newTicket = new TicketPress(5);
		System.out.println(newTicket.getBalanco());
		newTicket.inserirDinheiro(15);
		System.out.println(newTicket.getBalanco());
		newTicket.imprimirTicket();
		newTicket.statusConta();		
		
	}

}
