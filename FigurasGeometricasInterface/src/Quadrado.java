
public class Quadrado implements Figura{
	
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
		
	@Override
	public double calcularArea() {		
		return (lado * lado);
	}

}
