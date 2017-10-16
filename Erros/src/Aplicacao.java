
public class Aplicacao {

	public static void main(String[] args) {
	
		ContatoPF c1 = new ContatoPF();
		c1.setNome("José");
		c1.setCpf("031.456.234-78");
		
		//c1.setEndereco(new Endereco());
		
		c1.getEndereco().setRua("Av. Pedro Cavalcante");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Ribeirão");
		c1.getEndereco().setEstado("RJ");
		
		System.out.println("Contato definido.");
		
	}

}
