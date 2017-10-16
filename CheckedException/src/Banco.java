
public class Banco {
	
	public void realizarOperacao() throws BancoException{
		
		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(-300);
			System.out.println("O saque ocorreu com sucesso.");						
		} catch (ValorNegativoException e) {
			throw new BancoException("Erro de saque: valor negativo", e);
		} catch (SaldoInsuficienteException e) {
			throw new BancoException("Erro de saque: valor insuficiente", e);
		} finally {
			System.out.println("Saldo é: "+c.getSaldo());
		}
		
		
	}

}
