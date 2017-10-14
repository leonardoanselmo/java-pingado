
public class Aplicacao {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(100);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no saque: "+e.getMessage());			
		}		
		
		System.out.println(c.getSaldo());

	}

}
