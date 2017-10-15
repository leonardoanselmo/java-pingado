
public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco();
		
		try {
			banco.realizarOperacao();
		} catch (ValorNegativoException e) {
			System.out.println("Você tentou sacar um valor negativo: "+e.getValor());			
		} catch (SaldoInsuficienteException e) {
			System.out.println("Você não tem saldo suficiente para sacar: "+e.getValor());
			System.out.println("O seu saldo é: "+e.getSaldo());			
		}

	}

}
