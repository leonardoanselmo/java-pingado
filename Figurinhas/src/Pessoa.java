
public class Pessoa {

	private String nome;
	private int numFigurinhas;
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumFigurinhas() {
		return numFigurinhas;
	}

	public void setNumFigurinhas(int numFigurinhas) {
		this.numFigurinhas = numFigurinhas;
	}

	public void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	public void dar(int numFigurinhas, Pessoa p){
		this.numFigurinhas -= numFigurinhas;	
		p.receber(numFigurinhas);		
	}
	
}
