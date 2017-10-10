
public class Aplicacao {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(1000);
		c1.sacar(200);
		
		
		System.out.println("O saldo da ContaCorrente é: "+c1.saldo);
		System.out.println("O saldo da ContaCorrente é: "+c1.calcularSaldo());
		System.out.println("O saldo da ContaCorrente é: "+c1.saldo);
		
		ContaBancaria c2 = new ContaInvestimento();
		c2.depositar(500);
		c2.sacar(100);
		
		System.out.println("O saldo da ContaInvestimento é: "+c2.saldo);
		System.out.println("O saldo da ContaCorrente é: "+c2.calcularSaldo());
		
		c2.transferir(300, c1);
		
		System.out.println("O saldo da ContaCorrente é: "+c1.saldo);
		System.out.println("O saldo da ContaInvestimento é: "+c2.saldo);		

	}

}
