
public class Lampada {
	
	private boolean lampada;
	
	public Lampada(boolean lampada){
		this.lampada = lampada;
	}
		
	public boolean ligar(){
		return lampada = true;
	}
	
	public boolean desligar(){
		return lampada = false;
	}
	
	public void imprimir(){
		if(lampada == true){
			System.out.println("A lampada está ligada.");
		} else {
			System.out.println("A lampada está desligada.");
		}
	}

}
