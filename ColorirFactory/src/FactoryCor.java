
public class FactoryCor {
	
	public Cor getCor(String nomeDaCor){
		switch (nomeDaCor) {
		case "verde":
			return new Verde();
			
		case "vermelho":
			return new Vermelho();
			
		case "azul":
			return new Azul();			

		default:
			return null;
		}
	}

}
