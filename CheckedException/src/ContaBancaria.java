
public class ContaBancaria {
	
	private double saldo;
	
	public ContaBancaria(double saldo){
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor){
		
		if (valor < 0) {
			return false;
		}
		
		if (saldo - valor < 0) {
			return false;
		}
				
		this.saldo -= valor;
		
		return true;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
