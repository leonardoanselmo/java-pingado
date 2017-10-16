
public class Aplicacao {

	public static void main(String[] args) {
		
		Object o = null;
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("O metódo está sendo chamado por um objeto nulo.");
		}
		
		System.out.println("Fim do método.");		

	}

}
