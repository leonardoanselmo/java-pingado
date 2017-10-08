
public class Aplicacao {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		Porsche p = new Porsche();
		
		f.derrapar();
		p.derrapar();
		
		f.pontoMorto("Ferrari");
		p.pontoMorto("Porsche");
				
		System.out.println("Velocidade máxima: "+Automovel.getVelocidadeMaxima());

	}

}
