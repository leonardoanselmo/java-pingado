
public class Aplicacao {

	public static void main(String[] args) {
		
		//Animal a = new Cachorro();
		//if (a instanceof Cachorro) {
		//	Cachorro c = (Cachorro) a;
		//	c.morder();
		//}
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);

	}
	
	private static void falar(Animal a){
		a.falar();
	}
	
	private static void morder(Animal a){
		//a.morder(); // Não pode chamar esse método, pois não existe na classe Animal.
					// e o método morder recebe um parametro de Animal.
	}

}
