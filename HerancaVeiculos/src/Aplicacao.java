
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Automovel carro = new Automovel();
		carro.ligar();
		System.out.println(carro.isLigado());
		carro.desligar();
		System.out.println(carro.isLigado());
		
		Motocicleta moto = new Motocicleta();
		moto.ligar();
		System.out.println(moto.isLigado());
		moto.desligar();
		System.out.println(moto.isLigado());
		
	}

}
