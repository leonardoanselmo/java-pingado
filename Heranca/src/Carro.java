
public class Carro extends Veiculo {

	private boolean quatroPortas;
	
	public boolean isQuatroPortas(){
		return quatroPortas;
	}
	
	public void setQuatroPortas(boolean quatroPortas){
		this.quatroPortas = quatroPortas;
	}
	
	@Override
	public void imprimirDados() {	
		super.imprimirDados();
		if (quatroPortas) {
			System.out.println("Tem 4 portas.");
		} else {
			System.out.println("Não tem 4 portas.");
		}
		
	}
	
}
