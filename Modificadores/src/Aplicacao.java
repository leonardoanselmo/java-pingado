
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(54334);
		c.setAtiva(true);
		c.depositar(5000);		
		c.sacar(3000);
				
		System.out.println("O saldo atual é: "+c.getSaldo());

	}

}
