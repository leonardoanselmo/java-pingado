
public class TicketPress {
	
	private double preco;
	private double conta;	
	
	public TicketPress(int preco){
		this.preco = preco;
		this.conta = 0;		
	}
	
	public void inserirDinheiro(int valor){
		conta += valor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getBalanco() {
		return conta;
	}
	
	public void imprimirTicket(){
		if (conta >= preco) {
			System.out.println("Ticket de Embarque");
			System.out.println("==================");
			System.out.println();
			System.out.println("Ticket emitido: ");
			System.out.println("Preço do Ticket: "+preco);
			
			conta -= preco;
			
		} else{
			System.out.println("Saldo insuficiente para comprar ticket.");
		}			
	}
	
	public void statusConta(){
		System.out.println("Total da Conta: "+getBalanco());
	}

}
