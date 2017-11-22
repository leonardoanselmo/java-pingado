
public class FactoryCorTest {

	public static void main(String[] args) {
		
		FactoryCor factory = new FactoryCor();
		Cor corEscolhida;
		
		corEscolhida = factory.getCor("azul");
		corEscolhida.colorir();
		
		corEscolhida = factory.getCor("vermelho");
		corEscolhida.colorir();
		
		corEscolhida = factory.getCor("verde");
		corEscolhida.colorir();		

	}

}
