/**
 * 
 * @author Leonardo Anselmo
 *
 */
public class Endereco {
	
	private String rua;
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String listarEndereco(){
		return ("Endereço: "+getRua()+", "+getNumero());
	}

}
