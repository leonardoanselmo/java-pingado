
public class Quadrado implements AreaCalculavel {

	private double lado;
	
	public double getLado() {
		return lado;
	}
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {		
		return lado * lado;
	}

}
