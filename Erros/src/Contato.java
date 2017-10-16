
public abstract class Contato {
	
	private String nome;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco(); // lazy load
		}
		
		return endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
