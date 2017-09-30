
public class Circulo {
	
	private double raio;
	
	public double getRaio(){
		return this.raio;
	}
	
	public void setRaio(double raio){
		this.raio = raio;
	}
	
	public double calcularArea(){
		return ((Math.PI) * (raio * raio));
	}

}
