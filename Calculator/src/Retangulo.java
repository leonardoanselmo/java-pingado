
public class Retangulo extends Figura{

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return base * altura;
	}
	
}
