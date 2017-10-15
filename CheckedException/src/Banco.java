
public class Banco {
	
	public void realizarOperacao(){
		
		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(100);
			System.out.println("O saque ocorreu com sucesso.");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no saque: "+e.getMessage());			
		}		
		
		System.out.println(c.getSaldo());
		
	}

}
