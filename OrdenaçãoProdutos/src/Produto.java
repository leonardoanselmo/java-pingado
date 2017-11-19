
public class Produto implements Comparable<Produto>{
	
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public int compareTo(Produto p){
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		
		return valor1.compareTo(valor2);
	}
	
	@Override
	public String toString() {
		return "Produto: "+nome+" - Valor: "+valor;
	}

}
