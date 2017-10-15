
public class Banco {
	
	public void realizarOperacao() throws BancoException{
		
		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(2100);
			System.out.println("O saque ocorreu com sucesso.");			
			System.out.println(c.getSaldo());
			
		} catch (ValorNegativoException e) {
			throw new BancoException("Erro de saque: valor negativo", e);
		} catch (SaldoInsuficienteException e) {
			throw new BancoException("Erro de saque: valor insuficiente", e);
		}
		
		
	}

}
