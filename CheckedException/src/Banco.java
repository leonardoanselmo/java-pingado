
public class Banco {
	
	public void realizarOperacao() throws ValorNegativoException, SaldoInsuficienteException{
		
		ContaBancaria c = new ContaBancaria(1000);
		
		c.sacar(2100);
		System.out.println("O saque ocorreu com sucesso.");
		
		System.out.println(c.getSaldo());
		
	}

}
