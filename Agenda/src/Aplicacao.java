
public class Aplicacao {

	public static void main(String[] args) {
		
		Contato objContato = new Contato();
		
		objContato.setNome("Leonardo Anselmo");
		objContato.setFone("(89) 9999-9988");
		objContato.setEmail("leonardo_anselmo@hotmail.com");
		
		System.out.println(objContato); // Imprimindo a referencia do objeto no HEAP.

	}

}
