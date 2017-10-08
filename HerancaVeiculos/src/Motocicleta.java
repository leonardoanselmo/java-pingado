
public class Motocicleta extends Veiculo {
	
	@Override
	public void ligar() {
		super.ligar();
		System.out.println("A Motocicleta está ligada.");
	}
	
	@Override
	public void desligar() {	
		super.desligar();
		System.out.println("A Motocicleta está desligada.");		
	}

}
