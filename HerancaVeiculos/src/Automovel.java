
public class Automovel extends Veiculo {
			
	@Override
	public void ligar() {
		super.ligar();
		System.out.println("O Automóvel está ligado.");
	}
	
	@Override
	public void desligar() {
		super.desligar();
		System.out.println("O Automóvel está desligado.");
	}

}
