
public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public double getBaseMaior(){
		return this.baseMaior;
	}
	
	public void setBaseMaior(double baseMaior){
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMenor(){
		return this.baseMenor;
	}
	
	public void setBaseMenor(double baseMenor){
		this.baseMenor = baseMenor;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double calcularArea(){
		return ((baseMaior + baseMenor)/2) * altura;
	}
	
	
}
