
public class Quadrado {
	
	private double lado;
	
	public double getLado(){
		return this.lado;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public double calcularArea(){
		return (this.lado * this.lado);
	}

}
