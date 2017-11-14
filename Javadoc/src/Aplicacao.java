
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("Leonardo Anselmo", "leonardo_anselmo@hotmail.com");
		contato.definirEndereco("Av. Pedro Cavalcante", 223);
		
		System.out.println(contato);
		
	}

}
